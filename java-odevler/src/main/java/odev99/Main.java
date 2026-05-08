package n11bootcamp.odev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, u, alan, hipotenus;
        Scanner input = new Scanner(System.in);


        System.out.println("--- Hipotenüs Hesaplama ---");
        System.out.print("1. Dik Kenarı Giriniz: ");
        a = input.nextDouble();
        System.out.print("2. Dik Kenarı Giriniz: ");
        b = input.nextDouble();


        hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        System.out.println("\n--- Üçgen Alanı Hesaplama (Heron Formülü) ---");

        System.out.print("1. Kenar (a): ");
        a = input.nextDouble();
        System.out.print("2. Kenar (b): ");
        b = input.nextDouble();
        System.out.print("3. Kenar (c): ");
        c = input.nextDouble();

        u = (a + b + c) / 2.0;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + (2 * u));
        System.out.println("Üçgenin Alanı: " + alan);

        input.close();
    }
}}