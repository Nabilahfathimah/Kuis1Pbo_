
package kuis;


public class tanpaparameter {
    String Nama;
     //tanpa parameter
   // Public Tanpaparameter;
   // void Nama2(){
   //   System.out.println("Nama             :"+KTP+"Tidak terdaftar");   
   // }
   public tanpaparameter(){
       Nama = "Asila";
               }
   void Namatidakada(){
       System.out.println("Nama" +Nama+"Nama tidak ditemukan");
    
   }
    public static void  main(String[] args){
       Kuis anggota2 = new Kuis();
       //memanggil object
       anggota2.getNamatidakada();
      // System.out.println("Nama"+anggota2.getNama());
   }
}

