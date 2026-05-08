package n11bootcamp.odev14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, tip;
        double birimFiyat = 0.10, toplamTutar, yasIndirimi = 0, tipIndirimi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            toplamTutar = km * birimFiyat;

            if (yas < 12) {
                yasIndirimi = toplamTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = toplamTutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = toplamTutar * 0.30;
            }

            toplamTutar -= yasIndirimi;

            if (tip == 2) {
                tipIndirimi = toplamTutar * 0.20;
                toplamTutar = (toplamTutar - tipIndirimi) * 2;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}