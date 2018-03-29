package praktek002;


public class Penjualanhp {
    Integer hargahp;
    Integer jumlahbarang;

    public Penjualanhp()  {
    hargahp=2000000;
    jumlahbarang=10; 
    }

    public Penjualanhp(Integer hargahp, Integer jumlahbarang) {
        this.hargahp = hargahp;
        this.jumlahbarang = jumlahbarang;
    }
    
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
    void cetaktotal(){
        System.out.println("totalnya adalah: "+hitungtotal());
    }
}
