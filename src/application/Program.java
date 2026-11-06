package application;

import exceptions.DomainException;
import util.TempConverter;

import java.util.Scanner;

public class Program {
    static void main() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Conversor de temperaturas.");
            int option;
            do {
                System.out.println("Menu de opções:" +
                        "\n1 - Conversões em Celsius" +
                        "\n2 - Conversões em Fahrenheit" +
                        "\n3 - Conversões em Kelvin" +
                        "\n4 - Sair");
                System.out.print("Digite sua opção: ");
                option = sc.nextInt();

                if (option < 1 || option > 4) throw new DomainException("Opção inválida");
                if (option == 1) option1(sc);
                else if (option == 2) option2(sc);
                else if (option == 3) option3(sc);

            } while (option != 4);

            System.out.println("Obrigado pelo acesso");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void option1(Scanner sc){
        System.out.println("Menu de converões Celsius\n1 - Celsius para Fahrenheit\n2 - Celsius para Kelvin");
        int response = readResponse(sc);
        System.out.print("Insira a temperatura: ");
        double temp = sc.nextDouble();
        if (response == 1){
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.celsiusToFahrenheit(temp)) + "°F");
        } else {
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.celsiusToKelvin(temp)) + "K");
        }
    }
    
    public static void option2(Scanner sc){
        System.out.println("Menu de converões Fahrenheit\n1 - Fahrenheit para Celsius\n2 - Fahrenheit para Kelvin");
        int response = readResponse(sc);
        System.out.print("Insira a temperatura: ");
        double temp = sc.nextDouble();
        if (response == 1){
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.fahrenheitToCelsius(temp)) + "°C");
        } else {
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.fahrenheitToKelvin(temp)) + "K");
        }
    }
    
    public static void option3(Scanner sc){
        System.out.println("Menu de converões Kelvin\n1 - Kelvin para Fahrenheit\n2 - Kelvin para Celsius");
        int response = readResponse(sc);
        System.out.print("Insira a temperatura: ");
        double temp = sc.nextDouble();
        if (response == 1){
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.kelvinToFahrenheit(temp)) + "°F");
        } else {
            System.out.println("Conversão: " + String.format("%.2f", TempConverter.kelvinToCelsius(temp)) + "°C");
        }
    }

    public static int readResponse(Scanner sc) {
        System.out.print("Digite sua opção: ");
        int option = sc.nextInt();
        if (option < 1 || option > 2) {
            throw new DomainException("Opção inválida");
        }
        return option;
    }
}
