
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="raport")
public class RapotModel implements Serializable{
@Id
    @Column(name = "id_Raport", length = 2)        
    String idRaport;
    
    @Column(name = "id_Siswa", length = 50)
    String idSiswa;   
    
    @Column(name = "id_Kelas", length = 50)
    String idKelas; 
    
    @Column(name = "id_pelajaran", length = 50)
    String idPelajaran; 
    
    @Column(name = "tahun_pelajaran", length = 50)
    Integer tahunPelajaran; 
    
    @Column(name = "kkm", length = 50)
    String kkm; 
        
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf;
    
    @Column(name = "catatan_guru", length = 50)
    String catatanGuru; 
    
    
public String getIdRaport() {
        return idRaport;
    }

    public void setIdRaport(String idRaport) {
        this.idRaport = idRaport;
    }

public String getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(String idSiswa) {
        this.idSiswa = idSiswa;
    }
    
public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }
    
public String getIdPelajaran() {
        return idPelajaran;
    }

    public void setIdPelajaran(String idPelajaran) {
        this.idPelajaran = idPelajaran;
    }    
public Integer getTahunPelajaran() {
        return tahunPelajaran;
    }

    public void setKkm(String kkm) {
        this.kkm = kkm;
    }
    
public Integer getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(Integer nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    } 
public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public void setNilaiHuruf(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    } 
    
public String getCatatanGuru() {
        return catatanGuru;
    }

    public void setCatatanGuru(String catatanGuru) {
        this.catatanGuru = catatanGuru;
    }     
    
}
