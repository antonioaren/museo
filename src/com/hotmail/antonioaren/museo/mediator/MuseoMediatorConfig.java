package com.hotmail.antonioaren.museo.mediator;

import com.hotmail.antonioaren.museo.cuadros.CuadrosModel;
import com.hotmail.antonioaren.museo.cuadros.CuadrosPresenter;
import com.hotmail.antonioaren.museo.cuadros.CuadrosView;
import com.hotmail.antonioaren.museo.pintores.PintoresModel;
import com.hotmail.antonioaren.museo.pintores.PintoresPresenter;
import com.hotmail.antonioaren.museo.pintores.PintoresView;
import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorConfig;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class MuseoMediatorConfig extends MediatorConfig {

    public MuseoMediatorConfig(I_MediatorSingleton mediator) {
        super(mediator);
    }

    @Override
    public void setCustomConfig() {
        setMuseoConfig();
    }

    private void setMuseoConfig() {
        setMuseoCollection();
        setMuseoTransitionCollection();
    }

    private void setMuseoTransitionCollection() {
        getScreens().add(new MediatorScreen(PintoresView.class,
                PintoresPresenter.class, PintoresModel.class));
        getScreens().add(new MediatorScreen(CuadrosView.class,
                CuadrosPresenter.class, CuadrosModel.class));

    }

    private void setMuseoCollection() {
        getTransitions().add(new MediatorTransition(PintoresView.class,
                CuadrosView.class, MuseoMediatorCode.VIEW));
    }

}
