/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Adtsaputra
 */
public class piano extends alatmusik implements Data{
    
    private int jumlah_tuch;
    private String tipe_pedal;
    
    piano (String nama_barang, String merk_barang, String harga_barang, int jumlah_tuch, String tipe_pedal){
      
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
        this.harga_barang = harga_barang;
        this.jumlah_tuch = jumlah_tuch;
        this.tipe_pedal = tipe_pedal;
    }

    public int getJumlah_tuch() {
        return jumlah_tuch;
    }

    public void setJumlah_tuch(int jumlah_tuch) {
        this.jumlah_tuch = jumlah_tuch;
    }

    public String getTipe_pedal() {
        return tipe_pedal;
    }

    public void setTipe_pedal(String tipe_pedal) {
        this.tipe_pedal = tipe_pedal;
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
        
    @Override
    public void display(){
        super.display();
        System.out.println("Jumlah_tuch : " + this.jumlah_tuch);
        System.out.println("Tipe_pedal : " + this.tipe_pedal);
    }   
}