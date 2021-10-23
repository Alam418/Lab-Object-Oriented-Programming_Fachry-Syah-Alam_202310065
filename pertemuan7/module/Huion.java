package pertemuan7.module;


public class Huion extends gTablet{

    public String merk;
    public String huion;
    public Double price;

    public String getgTablet(){
        return merk;
    }

    public void setgTablet(String newgTablet){
        this.merk = newgTablet;
    }

    public void PenP(){
        System.out.println("- Huion tablets are very sensitive, with many supporting 8192 levels of pen pressure sensitivity");
    }

    public void Pen(){
        System.out.println("- The pen is very light and easy to recharge.");
    }

    public String getHuion(){
        return huion;
    }
    public void setHuion(String newMerk){
        this.huion = newMerk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String Merk) {
        merk = Merk;
    }

    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double Price) {
        price = Price;
    }
}
