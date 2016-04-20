package com.hotmail.antonioaren.museo.cuadros.Master.View;

import com.hotmail.antonioaren.museo.R;
import es.ulpgc.eite.framework.android.AndroidScreenView;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class CuadrosView extends AndroidScreenView implements I_CuadrosView {

    @Override
    public void setLayout() {
        setContentView(R.layout.cuadros_view);
    }
}
