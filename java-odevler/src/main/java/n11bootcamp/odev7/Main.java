package n11bootcamp.odev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();

        toplam = (armutKg * armutFiyat) +
                (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) +
                (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplam + " TL");

        input.close();
    }
}