package ReservasiHotel;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Kamar[] hotel = new Kamar[30];
        
        //Membuat akun untuk Admin (Username dan Password)
        Admin Yawi = new Admin("admin_Yawi", "Airgalon");
        
        System.out.print("Masukkan username Admin: ");
        String usernameAdmin = input.nextLine();
        System.out.print("Masukkan password Admin: ");
        String passwordAdmin = input.nextLine();
        
        //Simulasi Login untuk Admin
        if (Yawi.login(usernameAdmin, passwordAdmin)) {
            System.out.println("Login admin berhasil.");
        } else {
            System.out.println("Login gagal.");
            return;
        }
        
        //Meminta nama Customer untuk dibuat Akunnya
        System.out.println("\n=== Pemesanan Kamar ===");
        System.out.print("Masukkan nama depan customer: ");
        String namaCustomer = input.nextLine();
        
        Customer Dimas = new Customer(namaCustomer, "DimsMeat");
        System.out.print("Masukkan nomor kamar: ");
        int nomKamar = input.nextInt();
        
        //Otomatis Mengecek Ketersediaan Kamar yang dipilih Customer
        Dimas.mengecekKetersediaanKamar(hotel, nomKamar);
        
        System.out.println("\n======Buat Reservasi======");
        System.out.print("Masukkan lama menginap (hari): ");
        int lamaMenginap = input.nextInt();
        input.nextLine();
        
        //Memasukkan data yang sudah diambil kedalam Fungsi MemesanKamar
        Dimas.memesanKamar(hotel, namaCustomer, nomKamar, lamaMenginap);
        
        //Mencetak Konfirmasi keberhasilan proses menginput data
        Dimas.melihatDetailPesanan(namaCustomer, nomKamar, lamaMenginap);
        
        //Simulasi untuk Admin mencari penghuni dan no kamarnya
        System.out.println("\n=== Pencarian Penghuni Kamar ===");
        System.out.print("Masukkan nama penghuni yang ingin dicari: ");
        String namaPenghuni = input.nextLine();
        Yawi.cariPenghuniKamar(hotel, namaPenghuni);
    }
}
