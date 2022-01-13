public class DataSaver {
    private String type_of_opperation_s;
    private double num1d, num2d,numad;

    public void DataSaverSetC(String type_of_opperation)
    {
       this.type_of_opperation_s = type_of_opperation;
    }

    public String DataSaverGetC()
    {
        return type_of_opperation_s;
    }

    public void DataSaverSetD(double num1,double num2)
    {
        this.num1d = num1;
        this.num2d = num2;
    }

    public double DataSaverGetD1()
    {
        return num1d;
    }
    public double DataSaverGetD2()
    {
        return num2d;
    }

    public void DataSaverSetD (double numA)
    {
        this.numad = numA;
    }
    public double DataSaverGetDA()
    {
        return numad;
    }

}
