package n11bootcamp.odev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();

        total = startPrice + (km * perKm);

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar: " + total + " TL");
    }
}