package com.hotmail.antonioaren.museo.database;

import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;
import org.droidpersistence.dao.TableDefinition;


public class DetailTable extends TableDefinition<DetailData> {

	public DetailTable() {
		super(DetailData.class);
	}

}
