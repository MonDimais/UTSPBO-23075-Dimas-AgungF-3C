package javadb;

import java.time.LocalDate;
import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemTugas sistem = new SistemTugas(); // Asumsi ada class SistemTugas

        System.out.println("=== Tambah Tugas ===");
        
        boolean tambahLagi = true;

        while (tambahLagi) {
            System.out.print("Masukkan ID Tugas: ");
            int idTugas = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan Nama Tugas: ");
            String namaTugas = scanner.nextLine();

            System.out.print("Masukkan Deskripsi Tugas: ");
            String deskripsi = scanner.nextLine();

            System.out.print("Masukkan Deadline Tugas (format YYYY-MM-DD): ");
            String deadlineInput = scanner.nextLine();
            LocalDate deadlineTugas = LocalDate.parse(deadlineInput);

            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMatkul = scanner.nextLine();

            // Membuat objek Tugas dan menambahkannya ke sistem
            Tugas tugasBaru = new Tugas(idTugas, namaTugas, deskripsi, deadlineTugas, namaMatkul);
            sistem.tambahTugas(tugasBaru);

            System.out.println("Tugas berhasil ditambahkan!");

            // Tanyakan apakah ingin menambah tugas lagi
            System.out.print("Apakah ingin menambah tugas lagi? (y/n): ");
            String jawab = scanner.nextLine();
            tambahLagi = jawab.equalsIgnoreCase("y");
        }
        
        sistem.aturPrioritas();

        System.out.println("=== Daftar Tugas ===");
        sistem.tampilkanTugas(); // Asumsi ada method untuk menampilkan daftar tugas

        scanner.close();
    }
}
