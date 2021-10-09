public class Handphone {

    public int layar;

    public int camera;
    public String batre;


public static void main(String args[]){
    menelpon();
    berfoto();
    System.out.println("Kualitas foto hp ini adalah "+berfoto()+" megapixel");
    int x = 5;
    double y = 10.0;
    System.out.println("Kekuatan engine nya sebesar "+engine(x,y)+" megavolt");        
}

    public static void menelpon(){ // tipe data ini hanya bisa menampilkan keseliruhan statement dan argumen 
        int layar = 1;
        System.out.println("Sedang menelpon dengan layar hp ke "+ layar );            
    }


    public static int berfoto(){ // seting fungsi tipe data int
        int x = 5;
        int camera = x * 5;
        return camera;
    }

    
    public static double engine(int x, double y){
        int camera = x;
        double batre = y;
        return batre / camera;
    }
}