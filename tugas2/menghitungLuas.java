package tugas2;

import java.util.*;

class Persegi {
    void cariLuas(int sisi) {
        int hasil = sisi * sisi;
        System.out.print(hasil);
    }
}

class Segitiga {
    void cariLuas(int alas, int tinggi) {
        int hasil = (alas * tinggi) / 2;
        System.out.print(hasil);
    }
}

class Lingkaran {
    void cariLuas(int radius) {
        if (radius == 7) {
            double luas = 22 / 7 * radius * radius;
            int hasilLuas = (int) luas;
            System.out.print((double) hasilLuas);

        } else {
            double luas = 3.14 * radius * radius;
            int hasilLuas = (int) luas;
            System.out.print((double) hasilLuas);
        }

    }
}

public class menghitungLuas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Segitiga bangunSegitiga = new Segitiga();
        Persegi bangunPersegi = new Persegi();
        Lingkaran bangunLingkaran = new Lingkaran();

        int alas, tinggi, sisi, radius;
        int menu = in.nextInt();

        if (menu == 1) {
            sisi = in.nextInt();
            bangunPersegi.cariLuas(sisi);

        } else if (menu == 2) {
            tinggi = in.nextInt();
            alas = in.nextInt();
            bangunSegitiga.cariLuas(alas, tinggi);

        } else if (menu == 3) {
            radius = in.nextInt();
            bangunLingkaran.cariLuas(radius);

        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }

    }
}