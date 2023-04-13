/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Adtsaputra
 */
abstract class alatmusik {
    
    protected String nama_barang;
    protected String merk_barang;
    protected String harga_barang;
    
//    public alatmusik (String nama_barang, String merk_barang, String harga_barang){
//        this.nama_barang = nama_barang;
//        this.merk_barang = merk_barang;
//        this.harga_barang = harga_barang;
//    }    
    
    // ini method getter
    protected abstract String getNama_barang();
    protected abstract String getMerk_barang();
    protected abstract String getHarga_barang();
    
    public void display(){
        System.out.println("Nama  : " + this.nama_barang);
        System.out.println("Merk  : " + this.merk_barang);
        System.out.println("Harga : " + this.harga_barang);
    }
    
    
   
}