package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="pembiasaan")
public class PembiasaanModel implements Serializable{
@Id
    @Column(name = "id_Pembiasaan", length = 2)        
    String idPembiasaan;
    
    @Column(name = "jenis_Kegiatan", length = 50)
    String jenisKegiatan;   
    
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf; 
    
    String nis;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }
    
    
    
public String getIdPembiasaan() {
        return idPembiasaan;
    }

    public void setIdPembiasaan(String idPembiasaan) {
        this.idPembiasaan = idPembiasaan;
    }

public String getJenisKegiatan() {
        return jenisKegiatan;
    }

    public void setJenisKegiatan(String jenisKegiatan) {
        this.jenisKegiatan = jenisKegiatan;
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
}
