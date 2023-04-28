package posttest6;


public class piano extends Musik implements Data{
    private String Merk;
    private double scale;
    
    piano (String Id, String Jumlah, String Jenis, String Barang, String Harga, String Merk, double scale){
      
        this.Id=Id;
        this.Jumlah=Jumlah;
        this.Jenis=Jenis;
        this.Barang=Barang;
        this.Harga=Harga;
        this.Merk=Merk;
        this.scale=scale;
    }
    
    @Override
    public String getId() {
        return Id;
    }

    @Override
    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String getJumlah() {
        return Jumlah;
    }

    @Override
    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }
    
    @Override
    public String getJenis() {
        return Jenis;
    }

    @Override
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    @Override
    public String getBarang() {
        return Barang;
    }

    @Override
    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    @Override
    public String getHarga() {
        return Harga;
    }

    @Override
    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }
    
    @Override
    public void display(){
        super.display();
//        System.out.println("Id Barang  : " + this.Id);
//        System.out.println("Jumlah Barang  : " + this.Jumlah);
//        System.out.println("Nama Barang  : " + this.Barang);
//        System.out.println("Jenis Barang  : " + this.Jenis);
//        System.out.println("Harga Barang : " + this.Harga);
        System.out.println("Jenis : " + this.Merk);
        System.out.println("Scale : " + this.scale);
    }
}