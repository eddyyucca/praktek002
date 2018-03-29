package praktek002;


public class penjualanhpaksi {
    public static void main(String[] args) {
        Penjualanhp r1 = new Penjualanhp();
        
        
       r1.hargahp = 1000000;
       r1.jumlahbarang = 10;
       
       r1.cetakInfo();
       System.out.println("total = "+r1.hitungtotal());
       r1.cetaktotal();
       
       Penjualanhp r2 = new Penjualanhp();
       r2.cetakInfo();
       
       Penjualanhp r3 = new Penjualanhp(3000000,30);
       r3.cetakInfo();
    }
  
}
