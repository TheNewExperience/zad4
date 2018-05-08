import java.util.Scanner;

public class Main {





    public static void main(String[] args)
    {
        Main main= new Main();
        int i = main.numberToCheck();
        main.checkParity(i);

    }


    public Main()
    {

    }

    public int numberToCheck()
    {
        System.out.println("Wprowadz liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        return number;
    }


    public boolean checkParity(int numberToCheck)
    {

        boolean parityStatus;

        if((numberToCheck%=2) == 0)
        {
            parityStatus=true;
            System.out.println("Liczba parzysta!");
        }
        else
            {
                parityStatus=false;
                System.out.println("Liczba nieparzysta!");
            }

        return parityStatus;
    }
}
