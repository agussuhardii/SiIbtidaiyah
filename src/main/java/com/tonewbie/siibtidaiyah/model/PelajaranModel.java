package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="pelajaran")
public class PelajaranModel implements Serializable {
@Id
    @Column(name = "id_pelajaran", length = 2)        
    String idPelajaran;
    
    @Column(name = "nama_pelajaran", length = 50)
    String namaPelajaran;   
    
    @Column(name = "id_pegawai", length = 50)
    String idPegawai; 
    
public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

public String getIdPelajaran() {
        return idPelajaran;
    }

    public void setIdPelajaran(String idPelajaran) {
        this.idPelajaran = idPelajaran;
    }
public String getNamaPelajaran() {
        return namaPelajaran;
    }

    public void setNamaPelajaran(String namaPelajaran) {
        this.namaPelajaran = namaPelajaran;
    }    
}
