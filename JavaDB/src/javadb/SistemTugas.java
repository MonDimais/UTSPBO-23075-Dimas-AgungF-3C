package javadb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SistemTugas {
    private ArrayList<Tugas> daftarTugas;

    public SistemTugas() {
        this.daftarTugas = new ArrayList<>();
    }

    // Tambah tugas ke dalam daftar
    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
    }

    // Mengatur prioritas berdasarkan deadline
    public void aturPrioritas() {
        Collections.sort(daftarTugas, new Comparator<Tugas>() {
            @Override
            public int compare(Tugas t1, Tugas t2) {
                return t1.getDeadlineTugas().compareTo(t2.getDeadlineTugas());
            }
        });

        // Set nilai prioritas berdasarkan urutan
        for (int i = 0; i < daftarTugas.size(); i++) {
            daftarTugas.get(i).setPrioritas(i + 1);
        }
    }

    // Menampilkan daftar tugas dengan prioritas
    public void tampilkanTugas() {
        for (Tugas tugas : daftarTugas) {
            System.out.println("ID: " + tugas.getIdTugas() +
                               ", Nama: " + tugas.getNamaTugas() +
                               ", Deadline: " + tugas.getDeadlineTugas() +
                               ", Prioritas: " + tugas.getPrioritas());
        }
    }
}