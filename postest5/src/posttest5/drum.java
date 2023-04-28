package posttest5;


public class drum extends Musik{
    private String Merk;
    private double scale;
    
    public drum (String Id, String Jumlah, String Jenis, String Barang, String Harga, String Merk, double scale){
      
        super (Id, Jumlah, Jenis, Barang, Harga);
        this.Merk=Merk;
        this.scale=scale;
    }
    
     public String getMerk(){
        return this.Merk;
    }
    
      public double getscale(){
        return this.scale;
    }
      
     public void setMerk(String jenis){
        this.Merk = jenis;
    }
        
     public void setscale(double scale){
        this.scale = scale;
    }
     
    @Override
    public void display(){
        super.display();
        System.out.println("Jenis : " + this.Merk);
        System.out.println("Scale : " + this.scale);
    }
}
