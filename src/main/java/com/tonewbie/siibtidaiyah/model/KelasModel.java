package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//kelas ini mereferentasikan table di database
@Entity
@Table(name = "kelas")
public class KelasModel implements Serializable{
    @Id
    @Column(name = "id_kelas", length = 2)        
    String idKelas;
    
    @Column(name = "nama_kelas", length = 50)
    String namaKelas;
    
    
    

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
}
