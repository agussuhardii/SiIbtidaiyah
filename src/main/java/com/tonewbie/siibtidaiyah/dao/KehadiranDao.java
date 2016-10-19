
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.KehadiranModel;
import java.util.List;

public interface KehadiranDao {
    public void save(KehadiranModel kehadiranModel);

    public void update(KehadiranModel kehadiranModel);

    public void delete(KehadiranModel kehadiranModel);

    
    
    
    public KehadiranModel getKehadiran(String id_siswa);

    public List<KehadiranModel> getKehadiran();
}
