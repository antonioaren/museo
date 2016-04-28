package com.hotmail.antonioaren.museo.Museo.cuadros.Detail.View;

import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public interface I_CuadroDetailsView {
    //void SetDetailLayout();

    void setDetailsButtonListener();

    void setCuadrosDetailLayout();

    void setDetailData(DetailData data);
}
