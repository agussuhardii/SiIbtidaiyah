
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PelajaranModel;
import java.util.List;

public interface PelajaranDao {
    public void save(PelajaranModel pelajaranModel);

    public void update(PelajaranModel pelajaranModel);

    public void delete(PelajaranModel pelajaranModel);

    
    
    
    public PelajaranModel getPelajaran(String id_pelajaran);

    public List<PelajaranModel> getPelajaran();
}
