/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg101117061.latihan33.oouserlogin;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PBO2101117061Latihan33OOuserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        User signin = new User();
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username\t: ");
        String user = scn.next();
        System.out.print("Masukkan Password\t: ");
        String pass = scn.next();
        System.out.println();

        signin.pengecekanLogin(user, pass);

    }

}
