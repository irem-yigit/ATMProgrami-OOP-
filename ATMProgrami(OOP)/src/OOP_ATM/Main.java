package OOP_ATM;

public class Main {
    public static void main(String[] args){
        ATM atm=new ATM();
        Hesap hesap = new Hesap("iremyigit","12345",5000 );
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
}
