import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        //SAYİ TAHMİN ETME OYUNU
        System.out.println("bir sayı tahmin ediniz:");
        int tahmin = klavye.nextInt();
        int bil_secim = (int)(Math.random()*10);

        while (tahmin != bil_secim){
            if (tahmin<0 || tahmin>10){
                System.out.println("geçersiz değer");
                 tahmin = klavye.nextInt();
            } else if (tahmin>bil_secim) {
                System.out.println("tahmininiz: "+tahmin+" -> Daha küçük sayi giriniz");
                 tahmin = klavye.nextInt();
            } else {
                System.out.println("tahmininiz: "+tahmin+" -> Daha büyük sayi giriniz");
                tahmin = klavye.nextInt();
            }
        }
        System.out.println("bilgisayarın sayısı: "+bil_secim+" tahmininiz: "+tahmin);
        System.out.println("Tebrikler,kazandınız");




    }
}