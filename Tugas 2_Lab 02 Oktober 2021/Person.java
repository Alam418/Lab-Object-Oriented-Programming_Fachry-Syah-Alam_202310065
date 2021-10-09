public class Person {

    public String Name;
    public String Birthdate;
    public String Departement;
    public String Major;
    public String Age;
    public String Height;
    public String Weight;
    public String Distance;
    public String Time;

    public static void main(String[] args) {

        Person nama = new Person();
        nama.setName("Fachry Syah Alam");
        String Name = nama.getName();
        System.out.println("Nama : " + Name);

        Person tlahir = new Person();
        tlahir.setBirthdate("28 Agustus 2002");
        String Birthdate = tlahir.getBirthdate();
        System.out.println("Tanggal Lahir : " + Birthdate);

        Person dep = new Person();
        dep.setDepartement("");
        String Departement = dep.getDepartement();
        System.out.println("Departemen : " + Departement);

        Person jurusan = new Person();
        jurusan.setMajor("Teknologi Informasi");
        String Major = jurusan.getMajor();
        System.out.println("Jurusan : " + Major);

        Person umur = new Person();
        umur.setAge("19");
        String Age = umur.getAge();
        System.out.println("Umur : " + Age + " Tahun");

        Person tinggi = new Person();
        tinggi.setHeight("176");
        String Height = tinggi.getHeight();
        System.out.println("Tinggi : " + Height + " cm");

        Person berat = new Person();
        berat.setWeight("90");
        String Weight = berat.getWeight();
        System.out.println("Berat : " + Weight + " kg");

        Person jarak = new Person();
        jarak.setDistance("500");
        String Distance = jarak.getDistance();
        System.out.println("jarak : " + Distance + " km");

        int x = 80;
        double y = 500;

        System.out.println("Waktu yang ditempuh jika berangkat dari rumah menuju kampus IBIK jika menggunakan kendaraan bermotor");
        System.out.println("dengan kecepatan "+ x +"km per menit adalah "+ time(x, y)+" menit");
    }


    public static double time(int x, double y){
        double distance = y;
        int speed = x;
        return distance/speed;
    }

    public void setName(String x){
        this.Name = x;
    }

    public String getName(){
        return this.Name;
    }

    public void setBirthdate(String x){
        this.Birthdate = x;
    }

    public String getBirthdate(){
        return this.Birthdate;
    }

    public void setDepartement(String x){
        this.Departement =x;
    }

    public String getDepartement(){
        return this.Departement;
    }

    public void setMajor(String x){
        this.Major =x;
    }

    public String getMajor(){
        return this.Major;
    }

    public void setAge(String x){
        this.Age =x;
    }

    public String getAge(){
        return this.Age;
    }

    public void setHeight(String x){
        this.Height =x;
    }

    public String getHeight(){
        return this.Height;
    }

    public void setWeight(String x){
        this.Weight =x;
    }

    public String getWeight(){
        return this.Weight;
    }

    public void setDistance(String x){
        this.Distance =x;
    }

    public String getDistance(){
        return this.Distance;
    }

    public void setTime(String x){
        this.Time =x;
    }

    public String getTime(){
        return this.Time;
    }

}
