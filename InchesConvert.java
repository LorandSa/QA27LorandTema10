import java.util.Scanner;

public class InchesConvert {

    public double InchConvert ()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti valoarea in inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " in INCH este " + meters + " metrii");
        return meters;
    }


}