package posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class posttest3 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<gitar> datagitar = new ArrayList<>();
        ArrayList<piano> datapiano = new ArrayList<>();
        
        while(true){
            System.out.println("____________________");
            System.out.println("  Toko Alat Musik   ");
            System.out.println("____________________");
            System.out.println("        Menu        ");
            System.out.println("____________________");
            System.out.println("1 Tambah Barang     ");
            System.out.println("2 Liat Barang       ");
            System.out.println("3 Update Barang     ");
            System.out.println("4 Hapus Barang      ");
            System.out.println("5 Exit              ");
            System.out.println("____________________");
            System.out.print("Pilihan :");
            
           int menu = Integer.parseInt(br.readLine());
           
           switch (menu) {
               case 1 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
                   System.out.println("Mau Tambah Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> {
                           System.out.print("Nama : ");
                           String name = br.readLine();
                           System.out.print("Merk : ");
                           String merk = br.readLine();
                           System.out.print("Harga : ");
                           String harga = br.readLine();
                           System.out.print("jenis : ");
                           String jenis = br.readLine();
                           System.out.print("scale : ");
                           double scale = Double.parseDouble(br.readLine());
                           gitar newmusik = new gitar(name, merk, harga, jenis, scale);
                           datagitar.add(newmusik);
                           System.out.print("");
                       }
                       case 2 -> {
                           System.out.print("Nama : ");
                           String name = br.readLine();
                           System.out.print("Merk : ");
                           String merk = br.readLine();
                           System.out.print("Harga : ");
                           String harga = br.readLine();
                           System.out.print("jumlah_tuch : ");
                           int jumlah_tuch = Integer.parseInt(br.readLine());
                           System.out.print("tipe_pedal : ");
                           String tipe_pedal= br.readLine();
                           piano newmusik = new piano(name, merk, harga, jumlah_tuch, tipe_pedal);
                           datapiano.add(newmusik);
                           System.out.print("");
                       }
                   }
                }
          
               case 2 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
                   System.out.println("Mau Liat Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> { 
                            for (int i = 0; i < datagitar.size(); i++){
                            System.out.println("Data pelanggan Ke : " + (i+1));
                            System.out.println("Nama  : " + datagitar.get(i).getNama());
                            System.out.println("Merk  : " + datagitar.get(i).getMerk());
                            System.out.println("Harga : " + datagitar.get(i).getharga());
                            System.out.println("jenis : " + datagitar.get(i).getjenis());
                            System.out.println("scale : " + datagitar.get(i).getscale());
                            }
                        }
                       case 2 -> { 
                            for (int i = 0; i < datapiano.size(); i++){
                            System.out.println("Data pelanggan Ke : " + (i+1));
                            System.out.println("Nama  : " + datapiano.get(i).getNama());
                            System.out.println("Merk  : " + datapiano.get(i).getMerk());
                            System.out.println("Harga : " + datapiano.get(i).getharga());
                            System.out.println("jumlah_tuch : " + datapiano.get(i).getjumlah_tuch());
                            System.out.println("tipe_pedal : " + datapiano.get(i).gettipe_pedal());
                            }
                        }
                    }
                }
               
                 
               case 3 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
                   System.out.println("Mau Ubah Data Apa ?:");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                        case 1 -> {
                            System.out.print("Masukan Nama Yang Mau Di Ubah ? :");
                            String Nama = br.readLine();
                            for (gitar setpelanggan : datagitar){
                                if (setpelanggan.getNama().equals(Nama)){
                                     System.out.println("Ganti merk Barang : ");
                                     setpelanggan.setMerk(br.readLine());
                                     System.out.println("Ganti harga Barang : ");
                                     setpelanggan.setHarga(br.readLine());
                                     System.out.println("Ganti jenis : ");
                                     setpelanggan.setjenis(br.readLine());
                                     System.out.println("Ganti scale : ");
                                     setpelanggan.setscale(Double.parseDouble(br.readLine()));
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("1. Data Gitar");
                            System.out.println("2. Data Piano");
                            System.out.println("Masukan Nama Yang Mau Di Ubah ? :");
                            String Nama = br.readLine();
                            for (piano setpelanggan : datapiano){
                                if (setpelanggan.getNama().equals(Nama)){
                                    System.out.println("Ganti merk Barang : ");
                                    setpelanggan.setMerk(br.readLine());
                                    System.out.println("Ganti harga Barang : ");
                                    setpelanggan.setHarga(br.readLine());
                                    System.out.println("Ganti jumlah_tuch : ");
                                    setpelanggan.setjumlah_tuch(Integer.parseInt(br.readLine()));
                                    System.out.println("Ganti tipe_pedal : ");
                                    setpelanggan.settipe_pedal(br.readLine());
                                }
                            }
                        }
                    }
               }
               
                
               case 4 -> {
                    System.out.println("1. Data Gitar");
                    System.out.println("2. Data Piano");
                     System.out.println("Mau Hapus Data Apa ? :");
                    int pilihan1 = Integer.parseInt(br.readLine());
                    switch (pilihan1) {
                        case 1 -> {
                            System.out.println("Hapus Merk Barang");
                            System.out.println("Masukkan Merk Barang : ");
                            String hapus_data = br.readLine();
                            for(int i = 0; i < datagitar.size(); i++){
                                if(datagitar.get(i).getMerk().equals(hapus_data)){
                                    datagitar.remove(i);
                                    System.out.println("data berhasil dihapus");
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Hapus Merk Barang");
                            System.out.println("Masukkan Merk Barang : ");
                            String hapus_data = br.readLine();
                            for(int i = 0; i < datapiano.size(); i++){
                                if(datapiano.get(i).getMerk().equals(hapus_data)){
                                    datapiano.remove(i);
                                    System.out.println("data berhasil dihapus");
                                }
                            }
                      }
                     }
               }
               case 5 -> {
                   System.exit(menu);
                }
                   
           }
        }
    }
}