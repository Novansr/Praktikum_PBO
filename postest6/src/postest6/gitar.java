/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Adtsaputra
 */
public class gitar extends alatmusik implements Data{ 
    
    private String jenis;
    private double scale;
    
    gitar (String nama_barang, String merk_barang, String harga_barang, String jenis, double scale){
      
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
        this.harga_barang = harga_barang;
        this.jenis = jenis;
        this.scale = scale;
    }

    @Override
    public String getNama_barang() {
        return nama_barang;
    }

    @Override
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    @Override
    public String getMerk_barang() {
        return merk_barang;
    }

    @Override
    public void setMerk_barang(String merk_barang) {
        this.merk_barang = merk_barang;
    }

    @Override
    public String getHarga_barang() {
        return harga_barang;
    }

    @Override
    public void setHarga_barang(String harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
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
        System.out.println("Jenis : " + this.jenis);
        System.out.println("Scale : " + this.scale);
    }
}