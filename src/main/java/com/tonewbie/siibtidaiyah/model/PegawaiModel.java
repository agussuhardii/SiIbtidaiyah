package com.tonewbie.siibtidaiyah.model;

import com.tonewbie.siibtidaiyah.model.enumfile.JenisKelaminEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pegawai")
public class PegawaiModel implements Serializable {

    @Id
    @Column(name = "id_pegawai", length = 2)
    String idPegawai;

    @Column(name = "nip", length = 50)
    String nip;

    @Column(name = "nuptk", length = 50)
    String nuptk;

    @Column(name = "nik", length = 50)
    String nik;

    @Column(name = "nama_pegawai", length = 2)
    String namaPegawai;

    @Column(name = "tempat_lahir", length = 50)
    String tempatLahir;

    @Column(name = "jenis_kelamin", length = 50)
    JenisKelaminEnum jenisKelamin;

    @Column(name = "alamat", length = 50)
    String alamat;

    @Column(name = "no_hp", length = 2)
    String hp;

    @Column(name = "jenjang_studi", length = 50)
    String jenjang;

    @Column(name = "tahun_lulus")
    int lulus;

    @Column(name = "sk_pengangkatan", length = 50)
    String sk;

    @Column(name = "tanggal_lahir", length = 50)
    @Temporal(javax.persistence.TemporalType.DATE)
    Date tanggalLahir;

    private String agama;

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNuptk() {
        return nuptk;
    }

    public void setNuptk(String nuptk) {
        this.nuptk = nuptk;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public JenisKelaminEnum getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelaminEnum jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }



    public int getLulus() {
        return lulus;
    }

    public void setLulus(int lulus) {
        this.lulus = lulus;
    }





    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    
    
    
    
}
