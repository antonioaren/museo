package com.hotmail.antonioaren.museo.pintores.View;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hotmail.antonioaren.museo.R;
import com.hotmail.antonioaren.museo.cuadros.Detail.data.DetailData;
import com.hotmail.antonioaren.museo.pintores.Presenter.I_PintoresPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;

import java.util.List;


/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresView extends AndroidScreenView implements I_PintoresView {


    private ListView _list;
    private MuseoAdapter _adapter;

    //Getter y Setter de ListView --------------------------------------------------------------------------------
    private ListView getlist() {
        return _list;
    }

    private void setlist(ListView list) {
        _list = list;
    }

    //Getter y Setter del Adapter --------------------------------------------------------------------------------
    private MuseoAdapter getAdapter() {
        return _adapter;
    }

    private void setAdapter(MuseoAdapter adapter) {
        _adapter = adapter;
    }

    //----------------------------------------------------------------------------------------------------

    private I_PintoresPresenter getPintoresPresenter() {
        return (I_PintoresPresenter) getScreenPresenter();
    }

    @Override
    //Generalizamos mucho más la creación de pantallas
    public void setPintoresScreen() {
        setPintoresLayout();
        setPintoresList();
        setMuseoAdapter();
        setMuseoListAdapter();
        setMuseoListListener();

    }

    // Metodo para poner el primer Layout.

    private void setPintoresLayout() {

        debug("setPintoresLayout");
        setContentView(getListLayout());
    }

    //Optener Layout de la lista (recordad que son 2 Layout) el base, los datos y datos de cada celda.
    private int getListLayout(){
        return R.layout.pintores_view;
    }

    private int getRowLayout(){
        return R.layout.pintores_row;
    }

    private int getListView(){
        return R.id.listView;
    }

    //Poner Colección de pintores que tenemos en nuestra lista.
    @Override
    public void setPintoresCollection(List<DetailData> collection){
        debug("setPintoresCollection", "Collection", collection);
        getAdapter().clear();
        getAdapter().addAll(collection);
        getAdapter().notifyDataSetChanged();

    }

    //Establecer posición en de la lista. Mediante la selección, allí tendremos la posición de lo seleccionado.
    @Override
    public void setListPosition(int position){
        debug("setListPosition", "Position", position);
        //setPosition(position);
        getlist().setSelection(position);
    }


    //Poner los pintores setList findbyId (getListView())

    private void setPintoresList(){
        debug("setPintoresList");
        setlist((ListView) findViewById(getListView()));

    }

    private void setMuseoAdapter(){
        debug("setMuseoAdapter");
        setAdapter(new MuseoAdapter(this, getRowLayout()));

    }

    private void setMuseoListAdapter(){
        debug("setMuseoListAdapter");
        getlist().setAdapter(getAdapter());

    }


    private void setMuseoListListener(){
        debug("setMuseoListListener");
        getlist().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int position, long id) {
                //debug("setMuseoListListenerr","",getAdapter().getItem(position));

                //Obtiene del presentador la lista y su posicion.
                getPintoresPresenter().setListPosition(position);

            }
        });
    }


    private class MuseoAdapter extends ArrayAdapter<DetailData>{
        private int _pintoresRowLayout;
        private PintoresView _pintoresListView;

        //Getter y Setter de los atributos
        private PintoresView _getpintoresListView() {
            return _pintoresListView;
        }

        private int _getpintoresRowLayout() {
            return _pintoresRowLayout;
        }

        private void _setPintoresListView(PintoresView View) {
            _pintoresListView = View;
        }

        private void _setpintoresRowLayout(int layout) {
            _pintoresRowLayout = layout;
        }

        //Declaramos el Adaptador.

        public MuseoAdapter(PintoresView _view, int _layout) {
            super(_view, _layout);
            _setPintoresListView(_view);
            _setpintoresRowLayout(_layout);

        }

        @Override
        //El adaparador es necesario para adaptar lo que android tiene por defecto
        //Es decir, mezclar con el servicio que te da Android con el que nosontros hemos diseñado.
        public View getView(int position, View rowView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater)
                    _getpintoresListView().getSystemService(
                            (Context.LAYOUT_INFLATER_SERVICE));

            rowView = inflater.inflate(_getpintoresRowLayout(), parent, false);

            DetailData data = getItem(position);
            TextView titleView = (TextView) rowView.findViewById(R.id.lbl_title);
            titleView.setText(data.getLabel());
            return rowView;
        }
    }
}


