
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.NilaiExtraModel;
import java.util.List;

public interface NilaiExtraDao {
    public void save(NilaiExtraModel nilaiekstrakulikulerModel);

    public void update(NilaiExtraModel nilaiekstrakulikulerModel);

    public void delete(NilaiExtraModel nilaiekstrakulikulerModel);

    
    
    
    public NilaiExtraModel getNilaiEkstrakulikuler(String id_ekskul);

    public List<NilaiExtraModel> getNilaiEkstrakulikuler();
}
