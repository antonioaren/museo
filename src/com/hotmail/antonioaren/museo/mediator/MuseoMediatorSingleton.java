package com.hotmail.antonioaren.museo.mediator;

import es.ulpgc.eite.framework.android.AndroidMediatorSingleton;

/**
 * Created by PedroAntonio on 26/03/2016.
 */
public class MuseoMediatorSingleton extends AndroidMediatorSingleton {
    @Override
    public void createMediator() {
        setCustomConfig(new MuseoMediatorConfig(this));
    }
}
