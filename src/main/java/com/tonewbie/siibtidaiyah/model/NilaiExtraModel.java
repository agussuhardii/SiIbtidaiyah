
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "nilai_ekstra_kulikuler")
public class NilaiExtraModel implements Serializable{
 @Id
    @Column(name = "id_extra", length = 2)        
    String idExtra;
    
    @Column(name = "jenis_extra", length = 50)
    String jenisExtra;   
    
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf; 
    
    String nisSiswa;

    public String getNisSiswa() {
        return nisSiswa;
    }

    public void setNisSiswa(String nisSiswa) {
        this.nisSiswa = nisSiswa;
    }

    
    
public String getIdExtra() {
        return idExtra;
    }

    public void setIdExtra(String idExtra) {
        this.idExtra = idExtra;
    }

public String getJenisExtra() {
        return jenisExtra;
    }

    public void setJenisExtra(String jenisExtra) {
        this.jenisExtra = jenisExtra;
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
