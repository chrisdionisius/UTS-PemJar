package uts_1931710111;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class MahasiswaController {

    ArrayList<Mahasiswa> listMahasiswa;

    public MahasiswaController() throws Exception {
        try {
            listMahasiswa = readObject();
        } catch (Exception e) {
            listMahasiswa = new ArrayList<>();
        }
    }

    public void writeObject(Object o) throws Exception {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("maha1.obj"));
            oos.writeObject(o);
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void addObject(Mahasiswa o) throws Exception {
        try {
            listMahasiswa.add(o);
            writeObject(listMahasiswa);
        } catch (Exception e) {
        }
        
    }

    public void updateObject(Mahasiswa o, int idx) throws Exception {
        listMahasiswa.set(idx, o);
        writeObject(listMahasiswa);
    }

    public void deleteObject(int idx) throws Exception {
        listMahasiswa.remove(idx);
        writeObject(listMahasiswa);
    }

    public ArrayList<Mahasiswa> readObject() throws Exception {
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("maha1.obj"));
            Object readObject = ois.readObject();
            listMahasiswa = (ArrayList<Mahasiswa>) readObject;
            ois.close();
            return listMahasiswa;
        } catch (ClassNotFoundException ex) {
            throw ex;
        }
    }

    public void importData() throws Exception {
        JFileChooser j = new JFileChooser("f:");
        j.showSaveDialog(null);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(j.getSelectedFile().getAbsolutePath()));

        try {
            Object readObject = ois.readObject();
            listMahasiswa = (ArrayList<Mahasiswa>) readObject;
            ois.close();
        } catch (ClassNotFoundException ex) {
            throw ex;
        }
        writeObject(listMahasiswa);

    }

    public void exportData() throws Exception {
        JFileChooser j = new JFileChooser("f:");
        j.showSaveDialog(null);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(j.getSelectedFile().getAbsolutePath()+".backup"));
            oos.writeObject(listMahasiswa);
            oos.flush();
            oos.close();
            FileWriter writer = new FileWriter(j.getSelectedFile().getAbsolutePath()+".txt"); 
            for(Mahasiswa str: listMahasiswa) {
                writer.write(str.toString() + System.lineSeparator());
            }
            writer.close();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
