/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author Adtsaputra
 */
public class piano extends alatmusik{
    
    private int jumlah_tuch;
    private String tipe_pedal;
    
    public piano (String nama_barang, String merk_barang, String harga_barang, int jumlah_tuch, String tipe_pedal){
      
        super (nama_barang, merk_barang, harga_barang);
        this.jumlah_tuch=jumlah_tuch;
        this.tipe_pedal=tipe_pedal;
    }
    
     public int getjumlah_tuch(){
        return this.jumlah_tuch;
    }
    
      public String gettipe_pedal(){
        return this.tipe_pedal;
    }
      
     public void setjumlah_tuch(int jumlah_tuch){
        this.jumlah_tuch = jumlah_tuch;
    }
        
     public void settipe_pedal(String tipe_pedal){
        this.tipe_pedal = tipe_pedal;
    }
        
    
}

    
    

