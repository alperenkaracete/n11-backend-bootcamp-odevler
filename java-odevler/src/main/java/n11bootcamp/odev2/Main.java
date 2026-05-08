package n11bootcamp.odev2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();


        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;


        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: %" + (int)(kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

        input.close();
    }
}