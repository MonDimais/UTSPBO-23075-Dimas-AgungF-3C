package ReservasiHotel;

//Interface KemampuanCustomer menyimpan fungsi yang dimiliki Customer
public interface KemampuanCustomer {
    public abstract void mengecekKetersediaanKamar(Kamar[] cekKamar, int noKamar);
    public abstract void memesanKamar(Kamar[] pesanKamar, String nama, int noKamar, int lamaMenginap);
    public abstract void melihatDetailPesanan(String nama, int noKamar, int lamaMenginap);
}
