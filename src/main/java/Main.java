import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Pajaro> pajaros = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n****MENU PRINCIPAL****");
            System.out.println("1.Gestión de clientes");
            System.out.println("2. Gestión de pájaros");
            System.out.println("3.Realizar Venta");
            System.out.println("4.Mostrar Ventas");
            System.out.println("5.Salir");
            opcion = sc.nextInt(); sc.nextLine();
        } while (opcion <1 || opcion >5);
        switch (opcion){
            case 1 -> gestionarClientes(sc);
            case 2 -> gestionpajaros(sc);
            case 3 -> realizarVentas(sc);
            case 4 -> mostrarventas(sc);
            case 5 -> System.out.println("Saliendo...");        }
    }
   static void gestionarClientes(Scanner sc){
       System.out.println("\n***Gestión de Clientes***");
       System.out.println("1.Alta");
       System.out.println("2.Baja");
       System.out.println("3.Modificación");
       System.out.println("4.Listado");
       System.out.println("Elige opción");
       int opc = sc.nextInt();sc.nextLine();

       switch (opc){
           case 1 ->{
               System.out.println("Nombre:");
               String nombre = sc.nextLine();
               System.out.println("DNI:");
               String dni = sc.nextLine();
               System.out.println("Teléfono:");
               String telefono = sc.nextLine();
               System.out.println("Email:");
               String email = sc.nextLine();
               clientes.add(new Cliente(nombre,dni,telefono,email));
           }
           case 2 ->{
               listarClientes();
               System.out.println("Posición a modificar: ");
               int pos = sc.nextInt();
               if (pos>=0 && pos<clientes.size()) clientes.remove(pos);
           }
           case 3 ->{
               listarClientes();
               System.out.println("Posición a modificar: ");
               int pos = sc.nextInt(); sc.nextLine();
               if (pos > 0 && pos < clientes.size()){
                   Cliente cambioNombre = clientes.get(pos);
                   System.out.println("Nuevo nombre: ");
                   cambioNombre.setNombre(sc.nextLine());
               }
           }
           case 4 -> ListarClientes();

       }

    }
    static void gestionpajaros(Scanner sc){
        if (opc == 1) {
            System.out.println("Especie: ");
            String especie = sc.nextLine();
            System.out.println("Color: ");
            String color = sc.nextLine();
            System.out.println("Precio: ");
            double precio = sc.nextDouble();
            pajaros.add(new Pajaro(especie,color,precio));
        }else if ( opc == 2){
            listarPajaros
        }
    }
    static void realizarVentas(Scanner sc){
        if(clientes.isEmpty()) || pajaros.isEmpty(){
            System.out.println("Erro. Primero registra clientes y pajaros.");
        return;
        }
        System.out.println("Seleccionar cliente: ");
        listarClientes();
        int posCliente = sc.nextInt(); sc.nextLine();
        if(posCliente < 0 || posCliente >= clientes.size()) return;
        Cliente clienteseleccionado = clientes.get(posCliente);
        Venta venta = new Venta(clienteseleccionado);

        boolean seguir = true;
        while (seguir){
            System.out.println("Selecciona pajaro para añadir");
            listarPajaros();
            int posPajaro = sc.nextInt(); sc.nextLine();
            if (posPajaro >= 0 && posPajaro<pajaros.size()){
                venta.añadirPajaro(pajaros.get(posPajaro));
            }
            System.out.println("¿Añadir otro? (s/n): ");
            seguir = sc.nextLine().equalsIgnoreCase("s"):
        }
        ventas.add(venta);
        System.out.println("Venta registrada");
    }
    static void mostrarventas(){
        System.out.println("\n***Ventas registradas***");
        for (Venta v : ventas){
            v.mostrarInfo();
        }
    }
    static void listarClientes(){
        for (int i = 0; i < clientes.size(); i++){
            System.out.println(i+"." + clientes.get(i).getNombre());
        }
    }
    static void listarPajaros(){
        for (int i = 0; i<pajaros.size();i++){
            System.out.println(i+"." + pajaros.get(i).getEspecie() + " - " + pajaros.get(i));
        }
    }

}