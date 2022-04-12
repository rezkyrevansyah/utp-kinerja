package tugas4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant
                .tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));
        DataMerchant.tampilData();
        System.out.println();

        // menambah merchant
        System.out.println("===Tambah Merchant dan Produk===");
        System.out.print("Nama Merchant   : ");
        String nMerchant = in.nextLine();
        System.out.print("Nama Produk     : ");
        String nProduk = in.nextLine();
        System.out.print("Harga           : ");
        double harga = in.nextDouble();
        in.nextLine();

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(nMerchant, nProduk, harga));
        System.out.println();

        DataMerchant.tampilData();
        System.out.println();
    }
}
