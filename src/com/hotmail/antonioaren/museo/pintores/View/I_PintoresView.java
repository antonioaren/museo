package com.hotmail.antonioaren.museo.pintores.View;

import com.hotmail.antonioaren.museo.cuadros.Detail.data.DetailData;

import java.util.List;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public interface I_PintoresView {
    //int getListPosition();



    void setPintoresCollection(List<DetailData> collection);
    void setListPosition(int position);



    void setPintoresScreen();
}
