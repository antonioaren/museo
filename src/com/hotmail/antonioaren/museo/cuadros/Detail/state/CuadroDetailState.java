package com.hotmail.antonioaren.museo.cuadros.Detail.state;

import com.hotmail.antonioaren.museo.cuadros.Detail.data.DetailData;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;

/**
 * Created by PedroAntonio on 25/04/2016.
 */
public class CuadroDetailState implements I_ScreenState {

    private DetailData _data;

    public CuadroDetailState() {
        setData(new DetailData());
    }

    public CuadroDetailState(DetailData data) {
        _data = data;
    }

    public DetailData getData() {
        return _data;
    }


    public void setData(DetailData data) {
        _data = data;
    }


}
