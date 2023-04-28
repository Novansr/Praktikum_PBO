package posttest6;

abstract class Musik {
    protected String Id;
    protected String Jumlah;
    protected String Jenis;
    protected String Barang;
    protected String Harga;
       
    protected abstract String getId();
    protected abstract String getJumlah();
    protected abstract String getJenis();
    protected abstract String getBarang();
    protected abstract String getHarga();

    public void display(){
        System.out.println("Id Barang  : " + this.Id);
        System.out.println("Jumlah Barang  : " + this.Jumlah);
        System.out.println("Nama Barang  : " + this.Barang);
        System.out.println("Jenis Barang  : " + this.Jenis);
        System.out.println("Harga Barang : " + this.Harga);
    }
}