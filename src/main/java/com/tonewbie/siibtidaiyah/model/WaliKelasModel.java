
package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="WaliKelas")
public class WaliKelasModel implements Serializable{
    @Id
    String id;
    
    @Column(name = "id_Pegawai", length = 2)        
    String idPegawai;
    
    @Column(name = "id_kelas", length = 50)
    String idKelas;   
    
    @Column(name = "jumlah_siswa", length = 50)
    Integer jmlSiswa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public Integer getJmlSiswa() {
        return jmlSiswa;
    }

    public void setJmlSiswa(Integer jmlSiswa) {
        this.jmlSiswa = jmlSiswa;
    }

    
}
