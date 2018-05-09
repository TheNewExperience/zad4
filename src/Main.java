import java.util.Scanner;

// Zwracaj uwagę na algorytmy - nie dziel prostego algorytmu na metody itd 

public class Main {

    public Main() {
        System.out.println("Wprowadz liczbe: ");
        Scanner scanner = new Scanner(System.in);

        if (Integer.parseInt(scanner.nextLine()) % 2 == 0) {
            System.out.println("Liczba parzysta!");
        } else {
            System.out.println("Liczba nieparzysta!");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
