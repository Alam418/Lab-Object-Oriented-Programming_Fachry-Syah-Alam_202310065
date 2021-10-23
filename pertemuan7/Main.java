package pertemuan7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pertemuan7.module.Huion;
import pertemuan7.module.Wacom;
import pertemuan7.module.gTablet;

public class Main{

    public static void main(String[] args){
        // gTablet t = new gTablet();
        // Wacom w = new Wacom();
        // Huion h = new Huion();
    
        // System.out.println("Perbandingan antara 2 graphic tablet");
        // System.out.println("");
        // System.out.println("Wacom");
        // w.setWacom("Kelebihan Wacom : ");
        // System.out.println(w.getWacom());
        // w.PenP();
        // w.Pen();
    
        // System.out.println("");
        // System.out.println("Huion");
        // h.setHuion("Kelebihan Huion : ");
        // System.out.println(h.getHuion());
        // h.PenP();
        // h.Pen();

        // Main m = new Main();
        // System.out.print("masukan text:");
        Scanner myObj = new Scanner(System.in);
        // String output= myObj.nextLine();
        // System.out.println("output:"+output);

        List<Wacom> ListW = new ArrayList<Wacom>();
        List<Huion> ListH = new ArrayList<Huion>();
        for (int i=0; i<3; i++){
            System.out.println("data ke-"+(i+1));
            Wacom w = new Wacom();

            System.out.println("Type : ");
            String Merk = myObj.nextLine();
            w.setMerk(Merk);

            System.out.println("Price : ");
            String price = myObj.nextLine();
            Double price2 = Double.parseDouble(price);
            w.setPrice(price2);

            ListW.add(w);
        }
        System.out.println("\n");

        for (Wacom w : ListW) {
            System.out.println("Series = "+w.getMerk());
            System.out.println("Price = "+w.getPrice());
        }
    }
    
}
