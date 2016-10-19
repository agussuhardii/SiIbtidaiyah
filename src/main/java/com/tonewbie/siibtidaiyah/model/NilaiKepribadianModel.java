
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nilaikepribadian")
public class NilaiKepribadianModel implements Serializable {
    @Id
    @Column(name = "id", length = 2)        
    String id;
    
    @Column(name = "nis_siswa", length = 2)        
    String nisSiswa;
    
    @Column(name = "perkembangan", length = 50)
    String perkembangan;   
    
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf; 

    public String getNisSiswa() {
        return nisSiswa;
    }

    public void setNisSiswa(String nisSiswa) {
        this.nisSiswa = nisSiswa;
    }
    
    

public String getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(String perkembangan) {
        this.perkembangan = perkembangan;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
