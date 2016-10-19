
package com.tonewbie.siibtidaiyah.model;

import com.tonewbie.siibtidaiyah.model.enumfile.PrestasiEnum;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Prestasi")
public class PrestasiModel implements Serializable {
@Id
private String idPrestasi;
private String namaPrestasi;
private PrestasiEnum prestasi;
private String idKelas;
private String tingkatPrestasi;

    public String getNamaPrestasi() {
        return namaPrestasi;
    }

    public void setNamaPrestasi(String namaPrestasi) {
        this.namaPrestasi = namaPrestasi;
    }

    public String getIdPrestasi() {
        return idPrestasi;
    }

    public void setIdPrestasi(String idPrestasi) {
        this.idPrestasi = idPrestasi;
    }

    public PrestasiEnum getPrestasi() {
        return prestasi;
    }

    public void setPrestasi(PrestasiEnum prestasi) {
        this.prestasi = prestasi;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getTingkatPrestasi() {
        return tingkatPrestasi;
    }

    public void setTingkatPrestasi(String tingkatPrestasi) {
        this.tingkatPrestasi = tingkatPrestasi;
    }


}
