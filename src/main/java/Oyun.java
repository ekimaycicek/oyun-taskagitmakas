import java.util.Random;
import java.util.Scanner;

public class Oyun {

    public static void main(String[] args) {


        int kisi, bilgisayar;
        //bilgisayar 1 ile 3 araliginda random deger tutacak
        Random rnd = new Random();
        bilgisayar = rnd.nextInt(3) + 1; //bilgisayar 1-3 araliginda deger tutacak.
        System.out.println("bilgisayar" + bilgisayar);
        System.out.println("1.tas");
        System.out.println("2.kagit");
        System.out.println("3.makas");
        System.out.println("Lutfen seciminizi yapiniz");
        Scanner input = new Scanner(System.in);
        kisi = input.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3) {
            System.out.println("yanlis bir secim yapilmistir.");
        } else {
            // bilgisayar:1 kisi:1 berabere
            // bilgisayar:1 kisi:2 kisi kazandi
            // bilgisayar:1 kisi:3 pc kazandi

            // bilgisayar:2 kisi:1 pc kazandi
            // bilgisayar:2 kisi:2 berabere
            // bilgisayar:2 kisi:3 kisi kazandi

            // bilgisayar:3 kisi:1 kisi kazandi
            // bilgisayar:3 kisi:2 pc kazandi
            // bilgisayar:3 kisi:3 berabere

            //istenilen deger araliginda giris yapilmistir.
            //Degeri bilgisayar ile karsilastirmak gerekecektir.

            if (bilgisayar == kisi) {
                System.out.println("berabere");
            }
            if (bilgisayar == 1 && kisi == 2) {
                System.out.println("kisi kazandi");
            }
            if (bilgisayar == 1 && kisi == 3) {
                System.out.println("pc kazandi");
            }
            if (bilgisayar == 2 && kisi == 1) {
                System.out.println("pc kazandi");
            }
            if (bilgisayar == 2 && kisi == 3) {
                System.out.println("kisi kazandi");
            }
            if (bilgisayar == 3 && kisi == 1) {
                System.out.println("kisi kazandi");
            }
            if (bilgisayar == 3 && kisi == 2) {
                System.out.println("pc kazandi");
            }

        }

    }
}