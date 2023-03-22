/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author Adtsaputra
 */
public class alatmusik {
    
    protected String nama_barang;
    protected String merk_barang;
    protected String harga_barang;
    
    public alatmusik (String nama_barang, String merk_barang, String harga_barang){
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
        this.harga_barang = harga_barang;
    }    
    
    // ini method getter
    public String getNama(){
        return this.nama_barang;
    }
    
    public String getMerk(){
        return this.merk_barang;
    }
    
    public String getharga(){
        return this.harga_barang;
    }
    
    //ini method setter
    public void setNama(String namaBaru){
        this.nama_barang = namaBaru;
    }
    
    public void setMerk(String merkBaru){
        this.merk_barang = merkBaru;
    }
    
    public void setHarga(String hargaBaru){
        this.harga_barang = hargaBaru;
    }
    
}
