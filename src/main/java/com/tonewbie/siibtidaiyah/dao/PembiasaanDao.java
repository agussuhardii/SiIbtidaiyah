
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PembiasaanModel;
import java.util.List;

public interface PembiasaanDao {
    public void save(PembiasaanModel pembiasaanModel);

    public void update(PembiasaanModel pembiasaanModel);

    public void delete(PembiasaanModel pembiasaanModel);

    
    
    
    public PembiasaanModel getPembiasaan(String id_pembiasaan);

    public List<PembiasaanModel> getPembiasaan();
}
