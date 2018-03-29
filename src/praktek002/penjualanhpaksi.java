package praktek002;


public class penjualanhpaksi {
    public static void main(String[] args) {
        Penjualanhp r1 = new Penjualanhp();
        
        
       r1.hargahp = 1000000;
       r1.jumlahbarang = 10;
       
       r1.cetakInfo();
       System.out.println("total = "+r1.hitungtotal());
       }
  
}
