package posttest3;

public class gitar extends Musik{
    private String Merk;
    private double scale;
    
    public gitar (String Id, String Jumlah, String Jenis, String Barang, String Harga, String Merk, double scale){
      
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
      
     public void setMerk(String Merk){
        this.Merk = Merk;
    }
        
     public void setscale(double scale){
        this.scale = scale;
    }
}
