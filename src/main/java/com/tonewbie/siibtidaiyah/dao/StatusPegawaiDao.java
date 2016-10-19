
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.StatusPegawaiModel;
import java.util.List;

public interface StatusPegawaiDao {
    public void save(StatusPegawaiModel statuspegawaiModel);

    public void update(StatusPegawaiModel statuspegawaiModel);

    public void delete(StatusPegawaiModel statuspegawaiModel);

    
    
    
    public StatusPegawaiModel getStatusPegawai(String id_pegawai);

    public List<StatusPegawaiModel> getStatusPegawai();
}
