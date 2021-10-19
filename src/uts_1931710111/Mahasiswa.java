package uts_1931710111;

import java.io.Serializable;

public class Mahasiswa implements Serializable{

    public Mahasiswa() { 
    }

    public Mahasiswa(String nim, String nama, String prodi, String jurusan, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    private String nim,nama,prodi,jurusan,ipk;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return ""+nim+"\t"+nama+"\t"+jurusan+"\t"+prodi+"\t"+ipk;
    }
}