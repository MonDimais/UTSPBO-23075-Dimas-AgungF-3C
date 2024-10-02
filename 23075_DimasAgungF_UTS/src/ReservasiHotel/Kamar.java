package ReservasiHotel;

//Class Kamar untuk membuat Kamar dan List Kamar
public class Kamar{
    private String namaPenghuni;
    private int lamaMenginap;
    
    public String getNama() {
        return namaPenghuni;
    }
    
    public int getLamaMenginap() {
        return lamaMenginap;
    }
    
    public Kamar(String namaPenghuni, int lamaMenginap) {
        this.namaPenghuni = namaPenghuni;
        this.lamaMenginap = lamaMenginap;
    }
    
}
