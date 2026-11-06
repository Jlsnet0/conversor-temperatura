package util;

public class TempConverter {

    public static double celsiusToFahrenheit(double c){
        return (c * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double c){
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double f){
        return (f - 32 ) / 1.8 + 273.15;
    }

    public static double kelvinToCelsius(double k){
        return k - 273.15;
    }

    public static double kelvinToFahrenheit(double k){
        return (k - 273.15) * 1.8 + 32;
    }
}
