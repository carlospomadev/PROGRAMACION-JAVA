package biblioteca.simple.app;

import biblioteca.simple.contratos.Prestable;
import biblioteca.simple.modelo.*;
import biblioteca.simple.servicios.Catalogo;
import biblioteca.simple.servicios.PersistenciaUsuarios;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    private static final Catalogo catalogo = new Catalogo();

    private static final List<Usuario> usuarios =new ArrayList<>();


    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        cargarDatos();
        menu();
    }

    private static void cargarDatos(){
        catalogo.alta(new Libro(1, "El Quijote", "1608", Formato.FISICO, "25225", "Cervantes"));
        catalogo.alta(new Libro(2, "El nombre del viento", "2007", Formato.FISICO, "9788401352836", "Patrick Rothfuss"));
        catalogo.alta(new Pelicula(3, "El Padrino", "1972", Formato.FISICO, "Francis Ford Coppola", 175));
        catalogo.alta(new Pelicula(4, "Parásitos", "2019", Formato.FISICO, "Bong Joon-ho", 132));
        catalogo.alta(new Videojuego(5, "The Legend of Zelda: Breath of the Wild", "2017", Formato.FISICO, "Switch", "aventura"));
        catalogo.alta(new Videojuego(6, "God of War", "2018", Formato.FISICO, "PS5", "aventura"));
        catalogo.alta(new Videojuego(7, "Street Fighter V", "2016", Formato.DIGITAL, "PC", "lucha"));

        usuarios.add(new Usuario(1, "Juan"));
        usuarios.add(new Usuario(2, "María"));

    }

    private static void menu(){


int op;
    do {
        System.out.println("\n===Menú de Biblioteca===");
        System.out.println("1. Listar");
        System.out.println("2. Buscar por título");
        System.out.println("3. Buscar por año");
        System.out.println("4. Prestar Producto");
        System.out.println("5. Devolver Producto");
        System.out.println("6. Crear usuario"); // <-- NUEVA OPCIÓN CREACIÓN DE USUARIO
        System.out.println("7. Exportar usuarios"); // <-- NUEVA FUNCIÓN EXPORTA JSON"
        System.out.println("8. Importar usuarios"); // <-- NUEVA FUNCIÓN IMPORTA JSON"
        System.out.println("0. Salir");

        while(!sc.hasNextInt()) sc.next();
        op = sc.nextInt();
        sc.nextLine();

        switch (op){
            case 1 -> listar();
            case 2 -> buscarPorTitulo();
            case 3 -> buscarPorAnio();
            case 4 -> prestar();
            case 5 -> devolver();
            case 6 -> crearUsuarioManual(); // <-- NUEVO OPCION
            case 7 -> exportarUsuarios(); // <-- NUEVA FUNCION
            case 8 -> importarUsuarios(); // <-- NUEVA FUNCION
            case 0 -> System.out.println("Sayonara!");
            default -> System.out.println("Opción no válida");
        }
    } while(op != 0);
}


    private static void listar() {
        List<Producto> lista = catalogo.listar();

        if (lista.isEmpty()) {
            System.out.println("Catálogo vacío");
            return;
        }

        System.out.println("==Lista de productos ===");
        for (Producto p : lista) {
            System.out.println("- " + p);
        }
    // Nueva línea para pausar y esperar que el usuario decida regresar
    System.out.println("\nPresiona ENTER para regresar al menú...");
    sc.nextLine(); // Espera a que el usuario presione ENTER
    }

    private static void buscarPorTitulo(){
        System.out.println("Título (escribe parte del título): ");
        String t = sc.nextLine();
        catalogo.buscar(t).forEach(p -> System.out.println("- " + p));

        // Nueva línea para pausar y esperar que el usuario decida regresar
    System.out.println("\nPresiona ENTER para regresar al menú...");
    sc.nextLine(); // Espera a que el usuario presione ENTER
    }

    private static void buscarPorAnio(){
        System.out.println("Año: ");
        int a = sc.nextInt();
        sc.nextLine();
        catalogo.buscar(a).forEach(p -> System.out.println("- " + p));

        // Nueva línea para pausar y esperar que el usuario decida regresar
        System.out.println("\nPresiona ENTER para regresar al menú...");
        sc.nextLine(); // Espera a que el usuario presione ENTER
    }

    private static void listarUsuarios(){
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
            return;
        }
        System.out.println("Lista usuarios");
        usuarios.forEach( u ->
                        System.out.println("- Código : " + u.getId() + "| Nombre: " + u.getNombre() )
        );

    }

    private static Usuario getUsuarioPorCodigo(int id){
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private static void prestar(){

        // 1)mostrar productos disponibles

        List<Producto> disponibles = catalogo.listar().stream()
                .filter(p -> p instanceof Prestable pN && !pN.estaPrestado())
                .collect(Collectors.toList());

        if ( disponibles.isEmpty() ) {
            System.out.println("No hay productos para prestar");
            return;
        }

        System.out.println("-- PRODUCTOS DISPONIBLES --");
        disponibles.forEach( p -> System.out.println("- ID: " + p.getId() + " | " + p));

        System.out.println("Escribe el id del producto: ");
        while(!sc.hasNextInt()) sc.next();
        int id = sc.nextInt();
        sc.nextLine();

        Producto pEncontrado = disponibles.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElse(null);

        if (pEncontrado == null){
        System.out.println("El id no existe");
        return;
        }

    // 2) Selección / creación de usuario en el mismo flujo
        listarUsuarios();


        System.out.println("Ingresa código de usuario:");
        while(!sc.hasNextInt()) sc.next();
        int cUsuario = sc.nextInt();
        sc.nextLine();

        Usuario u1 = getUsuarioPorCodigo(cUsuario);
        if (u1 == null) {
            System.out.println("Usuario no encontrado. ¿Deseas crearlo ahora? (s/n)");
            String resp = sc.nextLine().trim().toLowerCase();
            if (resp.startsWith("s")) {
                u1 = crearUsuarioEnFlujo(cUsuario);
                if (u1 == null) {
                    System.out.println("No se pudo crear el usuario. Operación cancelada.");
                    return;
                }
            System.out.println("Usuario creado. Continuando con el préstamo...");
            } else {
                System.out.println("Operación cancelada.");
            return;
        }
    }


        // 3) Realizar préstamo
        Prestable pPrestable = (Prestable) pEncontrado;
        pPrestable.prestar(u1);
        System.out.println("Prestado correctamente a " + u1.getNombre());


    }


    public static void devolver(){


        List<Producto> pPrestados = catalogo.listar().stream()
                .filter(p -> p instanceof Prestable pN && pN.estaPrestado())
                .collect(Collectors.toList());

        if ( pPrestados.isEmpty() ) {
            System.out.println("No hay productos para prestar");
            return;
        }

        System.out.println("-- PRODUCTOS PRESTADOS --");
        pPrestados.forEach( p -> System.out.println("- ID: " + p.getId() + " | " + p));

        System.out.println("Escribe el id del producto: ");
        int id = sc.nextInt();
        sc.nextLine();

        Producto pEncontrado = pPrestados.stream()
                .filter(p -> {
                    try {
                        return p.getId() == id;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })

                .findFirst()
                .orElse(null);

        if (pEncontrado == null){
            System.out.println("El id no existe");
            return;
        }

        Prestable pE = (Prestable) pEncontrado;
        pE.devolver();
        System.out.println("Devuelto correctamente");

    }

    private static void crearUsuarioManual() {

        System.out.println("== Crear usuario ==");
        System.out.print(" Introduce el Código (entero): ");
        while(!sc.hasNextInt()) sc.next();
        int id = sc.nextInt();
        sc.nextLine();

        if (getUsuarioPorCodigo(id) != null) {
            System.out.println("Ya existe un usuario con el código " + id);
            // Nueva línea para pausar y esperar que el usuario decida regresar
            System.out.println("\nPresiona ENTER para regresar al menú...");
            sc.nextLine(); // Espera a que el usuario presione ENTER
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) {
        System.out.println("El nombre no puede estar vacío.");
        return;
        }

        Usuario u = new Usuario(id, nombre);
        usuarios.add(u);
        System.out.println("Usuario creado: Código " + u.getId() + " - Nombre " + u.getNombre());
    }

    private static Usuario crearUsuarioEnFlujo(int idSugerido) {
        if (getUsuarioPorCodigo(idSugerido) != null) {
            // Si justo se creó en paralelo (poco probable en consola), devolvemos el existente
        return getUsuarioPorCodigo(idSugerido);
        }
        System.out.println("== Creación rápida de usuario ==");
        System.out.println("Código: " + idSugerido + " (usando el código introducido)");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
        return null;
        }
        Usuario u = new Usuario(idSugerido, nombre);
        usuarios.add(u);
        System.out.println("Usuario creado: Código " + u.getId() + " - Nombre " + u.getNombre());
        return u;
    }
    private static void exportarUsuarios(){
      try {
          PersistenciaUsuarios.exportar(usuarios);
          System.out.println("Usuarios exportados correctamente");
          // Nueva línea para pausar y esperar que el usuario decida regresar
            System.out.println("\nPresiona ENTER para regresar al menú...");
            sc.nextLine(); // Espera a que el usuario presione ENTER
      } catch (Exception e){
          System.out.println("Error al exportar usuarios" + e.getMessage());
          // Nueva línea para pausar y esperar que el usuario decida regresar
            System.out.println("\nPresiona ENTER para regresar al menú...");
            sc.nextLine(); // Espera a que el usuario presione ENTER
      }
    }
    private static void importarUsuarios(){
        try{
            List<Usuario> cargados = PersistenciaUsuarios.importar();
            usuarios.clear();
            usuarios.addAll(cargados);
            System.out.println("Usuarios cargados con éxito");
            System.out.println("\nPresiona ENTER para regresar al menú...");
            sc.nextLine();
        }catch (Exception e){
            System.out.println("Error al importar: " + e.getMessage());
            System.out.println("\nPresiona ENTER para regresar al menú...");
            sc.nextLine();
        }
    }
}