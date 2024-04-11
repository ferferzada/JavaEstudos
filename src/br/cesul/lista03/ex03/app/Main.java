package br.cesul.lista03.ex03.app;

import br.cesul.lista03.ex03.share.Celcius;
import br.cesul.lista03.ex03.share.Fahrenheit;
import br.cesul.lista03.ex03.share.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        Celcius celcius = new Celcius(100);
        Fahrenheit fahrenheit = new Fahrenheit(20);

        TemperatureConverter temperatureConverter =  new TemperatureConverter();
        temperatureConverter.convertFahrenheit(celcius);
        temperatureConverter.corvertCelcius(fahrenheit);
    }
}
