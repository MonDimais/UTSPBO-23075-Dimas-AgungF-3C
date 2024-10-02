package ReservasiHotel;

//Class Pengguna dibuat sebagai Base atau Cetakan untuk Akun Admin dan Customer
//Sebagai SuperClass
public class Pengguna {
    protected String username, password;
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public Pengguna (String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
