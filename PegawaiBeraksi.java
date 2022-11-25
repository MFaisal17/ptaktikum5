package Tugas_oop;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager ("Rahmat",6000000.00);
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("=======================================");
        Programer programer = new Programer ("Ririn",6000000.00);
        programer.cetakinfo();
        programer.cetakBonus();
    
    }

 }
   