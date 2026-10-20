public class libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    public libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void prestar (boolean disponible){
        if (disponible ) {
            disponible = false;
            System.out.println("Libro prestado");
        } else {
            System.out.println("ERROR, el libro no esta disponible");
            }
    }

    public void devolver (boolean disponible){
        if (disponible) {
            disponible = true;
            System.out.println("Libro devuelto");
        } 
    }

}
