package ReservasiHotel;

//Class Customer menurun dari Class Pengguna
//Juga mengambil Fungsi dari Class KemampuanCustomer
public class Customer extends Pengguna implements KemampuanCustomer{
    
    public Customer(String username, String password) {
        super(username, password);
    }
    
    //Fungsi untuk mengecek ketersediaan kamar
    @Override
    public void mengecekKetersediaanKamar(Kamar[] cekKamar, int noKamar) {
        for (int i = 0; i < cekKamar.length; i++) {
            if (cekKamar[i] == null) {
                System.out.println("kamar Ini Sedang Kosong");
                break;
            } else {
                System.out.println("Kamar Ini Ada penghuninya");
            }
        }
    }
    
    //Fungsi untuk memasukkan data kedalam array
    @Override
    public void memesanKamar(Kamar[] pesanKamar, String nama, int noKamar, int lamaMenginap) {
        if (pesanKamar[noKamar] == null) {
            pesanKamar[noKamar] = new Kamar(nama, lamaMenginap);
            System.out.println("Kamar Berhasil dipesan Untuk " + nama + " Dikamar Nomor " + noKamar);
        } else {
            System.out.println("Kamar Sudah Terisi, Silahkan Pilih Kamar Lain");
        }
    }
    
    //Fungsi untuk mengeluarkan konfirmasi keberhasilan
    @Override
    public void melihatDetailPesanan(String nama, int noKamar, int lamaMenginap) {
        System.out.println("Tuan/Nyonya " + nama + " Sudah Berhasil Memesan");
        System.out.println("Kamar No " + noKamar + " Untuk " + lamaMenginap + " Hari");
    }
}
