/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg101117061.latihan33.oouserlogin;


/**
 *
 * @author Notebook
 */
public class User {
  
 public boolean status;
    private String db_user = "rian";
    private String db_pass = "whaturname";
    
    public boolean cekAkun(String username, String password) {
        if(username.equals(db_user) && password.equals(db_pass)) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    public void hasilLogin(boolean status, String username) {
        if(status) {
            System.out.println("****** HALLO " + username.toUpperCase() + " ******");
            System.out.println("Selamat Datang di Aplikasi ini.");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    public void pengecekanLogin(String username, String password) {
        System.out.println(cekAkun(username,password));
        hasilLogin(status,username);
}

}
