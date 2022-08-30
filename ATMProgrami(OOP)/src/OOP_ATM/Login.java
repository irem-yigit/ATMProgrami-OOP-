package OOP_ATM;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){    //normalde buraya int a şeklinde yazarız ama şuan Hesap objesini gönderdiğimiz için Hesap classımızı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanıcı adı: ");
        kullanici_adi= scan.nextLine();
        System.out.println("Parola: ");
        parola=scan.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else {
            return false;
        }
    }
}
