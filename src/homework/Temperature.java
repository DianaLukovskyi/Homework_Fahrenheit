package homework;

public class Temperature {
    double fahrenheit;


    public Temperature(double fahrenheit) {
        this.fahrenheit=fahrenheit;



    }
    public double convertFahrenheit(){
       return 5*(fahrenheit -32/9);
    }

}

