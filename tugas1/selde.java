package tugas1;

import java.util.Scanner;

public class selde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nomor = in.nextInt();
        checker(nomor);
    }

    public static int selde(int nomor) {
        int selde = 0;
        while (nomor != 0) {
            int sisa = nomor % 10;
            selde = selde * 10 + sisa;
            nomor = nomor / 10;
        }
        return selde;
    }

    public static boolean checker(int nomor) {
        int checker = nomor;
        if (checker == selde(nomor))
            System.out.println(nomor + " adalah selde.");
        else
            System.out.println(nomor + " bukan selde.");
        return true;
    }
}
