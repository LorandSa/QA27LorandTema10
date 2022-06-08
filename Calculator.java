import java.util.Scanner;

public class Calculator
{
    public int sum(int a,int b)
    {
        return a+b;
    }

    Scanner mycalc = new Scanner(System.in);

    public int minus(int x, int y)
    {
        return x-y;
    }

    public void CalcSum()
    {
        System.out.println("Introduceti primul numar din suma:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din suma:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+sum(firstNumber,secondNumber));
    }

    public void CalcMinus()
    {
        System.out.println("Introduceti primul numar din scadere:");
        int firstNumber = mycalc.nextInt();

        System.out.println("Introduceti al doilea numar din scadere:");
        int secondNumber = mycalc.nextInt();

        System.out.println("Rezultatul este:"+minus(firstNumber,secondNumber));
    }

}
