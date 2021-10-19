/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_1931710111;

import java.util.ArrayList;

/**
 *
 * @author Sigma
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MahasiswaController controller = new MahasiswaController();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        
        try {
            listMahasiswa=controller.readObject();
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        Mahasiswa maha1 = new Mahasiswa("33333", "Edo Gardu", "TM", "TM", "4.0");
        listMahasiswa.add(maha1);
        controller.writeObject(listMahasiswa);
        for (int i = 0; i < controller.readObject().size(); i++) {
            System.out.println(i);
        }
    }
}
