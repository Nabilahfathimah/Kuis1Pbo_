/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Koperasiiiiii
 */
public class Koperasi1 {
 //constructor dg parameter
    public static void  main(String[] args){
        Kuis anggota1 = new Kuis("Nabilah","Jl Italia N0:81","202043502536");
      //  System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan(0));
        System.out.println("        Koperasi Emak       ");
        System.out.println(" Menyimpan dan Meminjam Sangat Mudah");
        System.out.println("=====================================");
        System.out.println("Nama             :"+anggota1.getNama());
        System.out.println("No Ktp           :"+anggota1.getKTP());
        System.out.println("Alamat           :"+anggota1.getAlamat());
        System.out.println("--------------------------------------");

        anggota1.setor(10000);
        System.out.println("Saldo " +anggota1.getNama()+ "    : Rp "+anggota1.getSaldo(0));
        
        anggota1.pinjam(5000);
        System.out.println("Saldo " +anggota1.getNama()+ "    : Rp "+ anggota1.getSaldo(0));
    } 
}
   

