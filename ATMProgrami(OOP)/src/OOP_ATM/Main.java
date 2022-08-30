package OOP_ATM;

public class Main {
    public static void main(String[] args){ //Object Oriented (Nesne yönelimli) ATM programı
        //Login Class'ı kullanıcı girişini kontrol edecek.
        //Hesap Class'ı hesap işlemlerini yapacak.
        //ATM Class'ı ise Atm'mizi çalıştıracak.

        ATM atm=new ATM();

        Hesap hesap = new Hesap("iremyigit","12345",5000 );

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");



    }
}
