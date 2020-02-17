/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apaja;

/**
 *
 * @author ASUS
 */
public class polymorphism {

    public static void main(String[] args) {
        karyawan K[] = new karyawan[3];
        K[0] = new manager();
        K[1] = new receptionist();
        K[2] = new manager();
        for (int i = 0; i < 3; i++) {
            System.out.println("Gaji karyawan " + i + " adalah " + K[i].gettotalgaji());
        }
        for (int i = 0; i < 3; i++) {
            K[i].naikgaji();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Gaji karyawan " + i + " sekarang adalah "
                    + K[i].gettotalgaji());
        }
    }
}

