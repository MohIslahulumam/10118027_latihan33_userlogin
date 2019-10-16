/*
/** NAMA              : M Islahul Umam djasuta
* KELAS             : IF-01
* NIM               : 10118027
* DESKRIPSI PROGRAM : User login*/
 
package pkg10118027_if.pkg1_latihan33_userlogin;

import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class Main {

    private static String uname;
    private static String pass;
    public static void main(String[] args) {
        User login = new User();
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Usernama anda\t= ");
        uname = masuk.next();
        System.out.print("Masukkan Password\t= ");
        pass = masuk.next();
        
        login.pengecekkanLogin(uname, pass);
    }

}