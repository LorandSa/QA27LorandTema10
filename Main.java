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

        Portret portret = new Portret();
        portret.printface();

        TempConvert conversie = new TempConvert();
        conversie.printconvert();

        Media aritmetica = new Media();
        aritmetica.printmedia();

    }

}
