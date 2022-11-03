import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner;
        System.out.println("Hello world!");
        Genre genre= new Genre();
        System.out.println("Introduce un genero:");
        genre.setId(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un genero");
        genre.setName(scanner.next());
    }
}