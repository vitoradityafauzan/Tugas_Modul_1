package vitorf.TugasMod1.no1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float suhu;
        int choice;

        System.out.print("Masukan Suhu\t: ");
        suhu = scan.nextFloat();
        Konversi temp = new Konversi(suhu);

        System.out.print("Masukan Jenis Derajat Suhu\t: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                temp.celcius(temp);
                System.out.println("Celsius\t: " + temp.c);
                System.out.println("Fahrenheit\t: " + temp.f);
                System.out.println("Kelvin\t: " + temp.k);
                System.out.println("Reamur\t: " + temp.r);

                break;
            case 2:
                temp.fahrenheit(temp);
                System.out.println("Celsius\t: " + temp.c);
                System.out.println("Fahrenheit\t: " + temp.f);
                System.out.println("Kelvin\t: " + temp.k);
                System.out.println("Reamur\t: " + temp.r);

                break;

            case 3:
                temp.kelvin(temp);
                System.out.println("Celsius\t: " + temp.c);
                System.out.println("Fahrenheit\t: " + temp.f);
                System.out.println("Kelvin\t: " + temp.k);
                System.out.println("Reamur\t: " + temp.r);

                break;

            case 4:
                temp.reamur(temp);
                System.out.println("Celsius\t: " + temp.c);
                System.out.println("Fahrenheit\t: " + temp.f);
                System.out.println("Kelvin\t: " + temp.k);
                System.out.println("Reamur\t: " + temp.r);

                break;
        }
    }
}
