package ReservasiHotel;

//Class Admin menurun dari Class Pengguna
//Juga mengambil Fungsi dari Class KemampuanAdmin
public class Admin extends Pengguna implements KemampuanAdmin{
    
    public Admin(String username, String password) {
        super(username, password);
    }
    
    //Fungsi yang dimiliki Admin, bisa mencari penghuni sebuah kamar
    @Override
    public void cariPenghuniKamar(Kamar[] cariPenghuni, String namaPenghuni) {
        boolean ketemu = false;
        for (int i = 0; i < cariPenghuni.length; i++) {
            if (cariPenghuni[i] != null && cariPenghuni[i].getNama().equalsIgnoreCase(namaPenghuni)) {
                System.out.println(namaPenghuni + " Saat ini Berada di Kamar No " + i);
                ketemu = true;
                break;
            }
        }
        
        if (!ketemu) {
            System.out.println("Penguhuni Tidak Ditemukan.");
        }
    }
    
}
