package com.hotmail.antonioaren.museo.mediator;

import com.hotmail.antonioaren.museo.cuadros.Master.Model.CuadrosModel;
import com.hotmail.antonioaren.museo.cuadros.Master.Presenter.CuadrosPresenter;
import com.hotmail.antonioaren.museo.cuadros.Master.View.CuadrosView;
import com.hotmail.antonioaren.museo.database.DatabaseMuseo;
import com.hotmail.antonioaren.museo.pintores.Model.PintoresModel;
import com.hotmail.antonioaren.museo.pintores.Presenter.PintoresPresenter;
import com.hotmail.antonioaren.museo.pintores.View.PintoresView;
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

    private void setMuseoCollection() {
        getScreens().add(new MediatorScreen(PintoresView.class,
                PintoresPresenter.class, PintoresModel.class, DatabaseMuseo.class));

        getScreens().add(new MediatorScreen(CuadrosView.class,
                CuadrosPresenter.class, CuadrosModel.class, null));
    }


    private void setMuseoTransitionCollection() {
        getTransitions().add(new MediatorTransition(PintoresView.class,
                CuadrosView.class, MuseoMediatorCode.CLICK));
    }



}
