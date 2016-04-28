package com.hotmail.antonioaren.museo.Museo.cuadros.Detail.View;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hotmail.antonioaren.museo.R;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Presenter.I_CuadroDetailPresenter;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;
import es.ulpgc.eite.framework.android.AndroidScreenView;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailView extends AndroidScreenView implements I_CuadroDetailsView {

    private I_CuadroDetailPresenter getCuadroDetailPresenter(){
        return (I_CuadroDetailPresenter) getScreenPresenter();
    }

    @Override
    public void setDetailsButtonListener(){
        Button deleteView = (Button) findViewById(R.id.btn_detail);
        deleteView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getCuadroDetailPresenter().deleteData();

            }
        });
    }


    @Override
    public void setCuadrosDetailLayout() {

        debug("setDetailLayout");
        setContentView(getDataLayout());
    }

    private int getDataLayout(){
        return R.layout.detalle_cuadro_view;
    }

    @Override
    public void setDetailData(DetailData data){
        TextView dataView = (TextView) findViewById(R.id.lbl_data);
        dataView.setText(data.getLabel());

    }





}
