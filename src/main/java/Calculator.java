public class Calculator {
    public void calc(DataSaver forCalc)
    {

        double num1 = forCalc.DataSaverGetD1();
        double num2 = forCalc.DataSaverGetD2();
        String type_of_operation = forCalc.DataSaverGetC();

        double temp_num=0;

if (type_of_operation.equals("+"))
{
    temp_num = num1+num2;
}
else if (type_of_operation.equals("-"))
{
    temp_num = num1-num2;
}
else if (type_of_operation.equals("*"))
{
    temp_num = num1*num2;
}
else if (type_of_operation.equals("/") | type_of_operation.equals(":"))
{
    if (num2 ==0 | (num1 == 0 & num2 ==0))
        temp_num = 0;
    else
    temp_num = num1/num2;
}
else if (type_of_operation.equals("^"))
{
    temp_num = Math.pow(num1,num2);
}

forCalc.DataSaverSetD(temp_num);
    }
}
