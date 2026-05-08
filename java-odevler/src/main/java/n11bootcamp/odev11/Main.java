package n11bootcamp.odev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (sicaklik >= 15) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        input.close();
    }
}