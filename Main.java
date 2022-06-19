import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Calculator suma = new Calculator();
        suma.CalcSum();
        suma.CalcMinus();
        suma.CalcInmultire();
        suma.CalcImpartire();

        Tree copac = new Tree();
        copac.printtree();

        Media aritmetica = new Media();
        aritmetica.printmedia();

        Portret portret = new Portret();
        portret.printface();

        TempConvert conversie = new TempConvert();
        conversie.printconvert();

        InchesConvert inch = new InchesConvert();
        inch.InchConvert();
    }

}
