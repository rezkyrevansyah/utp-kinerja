package tugas3;

import java.util.*;

class Baju {
    String type;
    int price, jumlah;

    public Baju(String type, int jumlah) {
        this.type = type;
        this.jumlah = jumlah;
    }

    final int hargaA = 100000;
    final int hargaB = 125000;
    final int hargaC = 175000;

    int hargaA() {
        if (jumlah > 100) {
            price = 95000;
        } else {
            price = hargaA;
        }
        return price;
    }

    int hargaB() {
        if (jumlah > 100) {
            price = 120000;
        } else {
            price = hargaB;
        }
        return price;
    }

    int hargaC() {
        if (jumlah > 100) {
            price = 160000;
        } else {
            price = hargaC;
        }
        return price;
    }

    void display() {
        if (type.equalsIgnoreCase("a")) {
            hargaA();
        } else if (type.equalsIgnoreCase("b")) {
            hargaB();
        } else if (type.equalsIgnoreCase("c")) {
            hargaC();
        }

        System.out.println("Jenis yang anda beli \t: " + type);
        System.out.println("Harga per buah \t\t: " + price);
        System.out.println("Total Harga \t\t: " + price * jumlah);
    }

    static void displayBaju() {

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan Harga 100000");
        System.out.println("Baju B dengan Harga 125000");
        System.out.println("Baju C dengan Harga 175000");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Baju.displayBaju();
        System.out.print("Baju yang akan anda beli bertipe : ");
        String type = in.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = in.nextInt();

        Baju baju = new Baju(type, jumlah);

        baju.display();

    }
}