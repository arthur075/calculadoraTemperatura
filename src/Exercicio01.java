import java.util.*;
public class Exercicio01 {

    public static void main(String[] args) {

        /*1. Escreva um programa que, com base em uma
        temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
        seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/


        int escolha;
        double celcius, reaumur, rankine, kelvin, fah;
        double resultado;
        String nomeUsuario;

        System.out.println("Insira o seu nome: ");
        Scanner input = new Scanner(System.in);
        nomeUsuario = input.next();
        System.out.println("Olá " + nomeUsuario + " seja bem vindo!");
        System.out.println("Aqui você podera calcular temperaturas com base em graus celcius");
        System.out.println("insira o valor em graus Celcius: ");
        celcius = input.nextDouble();
        System.out.println("Insira o numero para escolher a temperatura para ser transformada: ");
        System.out.println("kelvin(1) Réaumur(2) Rankine(3) Fahrenheit(4)");
        escolha = input.nextInt();

        switch (escolha) {

            case 1: //calcula para kelvin
                resultado = kelvin(celcius);
                System.out.println("o valor: " + celcius + " trasnformado para kelvin e de:" + resultado);
                break;
            case 2:
                resultado = reaumur(celcius);
                System.out.println("o valor: " + celcius + " trasnformado para reaumur e de:" + resultado);
                break;
            case 3:
                resultado = rankine(celcius);
                System.out.println("o valor: " + celcius + " trasnformado para rankine e de:" + resultado);
                break;
            case 4:
                resultado = fah(celcius);
                System.out.println("o valor: " + celcius + " trasnformado para fahrenheit e de:" + resultado);
                break;
            default:
                System.out.println("resposta invalida!");




        }


    }

    public static double kelvin(double celcius) {

        double resultado;

        resultado = celcius + 273.15;

        return resultado;


    }

    public static double reaumur(double celcius) {

        double resultado;

        resultado = celcius * 0.8;

        return resultado;
    }

    public static double rankine(double celcius) {

        double resultado;

        resultado = (celcius * 1.8) + 32 + 459.67;

        return resultado;
    }
    public static double fah(double celcius) {

        double resultado;

        resultado = (celcius * 1.8) + 32;

        return resultado;
    }
}