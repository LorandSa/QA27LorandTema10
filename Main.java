import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Calculator suma = new Calculator();
        suma.CalcSum();
        suma.CalcMinus();

        Tree copac = new Tree();
        copac.printtree();

        TempConvert conversie = new TempConvert();
        conversie.printconvert();

    }

}
