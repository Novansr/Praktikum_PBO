package posttest3;


public class piano extends Musik{
    private String Merk;
    private double scale;
    
    public piano (String Id, String Jumlah, String Jenis, String Barang, String Harga, String Merk, double scale){
      
        super (Id, Jumlah, Jenis, Barang, Harga);
        this.Merk=Merk;
        this.scale=scale;
    }
    
     public String getjenis(){
        return this.Merk;
    }
    
      public double getscale(){
        return this.scale;
    }
      
     public void setjenis(String jenis){
        this.Merk = jenis;
    }
        
     public void setscale(double scale){
        this.scale = scale;
    }
}
