
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PegawaiModel;
import java.util.List;

public interface PegawaiDao {
    public void save(PegawaiModel pegawaiModel);

    public void update(PegawaiModel pegawaiModel);

    public void delete(PegawaiModel pegawaiModel);

    
    
    
    public PegawaiModel getPegawai(String id_pegawai);

    public List<PegawaiModel> getPegawai();
}
