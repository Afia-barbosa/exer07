package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int Celsius;
    int Fahrenheit;
    int conver;

    System.out.println("Quantos graus em Celsius: ");
    Celsius = entrada.nextInt();

    conver = (9*Celsius+160)/5;

    System.out.println("A temperatura em Fahrenheit é " + conver + "Fahrenheit");

    }
}