
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="qiroati")
public class QiroatiModel implements Serializable {
@Id
    @Column(name = "id_Qiroati", length = 2)        
    String idQiroati;
    
    @Column(name = "jilid", length = 50)
    String jilid;   
    
    @Column(name = "halaman", length = 50)
    int halaman; 
    
    @Column(name = "ayat", length = 50)
    String ayat; 
    
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf; 
    
    private String nis;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    
    
    
public String getIdQiroati() {
        return idQiroati;
    }

    public void setIdQiroati(String idQiroati) {
        this.idQiroati = idQiroati;
    }

    public String getJilid() {
        return jilid;
    }

    public void setJilid(String jilid) {
        this.jilid = jilid;
    }


    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    
public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
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
