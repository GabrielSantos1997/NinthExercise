package saojudas.ninthexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class NinthExercise {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = ((9 * celsius) + 160 ) / 5;

        System.out.print("A medida convertida é " + fahrenheit + " ºF");
    }
}
