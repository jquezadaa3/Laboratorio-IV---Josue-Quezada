class Material{
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }
}

class Libro extends Material {
    private int numeroPaginas;
    private String genero;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Libro | Género: " + genero + " | Páginas: " + numeroPaginas);
    }
}

class Revista extends Material {
    private int numeroEdicion;
    private String periodicidad; // Semanal, Mensual, etc.

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion, String periodicidad) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Revista | Edición #" + numeroEdicion + " | Periodicidad: " + periodicidad);
    }
}

public class MainBiblioteca {
    public static void main(String[] args) {
        Material[] materiales = new Material[2];
        materiales[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 471, "Novela");
        materiales[1] = new Revista("National Geographic", "Varios autores", 2024, 302, "Mensual");

        for (Material m : materiales) {
            m.mostrarInformacion();
            System.out.println("-----");
        }
    }
}
