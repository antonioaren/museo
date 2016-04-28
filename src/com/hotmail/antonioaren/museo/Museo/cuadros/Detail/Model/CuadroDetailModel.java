package com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Model;

import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Presenter.I_CuadroDetailPresenter;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailModel extends AndroidScreenModel implements I_CuadroDetailsModel {

    private DetailData _data;

    @Override
    public DetailData getData() {
        return _data;
    }

    @Override
    public void setData(DetailData data) {
        _data = data;
    }

    private I_CuadroDetailPresenter getCuadroDetailPresenter(){
        return (I_CuadroDetailPresenter) getScreenPresenter();
    }





}
