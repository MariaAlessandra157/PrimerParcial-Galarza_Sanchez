import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();

        libro Libro = new libro(titulo, autor);
        System.out.println("Libro registrado correctamente.");

        Libro.prestar(true);
        Libro.prestar(false);

        Libro.devolver(true);

        System.out.print("Ingrese el titulo del libro: ");
        String titulo2 = sc.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor2 = sc.nextLine();

        libro Libro2 = new libro(titulo2, autor2);
        System.out.println("Libro registrado correctamente.");
        Libro2.prestar(true);
        Libro2.prestar(false);

        Libro2.devolver(true);
        sc.close();
    }
}
