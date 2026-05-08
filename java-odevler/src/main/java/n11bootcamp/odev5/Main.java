package n11bootcamp.odev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, alpha, pi = 3.14, alan, cevre, dilimAlan;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açısının ölçüsünü (𝛼) giriniz: ");
        alpha = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilimAlan = (pi * (r * r) * alpha) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);

        input.close();
    }
}