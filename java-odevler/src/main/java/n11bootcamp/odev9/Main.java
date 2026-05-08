package n11bootcamp.odev10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplamNot = 0;
        int dersSayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            dersSayisi++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Ortalamaya katılacak geçerli bir not girilmedi.");
        } else {
            double ortalama = (double) toplamNot / dersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçtiniz.");
            } else {
                System.out.println("Sınıfta Kaldınız.");
            }
        }

        input.close();
    }
}