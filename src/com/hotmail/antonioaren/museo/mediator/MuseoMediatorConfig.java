package com.hotmail.antonioaren.museo.mediator;

import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Model.CuadroDetailModel;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Presenter.CuadroDetailPresenter;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.View.CuadroDetailView;
import com.hotmail.antonioaren.museo.database.DatabaseMuseo;
import com.hotmail.antonioaren.museo.Museo.pintores.Model.PintoresModel;
import com.hotmail.antonioaren.museo.Museo.pintores.Presenter.PintoresPresenter;
import com.hotmail.antonioaren.museo.Museo.pintores.View.PintoresView;
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

        getScreens().add(new MediatorScreen(CuadroDetailView.class,
                CuadroDetailPresenter.class, CuadroDetailModel.class, DatabaseMuseo.class));


//        getScreens().add(new MediatorScreen(CuadrosView.class,
//                CuadrosPresenter.class, CuadrosModel.class, null));
    }


    private void setMuseoTransitionCollection() {
        getTransitions().add(new MediatorTransition(PintoresView.class,
                CuadroDetailView.class, MuseoMediatorCode.CLICK));
    }



}
