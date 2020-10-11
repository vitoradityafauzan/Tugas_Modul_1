package vitorf.TugasMod1.no3;

import java.util.Scanner;

public class Main {

    private static void karyawan1() {
        System.out.println("Nama Karyawan\t\t: Vito Raditya Fauzan");
        System.out.println("ID Karyawan\t\t\t: 19104063");
        System.out.println("Jabatan Karyawan\t: Backend Developer");
    }

    private static void karyawan2() {
        System.out.println("Nama Karyawan\t\t: Arthur Jacob Danik");
        System.out.println("ID Karyawan\t\t\t: 19101032");
        System.out.println("Jabatan Karyawan\t: Frontend Developer");
    }

    private static void karyawan3() {
        System.out.println("Nama Karyawan\t\t: Isaac Clarke");
        System.out.println("ID Karyawan\t\t\t: 19102076");
        System.out.println("Jabatan Karyawan\t: Backend Developer");
    }

    private static int JumlahKaryawan() {
        return 3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Data Karyawan");
        System.out.println("====================================");

        System.out.println("Jumlah Karyawan\t: " + JumlahKaryawan());
        System.out.print("Pilih Karyawan\t: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                karyawan1();

                break;

            case 2:
                karyawan2();

                break;

            case 3:
                karyawan3();

                break;
        }
    }
}
