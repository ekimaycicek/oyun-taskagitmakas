import java.util.Random;
import java.util.Scanner;

public class Oyun {

    public static void main(String[] args) {


        int kisi, pc;
        //bilgisayar 1 ile 3 araliginda random deger tutacak

        Random rnd = new Random();
        pc = rnd.nextInt(3) + 1; //bilgisayar 1-3 araliginda deger tutacak.
        System.out.println("bilgisayar" + pc);
        System.out.println("1.tas");
        System.out.println("2.kagit");
        System.out.println("3.makas");
        System.out.println("Lutfen seciminizi yapiniz");
        Scanner input = new Scanner(System.in);
        kisi = input.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3) {
            System.out.println("yanlis bir secim yapilmistir.");
        } else {

            // pc:1 kisi:1 berabere
            // pc:1 kisi:2 kisi kazandi
            // pc:1 kisi:3 pc kazandi

            // pc:2 kisi:1 pc kazandi
            // pc:2 kisi:2 berabere
            // pc:2 kisi:3 kisi kazandi

            // pc:3 kisi:1 kisi kazandi
            // pc:3 kisi:2 pc kazandi
            // pc:3 kisi:3 berabere

            //istenilen deger araliginda giris yapilmistir.
            //Degeri pc ile karsilastirmak gerekecektir.

            if (pc == kisi) {
                System.out.println("berabere");
            }
            if (pc == 1 && kisi == 2) {
                System.out.println("kisi kazandi");
            }
            if (pc == 1 && kisi == 3) {
                System.out.println("pc kazandi");
            }
            if (pc == 2 && kisi == 1) {
                System.out.println("pc kazandi");
            }
            if (pc == 2 && kisi == 3) {
                System.out.println("kisi kazandi");
            }
            if (pc == 3 && kisi == 1) {
                System.out.println("kisi kazandi");
            }
            if (pc == 3 && kisi == 2) {
                System.out.println("pc kazandi");
            }

        }

    }
}