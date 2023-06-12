
package Pertemuan4;


public class Bankberaksi {
    public static void main(String[] args) {
        
        
    //Membuat objek
    Bank Bank = new Bank("Mandiri","Banjarmasin","Platinum",4526787, 600);
    
    //membuat nilai atribut

    
    Bank Bank2 = new Bank("BNI","Banjarbaru","Gold", 4526765, 700);
    

    Bank.tampildata();
    
    Bank.setupdateBank();
    
    System.out.println("Saldo Akhir :"  + Bank.getupdateBank());
    }       
}
