package com.hotmail.antonioaren.museo.cuadros.Detail.View;

import com.hotmail.antonioaren.museo.R;
import com.hotmail.antonioaren.museo.cuadros.Detail.Presenter.I_CuadroDetailPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailView extends AndroidScreenView implements I_CuadroDetailsView {

    private I_CuadroDetailPresenter getCuadroDetailPresenter(){
        return (I_CuadroDetailPresenter) getScreenPresenter();
    }


    @Override
    public void setCuadrosDetailLayout() {

        debug("setDetailLayout");
        setContentView(getItemLayout());
    }

    private int getItemLayout(){
        return R.layout.detalle_cuadro_view;
    }





}
