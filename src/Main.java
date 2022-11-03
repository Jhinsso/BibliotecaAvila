import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Genre genre= new Genre();
        System.out.println("Introduce un genero:");
        genre.setId(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un genero");
        genre.setName(scanner.next());

        System.out.println("Introduce una descripcion del genero");
        genre.setDescription(scanner.next());
    }
}