import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import module.Wacom;
import module.Huion;

public class Main{

    private String[] LisT = {"Mengisi data", "Melihat data"};
    private String[] Tab = {"Wacom", "Huion"};
    private List<Wacom> ListW = new ArrayList<Wacom>();
    private List<Huion> ListH = new ArrayList<Huion>();

    public static void main(String[] args){

        Main m = new Main();
        m.input();

    }
    
    public void input() {

        Scanner myObj = new Scanner(System.in);
        int menu;

        System.out.println("////Input Output////");
        System.out.println("list menu");
        int i=1;
        for(String l : this.LisT){
            System.out.println(i+". "+l);
            i++;
        }
        System.out.println("input nomor menu : ");
        String input = myObj.nextLine();
        menu = Integer.parseInt(input);

        switch(menu) {

            case 1:
                this.inTablet();
                break;
            case 2:
                this.outTablet();
                break;

            default:
            System.out.println("menu tidak ditemukan");
            break;

        }
        
    }

    public void inTablet() {

        System.out.println("\n");
        System.out.println("Input Tablet");
        System.out.println("Merk Tablet");
        int i=1;
        for (String t : Tab){

            System.out.println(i+". "+t);
            i++;

        }
        System.out.println("silahkan pilih:");
        Scanner myObj = new Scanner(System.in);
        int Lm;
        String inTablet = myObj.nextLine();
        Lm = Integer.parseInt(inTablet);
        switch (Lm) {

            case 1:
                try {

                    ListW = this.InWacom();
                    this.input();

                } catch (Exception M) {

                    System.out.println("Failed to input");
                    System.out.println("Error : "+M.getMessage());

                }

                break;
            
            case 2:
                try {

                    ListH = this.InHuion();
                    this.input();

                } catch (Exception M) {

                    System.out.println("Failed to input");
                    System.out.println("Error : "+M.getMessage());

                }

                break;

                default:
                System.out.println("menu tidak ditemukan");
                break;

        }

    }

    public List InWacom(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Wacom");
        System.out.println("Input Jumlah Data : ");
        int jumlah=2;
        for (int i=0; i<jumlah; i++) {
            Wacom w = new Wacom();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.println("Merk = ");
            String Brand = myObj.nextLine();
            w.setBrand(Brand);

            System.out.println("Pen Type = ");
            String Pen = myObj.nextLine();
            w.setPen(Pen);

            System.out.println("Pressure Level = ");
            String Press = myObj.nextLine();
            w.setPress(Press);

            System.out.println("Price = ");
            Double Price = Double.parseDouble(myObj.nextLine());
            w.setPrice(Price);

            this.ListW.add(w);
        }

        System.out.println("\n");
        return this.ListW;

    }

    public List InHuion(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Huion");
        System.out.println("Input Jumlah Data : ");
        int jumlah=2;
        for (int i=0; i<jumlah; i++) {
            Huion h = new Huion();
            System.out.println("\n");
            System.out.println("#data ke-"+(i+1)+":");
            System.out.println("Merk = ");
            String Brand = myObj.nextLine();
            h.setBrand(Brand);

            System.out.println("Pen Type = ");
            String Pen = myObj.nextLine();
            h.setPen(Pen);

            System.out.println("Pressure Level = ");
            String Press = myObj.nextLine();
            h.setPress(Press);

            System.out.println("Price = ");
            Double Price = Double.parseDouble(myObj.nextLine());
            h.setPrice(Price);

            this.ListH.add(h);
        }

        System.out.println("\n");
        return this.ListH;

    }

    public void outTablet() {

        System.out.println("\n");
        System.out.println("Output Tablet");
        System.out.println("Merk Tablet : ");
        int i=1;
        for (String t : Tab){

            System.out.println(i+". "+t);
            i++;

        }
        System.out.println("silahkan pilih:");
        Scanner myObj = new Scanner(System.in);
        int Merk;
        String inTablet = myObj.nextLine();
        Merk = Integer.parseInt(inTablet);
        switch(Merk) {

            case 1:
                this.OutWacom();
                break;
            case 2:
                this.OutHuion();
                break;

            default:
            System.out.println("menu tidak ditemukan");
            break;
        
        }

    }

    public void OutWacom() {

        for (Wacom w : this.ListW){

            System.out.println("Merk = "+ w.getBrand());
            System.out.println("Pen Type = "+ w.getPen());
            System.out.println("Pressure Level = "+ w.getPress());
            System.out.println("Price = "+ w.getPrice());
            System.out.println("================================================");

        }

    }

    public void OutHuion() {

        for (Huion h : this.ListH){

            System.out.println("Merk = "+ h.getBrand());
            System.out.println("Pen Type = "+ h.getPen());
            System.out.println("Pressure Level = "+ h.getPress());
            System.out.println("Price = "+ h.getPrice());
            System.out.println("================================================");

        }

    }

}
