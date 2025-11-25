
package biblioteca.simple.modelo;

import biblioteca.simple.contratos.Prestable;

// Clase que representa un videojuego en la biblioteca
public class Videojuego extends Producto implements Prestable {
    // Atributos propios de Videojuego
    private String plataforma; // Ejemplo: PS5, PC, Switch, XBOX
    private String genero;     // Ejemplo: shooter, lucha, plataforma, aventura

    // Control del estado de préstamo
    private boolean prestado = false;
    private Usuario prestadoA;

    // Constructor para objetos ya existentes (con id)
    public Videojuego(int id, String titulo, String anho, Formato formato, String plataforma, String genero) {
        super(id, titulo, anho, formato);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    // Constructor para crear nuevos videojuegos (sin id inicial)
    public Videojuego(String titulo, String anho, Formato formato, String plataforma, String genero) {
        super(titulo, anho, formato);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    // Getters
    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    // Métodos de la interfaz Prestable
    @Override
    public void prestar(Usuario u) {
        if (prestado) throw new IllegalStateException("Ya prestado");
        this.prestado = true;
        this.prestadoA = u;
    }

    @Override
    public void devolver() {
        this.prestado = false;
        this.prestadoA = null;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anho='" + anho + '\'' +
                ", formato=" + formato +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}

