package com.tonewbie.siibtidaiyah.model;

import com.tonewbie.siibtidaiyah.model.enumfile.AgamaEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.JenisKelaminEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.LkkEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="Siswa")
public class SiswaModel implements Serializable{
@Id
    @Column(name = "id_Siswa", length = 2)        
    String idSiswa;
    
    @Column(name = "nisn", length = 50)
    String nisn;   
    
    @Column(name = "nik", length = 50)
    String nik; 
    
    @Column(name = "nama_siswa", length = 50)
    String namaSiswa; 
    
    @Column(name = "tempat_lahir", length = 50)
    String tempatLahir; 
    
    @Column(name = "tanggal_lahir", length = 50)
    @Temporal(javax.persistence.TemporalType.DATE)
    Date tanggalLahir; 
        
    @Column(name = "asal_sekolah", length = 50)
    String asalSekolah; 
    
    @Column(name = "hobby", length = 50)
    String hobby;
    
    @Column(name = "cita-cita", length = 50)
    String cita; 
    
    @Column(name = "jumlah saudara", length = 50)
    Integer jumlahSaudara;
    
    @Column(name = "nama ayah", length = 50)
    String ayah;
    
    @Column(name = "alamat", length = 50)
    String alamat; 
    
    String agama;
    @Column(name = "jenis_kelamin")
    JenisKelaminEnum jenisKelamin;
    LkkEnum lkk;

    String waliKelas;

    public String getWaliKelas() {
        return waliKelas;
    }

    public void setWaliKelas(String waliKelas) {
        this.waliKelas = waliKelas;
    }
    
    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }


    public JenisKelaminEnum getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelaminEnum jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public LkkEnum getLkk() {
        return lkk;
    }

    public void setLkk(LkkEnum lkk) {
        this.lkk = lkk;
    }
    
    
        
public String getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(String idSiswa) {
        this.idSiswa = idSiswa;
    }

public String getNisn() {
        return nisn;
    }

    public void setNisn(String Nisn) {
        this.nisn = nisn;
    }
    
public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }    
public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    
public String getAsalSekolah() {
        return asalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    } 
    
public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }  
    
public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }     

public Integer getJumlahSaudara() {
        return jumlahSaudara;
    }

    public void setJumlahSaudara(Integer jumlahSaudara) {
        this.jumlahSaudara = jumlahSaudara;
    }

public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }  
    
public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }        
}
