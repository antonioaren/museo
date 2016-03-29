package com.hotmail.antonioaren.museo.pintores;

import com.hotmail.antonioaren.museo.data.DetailData;

import java.util.List;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public interface I_PintoresView {
    int getListPosition();

    void setPintoresLayout();

    void setPintoresCollection(List<DetailData> collection);


    void setListPosition(int position);

    void setPintoresList();

    void setMuseoAdapter();

    void setMuseoListAdapter();

    void setMuseoListListener();
}
