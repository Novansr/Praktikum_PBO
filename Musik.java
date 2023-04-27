package posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class MUSIK{
    private String Id;
    private String Jumlah;
    private String Jenis;
    private String Barang;
    private String Harga;
    
    public MUSIK (String Id, String Jumlah, String Jenis, String Barang, String Harga){
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
    
    //ini method setter
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
public class Posttest2 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<MUSIK> Item = new ArrayList<>();
        
        while(true){
         System.out.println("*---------- Musik Shop ---------*");
         System.out.println("* [1] Tambah Data                *");
         System.out.println("* [2] Lihat Data                 *");
         System.out.println("* [3] Update Data                *");
         System.out.println("* [4] Hapus Data                 *");
         System.out.println("* [5] Keluar                     *");
         System.out.println("*-------------------------------*");
         System.out.print("Pilih Menu : ");
            
           int menu = Integer.parseInt(br.readLine());
           
           switch (menu) {
               case 1 -> {
                   System.out.print("Id : ");
                   String Id = br.readLine();
                   System.out.print("Jumlah Barang : ");
                   String Jumlah = br.readLine();
                   System.out.print("Nama Barang : ");
                   String Barang = br.readLine();
                   System.out.print("Jenis Barang : ");
                   String Jenis = br.readLine();
                   System.out.print("Harga Barang : ");
                   String Harga = br.readLine();
                   MUSIK newMusik = new MUSIK(Id, Jumlah, Jenis, Barang, Harga);
                   Item.add(newMusik);
                }
               case 2 -> {
                   System.out.println("Lihat Data ");
                   for (int i = 0; i < Item.size(); i++){
                       System.out.println("Data pelanggan Ke : " + (i+1));
                       System.out.println("Id  : " + Item.get(i).getId());
                       System.out.println("Jumlah BArang  : " + Item.get(i).getJumlah());
                       System.out.println("Nama Barang : " + Item.get(i).getBarang());
                       System.out.println("Jenis  : " + Item.get(i).getJenis());
                       System.out.println("Harga : " + Item.get(i).getHarga());
                   }
                }
               case 3 -> {
                   System.out.println("Masukkan Id Barang :");
                   String Id = br.readLine();
                   for (MUSIK setpelanggan : Item){
                       if (setpelanggan.getId().equals(Id)){
                           System.out.println("Ganti Id Barang : ");
                           setpelanggan.setId(br.readLine());
                          
                           System.out.println("Ganti Jumlah Barang : ");
                           setpelanggan.setJumlah(br.readLine());
                           
                           System.out.println("Ganti Nama Barang : ");
                           setpelanggan.setBarang(br.readLine());
                           
                           System.out.println("Ganti Jenis Barang : ");
                           setpelanggan.setJenis(br.readLine());
                           
                           System.out.println("Ganti Harga Barang : ");
                           setpelanggan.setHarga(br.readLine());
                       }
                   }
                }
               case 4 -> {
                   System.out.println("Hapus Nama Barang");
                   System.out.println("Masukkan Nama Barang : ");
                   String hapus_data = br.readLine();
                   for(int i = 0; i < Item.size(); i++){
                       if(Item.get(i).getBarang().equals(hapus_data)){
                           Item.remove(i);
                           System.out.println("data berhasil dihapus");
                       }
                       
                   }
                }
               case 5 -> {
                   exitProgram();
                   break;
                   //System.exit(menu);
                }
                   
           }
        }
    }
    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anda yakin ingin keluar dari program? (y/n): ");
        String confirmation = scanner.nextLine();
        
        if (confirmation.equalsIgnoreCase("y")) {
            System.out.println("Terima kasih telah menggunakan program kami. Sampai jumpa!");
            System.exit(0);
        } else if (confirmation.equalsIgnoreCase("n")) {
            // tidak melakukan apa-apa, kembali ke menu
        } else {
            System.out.println("Pilihan yang Anda masukkan salah. Silakan coba lagi.");
        }
    }
}
