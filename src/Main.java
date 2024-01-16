import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE:");
        Scanner sc = new Scanner(System.in);
//   System.out.println("Podaj dlugosc boku kwadratu aby wyliczyc jego objetosc:");
//   Scanner sc = new Scanner(System.in);
// MOZLIWOSC EDYTOWANIA KONSOLI -->       int sideLenghA = sc.nextInt();
//   System.out.println("Obwod kwadratu to: " + (4 * sideLengh));
//   System.out.println("Obwod prostokata: " + (2 * sideLenghA + 2 * sideLenghB));
//   System.out.println("Podaj dlugosc boku A prostokata: ");
//        double sideLenghA = sc.nextDouble();
//  System.out.println("Podaj dlugosc boku B prostokata: ");
//        int sideLenghB = sc.nextInt();
// System.out.println("Pole prostokata: " + (sideLenghA * sideLenghB));
System.out.println("Podaj dlugosc boku A prostokata: ");
    int sideLenghA = sc.nextInt();
System.out.println("Podaj dlugosc boku B prostokata: ");
    int sideLenghB = sc.nextInt();
        System.out.println("Czy A == B? " + (sideLenghA == sideLenghB));



    }
 }

