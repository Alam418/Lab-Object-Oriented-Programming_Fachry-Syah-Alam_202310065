class gTablet {

    public String merk;
    public String wacom;
    public String huion;

    public String getgTablet(){
        return merk;
    }

    public void setgTablet(String newgTablet){
        this.merk = newgTablet;
    }

    class Wacom extends gTablet {

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
    
    }
    
    class Huion extends gTablet {
    
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
    }
    
    public static void main(String[] args){
        gTablet t = new gTablet();
        Wacom w = t.new Wacom();
        Huion h = t.new Huion();
    
        System.out.println("Perbandingan antara 2 graphic tablet");
        System.out.println("");
        System.out.println("Wacom");
        w.setWacom("Kelebihan Wacom : ");
        System.out.println(w.getWacom());
        w.PenP();
        w.Pen();
    
        System.out.println("");
        System.out.println("Huion");
        h.setHuion("Kelebihan Huion : ");
        System.out.println(h.getHuion());
        h.PenP();
        h.Pen();
    
    }

}

