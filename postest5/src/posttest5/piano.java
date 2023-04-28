package posttest5;


public class piano extends Musik{
    private String Merk;
    private double scale;
    
    public piano (String Id, String Jumlah, String Jenis, String Barang, String Harga, String Merk, double scale){
      
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
        System.out.println("Id Barang  : " + this.Id);
        System.out.println("Jumlah Barang  : " + this.Jumlah);
        System.out.println("Nama Barang  : " + this.Barang);
        System.out.println("Jenis Barang  : " + this.Jenis);
        System.out.println("Harga Barang : " + this.Harga);
    }
}
