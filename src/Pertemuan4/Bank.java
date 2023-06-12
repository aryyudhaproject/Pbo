
package Pertemuan4;


public class Bank {
    
    //Membuat Atribut
    String namabank,domisili,jenistabungan;
    int rekening,saldoakhir;
    
    //Membuat Mutator
    void setupdateBank(){
        saldoakhir = saldoakhir + 100;
    }
    
    //Membuat Assesor
    int getupdateBank(){
        return saldoakhir;
    }
    
    
    //Membuat Method
    void tampildata(){
    System.out.println("Nama Bank       :"+namabank);
    System.out.println("Domisili        :"+domisili);
    System.out.println("Jenis Tabungan  :"+jenistabungan);
    System.out.println("Rekening        :"+rekening);
    System.out.println("Saldo Akhir     :"+saldoakhir);
            
    }
    
    
//Membuat Konstruktor
    Bank(String namabank,String domisili,String jenistabungan,int rekening,int saldoakhir){
    this.namabank = namabank;
    this.domisili = domisili;
    this.rekening = rekening;
    this.jenistabungan = jenistabungan;
    this.saldoakhir = saldoakhir;
    
    }   
}
