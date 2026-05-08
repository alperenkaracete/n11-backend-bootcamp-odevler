package n11bootcamp.odev1;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();


        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: " + sonuc);

        String durum = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(durum);
    }
}