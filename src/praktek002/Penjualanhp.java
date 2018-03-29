package praktek002;


public class Penjualanhp {
    Integer hargahp;
    Integer jumlahbarang;
    
    void cetakInfo(){
        System.out.println("=======================");
        System.out.println("harga hp : "+hargahp);
        System.out.println("jumlah barang : "+jumlahbarang);
        System.out.println("=======================");
    }
    Integer hitungtotal(){
        Integer total;
        total=hargahp*jumlahbarang;
        return total;
    }

    String total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
