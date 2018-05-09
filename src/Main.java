import java.util.Scanner;

// Nie baw się z metodami itp przy prostych algorytmach,
// bo skupiasz się na podziale na metody, a nie bezpośrednio na danym algorytmie

// nie twórz zmiennych jeśli nie potrzeba - zobacz teraz warunek 
// dobrze, że używasz camelCase :)
// warunki, pętle, metody w taki sposób:

/*
public void method() {
    
}

nie taki:

public void method() 
{
    
}

ale to takie najdrobniejsze szczegóły :P

*/

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
