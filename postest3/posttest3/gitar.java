/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author Adtsaputra
 */
public class gitar extends alatmusik{ 
    
    private String jenis;
    private double scale;
    
    public gitar (String nama_barang, String merk_barang, String harga_barang, String jenis, double scale){
      
        super (nama_barang, merk_barang, harga_barang);
        this.jenis=jenis;
        this.scale=scale;
    }
    
     public String getjenis(){
        return this.jenis;
    }
    
      public double getscale(){
        return this.scale;
    }
      
     public void setjenis(String jenis){
        this.jenis = jenis;
    }
        
     public void setscale(double scale){
        this.scale = scale;
    }
        
    
}
