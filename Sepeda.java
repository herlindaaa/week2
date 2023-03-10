public class Sepeda {
    //ini adalah tempat atribut
    int gear = 5;
    int roda;
    String Jenis;
    String Merk;

    //ini adalah tempat method
    void ngerem(){
        System.out.println("Sepeda direm");
    }

    Sepeda(int jumlahRoda, String jenis, String merk){
        roda = jumlahRoda;
        Jenis = jenis;
        Merk = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}
