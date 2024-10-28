package UlanganBuPasha;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        String choice = "";
        piano piano = new piano();
        Guitar guitar = new Guitar();
        Scanner j = new Scanner(System.in);

        System.out.println("Ingin membeli instrument apa?");
        choice = j.nextLine();

        if (choice.equalsIgnoreCase("piano")) {
            Scanner in= new Scanner(System.in);
        System.out.println("Inputkan Nama Piano");
        String name = in.nextLine();
        System.out.println(" ");
        System.out.println("Inputkan Harga Piano");
        double price = in.nextDouble();
        System.out.println(" ");
        System.out.println("Inputkan tipe piano");
        String pianoType = in.nextLine();
        System.out.println(" ");

        piano pianoi = new piano(name, price, pianoType);
        pianoi.print();
            
        } else if (choice.equalsIgnoreCase("gitar")) {
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

        Guitar guitarz = new Guitar(name, price, numString, isElectric);
        guitarz.print();
            
        }

        


    }
}
