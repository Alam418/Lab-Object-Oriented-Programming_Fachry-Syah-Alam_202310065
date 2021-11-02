package module;

public class Huion extends graphic_tablet{
    private String brand;
    private Double price;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String Brand){
        brand = Brand;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double Price){
        price = Price;
    }
}
