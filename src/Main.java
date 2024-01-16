import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku kwadratu aby wyliczyc jego obwod:");
        int sideLengh = sc.nextInt(); // MOZLIWOSC EDYTOWANIA KONSOLI
        System.out.println("Obwod kwadratu to: " + (4 * sideLengh));
        System.out.print("Podaj dlugosc boku A prostokata: ");
        int sideLenghA = sc.nextInt();
        System.out.print("Podaj dlugosc boku B prostokata: ");
        int sideLenghB = sc.nextInt();
        System.out.println("Obwod prostokata: " + (2 * sideLenghA + 2 * sideLenghB));
        System.out.print("Podaj dlugosc boku A prostokata: ");
        double sideLenghAA = sc.nextDouble();
        System.out.print("Podaj dlugosc boku B prostokata: ");
        double sideLenghBB = sc.nextDouble();
 System.out.println("Pole prostokata: " + (sideLenghAA * sideLenghBB));
    }
 }

