package posttest3;

public class Musik {
    protected String Id;
    protected String Jumlah;
    protected String Jenis;
    protected String Barang;
    protected String Harga;
    
    public Musik (String Id, String Jumlah, String Jenis, String Barang, String Harga){
        this.Id = Id;
        this.Jumlah = Jumlah;
        this.Jenis = Jenis;
        this.Barang = Barang;
        this.Harga = Harga;}
    
    // Method getter
    public String getId(){
        return this.Id;}

    public String getJumlah(){
        return this.Jumlah;}

    public String getBarang(){
        return this.Barang;}

    public String getJenis(){
        return this.Jenis;}
    
    public String getHarga(){
        return this.Harga;}
    
    // Method setter
    public void setId(String IdBaru){
        this.Id = IdBaru;
    }
    public void setJumlah(String JumlahBaru){
        this.Id = JumlahBaru;
    }
    public void setBarang(String BarangBaru){
        this.Id = BarangBaru;
    } 
    public void setJenis(String JenisBaru){
        this.Id = JenisBaru;
    }
    public void setHarga(String HargaBaru){
        this.Id = HargaBaru;
    }
}