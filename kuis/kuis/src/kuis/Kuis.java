/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author npm belakang 36(genap) menggunakan koperasi
 */
public class Kuis {
/**
 * Method yg mendeklarasikan 3 atribut yaitu nama,alamat,ktp
 */
    public String nama;
    public  String alamat;
    public String KTP;
    private float Saldo;
    //Public,private termasuk modifier 
    
    Kuis(String nama, String alamat,String KTP){
        this.nama = nama;
        this.alamat = alamat;
        this.KTP =KTP;
        this.Saldo = 0;
    }

    Kuis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Method 1 VOID
    public void setNama(String nama){
        this.nama = nama;
    }
   //method 2 Void 
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
     public void setKTP(String KTP){
        this.KTP = KTP;
    }
    
    
     public String getNama(){
        return nama;   
    }
    //Method 3 no void
      public String getAlamat(){
        return alamat;
      }
     public String getKTP(){
        return KTP;
      }
 
     public float getSaldo(float uang){
    return Saldo;
    }
    public void setor(float uang){
        Saldo +=uang;
    }
    public void pinjam(float uang){
        Saldo -=uang;
    }

   // void Nama() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    void getNamatidakada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
