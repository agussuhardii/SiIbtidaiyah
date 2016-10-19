
package com.tonewbie.siibtidaiyah.model;

import com.tonewbie.siibtidaiyah.model.enumfile.KeteranganPelajaranEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.SmesterEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="raport")
public class RapotModel implements Serializable{
@Id
    @Column(name = "id_Raport", length = 2)        
    String idRaport;
    
    @Column(name = "nis", length = 50)
    String nis;   
    
    @Column(name = "id_Kelas", length = 50)
    String idKelas; 
    
    @Column(name = "id_pelajaran", length = 50)
    String idPelajaran; 
    
    @Column(name = "tahun_pelajaran", length = 50)
    Integer tahunPelajaran; 
    
    @Column(name = "kkm", length = 50)
    String kkm; 
        
    @Column(name = "nilai_angka", length = 50)
    Integer nilaiAngka; 
    
    @Column(name = "nilai_huruf", length = 50)
    String nilaiHuruf;
    
    @Column(name = "catatan_guru", length = 50)
    String catatanGuru; 
    
    SmesterEnum smester;
    KeteranganPelajaranEnum keterangan;

    public String getIdRaport() {
        return idRaport;
    }

    public void setIdRaport(String idRaport) {
        this.idRaport = idRaport;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getIdPelajaran() {
        return idPelajaran;
    }

    public void setIdPelajaran(String idPelajaran) {
        this.idPelajaran = idPelajaran;
    }

    public Integer getTahunPelajaran() {
        return tahunPelajaran;
    }

    public void setTahunPelajaran(Integer tahunPelajaran) {
        this.tahunPelajaran = tahunPelajaran;
    }

    public String getKkm() {
        return kkm;
    }

    public void setKkm(String kkm) {
        this.kkm = kkm;
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

    public String getCatatanGuru() {
        return catatanGuru;
    }

    public void setCatatanGuru(String catatanGuru) {
        this.catatanGuru = catatanGuru;
    }

    public SmesterEnum getSmester() {
        return smester;
    }

    public void setSmester(SmesterEnum smester) {
        this.smester = smester;
    }

    public KeteranganPelajaranEnum getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(KeteranganPelajaranEnum keterangan) {
        this.keterangan = keterangan;
    }
    
    
    
    
}
