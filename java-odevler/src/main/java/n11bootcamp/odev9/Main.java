package n11bootcamp.odev9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select, newPassword;
        String validPassword = "java101";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (password.equals(validPassword)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            select = input.nextLine();

            if (select.equals("evet")) {
                System.out.print("Yeni Şifreniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals(validPassword) || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Giriş sonlandırıldı.");
            }
        }

        input.close();
    }
}