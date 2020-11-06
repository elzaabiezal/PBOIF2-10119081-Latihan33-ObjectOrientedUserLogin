/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan33.objectorienteduserlogin;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: User Login
 */
public class PBOIF210119081Latihan33ObjectOrientedUserLogin {
    private static String usName,passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukkan Username : ");
        usName = keyboard.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = keyboard.nextLine();
        
        user.pengecekanLogin(usName,passWord);
        
    }
    
}
