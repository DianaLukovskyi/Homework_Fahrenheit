package homework;

public class Main2 {
    public static void main(String[] args) {

        Temperature temperature1 = new Temperature(32);
        Temperature temperature2 = new Temperature(200);

        System.out.println("Temperature to celsius " + temperature1.convertFahrenheit());
        System.out.println("Temperature to celsius " + temperature2.convertFahrenheit());

    }
}
