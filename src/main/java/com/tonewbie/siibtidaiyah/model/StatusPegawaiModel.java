
package com.tonewbie.siibtidaiyah.model;

import com.tonewbie.siibtidaiyah.model.enumfile.StatusPegawaiEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.TugasUtamaPegawaiEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="status_pegawai")
public class StatusPegawaiModel implements Serializable {
    @Id
    private String id;
    
    @Column(name = "id_Pegawai", length = 2)        
    String idPegawai;
    
    StatusPegawaiEnum status;
    
    @Column(name = "tempat_tugas", length = 50)
    String tempat;   
    
    TugasUtamaPegawaiEnum tugasUtama;
    
    @Column(name = "tugas_lain", length = 50)
    String tugasLain; 
    
    
    

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

    public StatusPegawaiEnum getStatus() {
        return status;
    }

    public void setStatus(StatusPegawaiEnum status) {
        this.status = status;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public TugasUtamaPegawaiEnum getTugasUtama() {
        return tugasUtama;
    }

    public void setTugasUtama(TugasUtamaPegawaiEnum tugasUtama) {
        this.tugasUtama = tugasUtama;
    }

    public String getTugasLain() {
        return tugasLain;
    }

    public void setTugasLain(String tugasLain) {
        this.tugasLain = tugasLain;
    }

}
