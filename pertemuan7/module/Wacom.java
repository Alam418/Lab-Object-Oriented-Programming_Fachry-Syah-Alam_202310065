package pertemuan7.module;


public class Wacom extends gTablet{

    public String merk;
    public String wacom;
    public Double price;

    public String getgTablet(){
        return merk;
    }

    public void setgTablet(String newgTablet){
        this.merk = newgTablet;
    }

    public void PenP(){
        System.out.println("- All Wacom tablets have at least 2048 levels of pen pressure sensitivity");
    }

    public void Pen(){
        System.out.println("- Wacom have battery free stylus pen");
    }

    public String getWacom(){
        return wacom;
    }
    public void setWacom(String newMerk){
        this.wacom = newMerk;
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
