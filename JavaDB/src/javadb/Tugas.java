package javadb;

import java.time.LocalDate;

class Tugas {
    private int idTugas;
    private String namaTugas;
    private String deskripsi;
    private LocalDate deadlineTugas;
    private String namaMatkul;
    private int prioritas;

    // Constructor
    public Tugas(int idTugas, String namaTugas, String deskripsi, LocalDate deadlineTugas, String namaMatkul) {
        this.idTugas = idTugas;
        this.namaTugas = namaTugas;
        this.deskripsi = deskripsi;
        this.deadlineTugas = deadlineTugas;
        this.namaMatkul = namaMatkul;
        this.prioritas = 0; // Default prioritas adalah 0
    }

    // Getter dan Setter
    public int getIdTugas() {
        return idTugas;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public LocalDate getDeadlineTugas() {
        return deadlineTugas;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(int prioritas) {
        this.prioritas = prioritas;
    }

    // Method untuk mengedit tugas
    public void editTugas(String namaTugas, String deskripsi, LocalDate deadlineTugas, String namaMatkul) {
        this.namaTugas = namaTugas;
        this.deskripsi = deskripsi;
        this.deadlineTugas = deadlineTugas;
        this.namaMatkul = namaMatkul;
    }

    // Method untuk menghapus tugas (contoh implementasi)
    public void hapusTugas() {
        System.out.println("Tugas dengan ID " + idTugas + " telah dihapus.");
    }

    // Method untuk set reminder (placeholder)
    public void setReminder() {
        System.out.println("Reminder telah disetel untuk tugas: " + namaTugas);
    }
}