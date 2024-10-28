package UlanganBuPasha;

import java.util.Scanner;

public class testerInput {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Inputkan Nama Gitar");
        String name = in.nextLine();
        System.out.println(" ");
        System.out.println("Inputkan Harga Gitar");
        double price = in.nextDouble();
        System.out.println(" ");
        System.out.println("Inputkan NumStrings");
        int numString = in.nextInt();
        System.out.println(" ");
        System.out.println("Inputkan tipe gitar");
        boolean isElectric = in.nextBoolean();
        System.out.println(" ");

    }
}
