import java.util.Scanner;

public class TempConvert
{
    public double convert(double fah)
    {
        return (5.0/9.0) * (fah -32);
    }
    Scanner scanner = new Scanner(System.in);

    public void printconvert()

    {
        System.out.println("Introduceti temperatura in F:");
        double fah = scanner.nextDouble();
        System.out.println("In celsius este:" + convert(fah));

    }
}