/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan33.objectorienteduserlogin;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: User Login
 */
public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun (String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) { 
            return statusAkun = true;
        } else {
            return statusAkun = false;
        }
    }
    
    private void hasilLogin (boolean status, String parUserName) {
        status = statusAkun;
        if (status) {
            System.out.println("******HALO RIZKIADAM******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword) {
        cekAkun(parUserName,parPassword);
        System.out.println();
        hasilLogin(statusAkun,parUserName);
    }
    
}