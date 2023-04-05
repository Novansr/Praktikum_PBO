/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest5;

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
    abstract void setNama_barang(String nama_barang);
    abstract void setMerk_barang(String merk_barang);
    abstract void setHarga_barang(String harga_barang);
    abstract String getNama_barang();
    abstract String getMerk_barang();
    abstract String getHarga_barang();
    
    public void display(){
        System.out.println("Nama  : " + this.nama_barang);
        System.out.println("Merk  : " + this.merk_barang);
        System.out.println("Harga : " + this.harga_barang);
    }
    
    
   
}