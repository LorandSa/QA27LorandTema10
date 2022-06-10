import java.util.Scanner;

public class Media
{
    public double media(double a,double b,double c)
    {
        double med = (a+b+c)/3;
        return med;
    }
    Scanner scanner = new Scanner(System.in);

    public void printmedia()

    {
        System.out.println("Introduceti primul numar din medie:");
        double a = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar din medie:");
        double b = scanner.nextDouble();
        System.out.println("Introduceti al treilea numar din medie:");
        double c = scanner.nextDouble();
        System.out.println("Rezultatul este:" + media(a,b,c));

    }
}
