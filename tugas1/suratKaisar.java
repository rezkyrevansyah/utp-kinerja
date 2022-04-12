package tugas1;

import java.util.*;

public class suratKaisar {
    public static String enkripsi(String teks, int nilai) {
        String hasil = "";
        for (int i = 0; i < teks.length(); i++) {
            int teksGeser = teks.charAt(i);
            if (Character.isUpperCase(teksGeser)) {
                teksGeser = teksGeser + (nilai % 26);
                if (teksGeser > 'Z')
                    teksGeser = teksGeser - 26;
            } else if (Character.isLowerCase(teksGeser)) {
                teksGeser = teksGeser + (nilai % 26);
                if (teksGeser > 'z')
                    teksGeser = teksGeser - 26;
            }
            hasil += (char) teksGeser;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String teks = in.nextLine();
        int nilai = in.nextInt();

        String cipherText = enkripsi(teks, nilai);
        System.out.println("" + cipherText);
    }
}