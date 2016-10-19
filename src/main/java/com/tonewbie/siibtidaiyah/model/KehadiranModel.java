package com.tonewbie.siibtidaiyah.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Kehadiran")
public class KehadiranModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 2)        
    private String id;
    
    private String nis;
    private int kehadiran;
    private int ijin;
    private int sakit;
    private int tanpaKeterangan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getIjin() {
        return ijin;
    }

    public void setIjin(int ijin) {
        this.ijin = ijin;
    }

    public int getSakit() {
        return sakit;
    }

    public void setSakit(int sakit) {
        this.sakit = sakit;
    }

    public int getTanpaKeterangan() {
        return tanpaKeterangan;
    }

    public void setTanpaKeterangan(int tanpaKeterangan) {
        this.tanpaKeterangan = tanpaKeterangan;
    }
    
    
    
    
    
}

    
