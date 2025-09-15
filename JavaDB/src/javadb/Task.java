package javadb;

class Task {
    private String namaTugas;
    private String namaMatkul;
    private String deadline;
    private String deskripsi;

    public Task(String namaTugas, String namaMatkul, String deadline, String deskripsi) {
        this.namaTugas = namaTugas;
        this.namaMatkul = namaMatkul;
        this.deadline = deadline;
        this.deskripsi = deskripsi;
    }

    // Getter methods
    public String getNamaTugas() {
        return namaTugas;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
