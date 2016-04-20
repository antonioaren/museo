package com.hotmail.antonioaren.museo.cuadros.Detail.Model;

import com.hotmail.antonioaren.museo.cuadros.Detail.Presenter.I_CuadroDetailPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailModel extends AndroidScreenModel implements I_CuadroDetailsModel {

    private I_CuadroDetailPresenter getCuadroDetailPresenter(){
        return (I_CuadroDetailPresenter) getScreenPresenter();
    }





}
