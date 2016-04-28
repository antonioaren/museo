package com.hotmail.antonioaren.museo.database;

import android.database.sqlite.SQLiteDatabase;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;

import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;


public class DetailDao extends DroidDao<DetailData, Long> {

	public DetailDao(TableDefinition<DetailData> td, SQLiteDatabase db) {

		super(DetailData.class, td, db);
	}

}
