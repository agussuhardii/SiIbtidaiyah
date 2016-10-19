
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.QiroatiModel;
import java.util.List;

public interface QiroatiDao {
    public void save(QiroatiModel qiroatiModel);

    public void update(QiroatiModel qiroatiModel);

    public void delete(QiroatiModel qiroatiModel);

    
    
    
    public QiroatiModel getQiroati(String id_qiroati);

    public List<QiroatiModel> getQiroati();
}
