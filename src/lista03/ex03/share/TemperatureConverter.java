package lista03.ex03.share;

public class TemperatureConverter {



    public void convertFahrenheit(Celcius celcius){
        System.out.println("Convert " + ((celcius.temperature * 1.8)+32) + "F");
    }

    public void corvertCelcius(Fahrenheit fahrenheit){
        System.out.println("Convert " + ((fahrenheit.temperature - 32)/ 1.8) +"C");
    }

}
