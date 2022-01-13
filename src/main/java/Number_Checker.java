import java.util.Scanner;

public class Number_Checker {
    double num1, num2;

    void TextMessage()
    {
        Scanner read = new Scanner(System.in);

        DataSaver forCalc = new DataSaver();
        System.out.println("Enter 2 numbers:");
        num1 = read.nextDouble();
        System.out.println("\n Your first number is: "+num1);
        num2 = read.nextDouble();
        System.out.println("\n Your second number is: "+num2);
        forCalc.DataSaverSetD(num1,num2);
        System.out.println("\n Enter type of operation: + , - , *, / or:, ^");
        String type_of_opperation = read.next();
        forCalc.DataSaverSetC(type_of_opperation);
        Calculator MakeD = new Calculator();
        MakeD.calc(forCalc);
        System.out.println("Answer is: "+ forCalc.DataSaverGetDA());
    }

}
