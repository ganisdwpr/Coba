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
public class manager extends karyawan {

    manager() {
        gaji += 2000000;
        setbonus(500000);
    }

    @Override
    void naikgaji() {
        gaji += 3000000;
    }
}

