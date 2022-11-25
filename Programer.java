package Tugas_oop;

public class Programer {
    double Bonus;

    //Subclass Constructor
    public Programer(String Name,double GajiPokok) {
        super(Name, Gajipokok);
    }
    public void setBonus(double Bonus){
        this.Bonus = Bonus;
    }
    public double getBonus() {
        return this.Bonus;
    }

    @Override
    public void cetakinfo() {
        super.cetakinfo();
    }

    public void cetakBonus() {
        Bonus = 3000000.00;
        System.out.println("Bonus : Rp." + this.Bonus);
    }   
}