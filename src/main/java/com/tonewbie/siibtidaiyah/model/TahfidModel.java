
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="tahfid")
public class TahfidModel implements Serializable{
@Id
    @Column(name = "id_Tahfid", length = 2)        
    String idTahfid;
    
    @Column(name = "surat", length = 50)
    String surat;   
    
    @Column(name = "nilai angka", length = 50)
    Integer nilaiAngka;
    
    @Column(name = "nilai huruf", length = 50)
    String nilaiHuruf;
    
    private String nis;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }
    
    
public String getIdTahfid() {
        return idTahfid;
    }

    public void setIdTahfid(String idTahfid) {
        this.idTahfid = idTahfid;
    }

public String getSurat() {
        return surat;
    }

    public void setSurat(String surat) {
        this.surat = surat;
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
