package edu.stthomas.seis771.team2.dataaccesslayer;

import edu.stthomas.seis771.team2.domainmodel.ISaveableObject;

public class GenericDataChainHandler extends PersistDataChainHandler {

	public GenericDataChainHandler(ISaveableObject objToSave,
			PersistDataChainHandler pdata) {
		super(objToSave, pdata);
	}

	@Override
	protected void saveObjectHandler(ISaveableObject object) throws Exception
	{
		super.saveObject();
	}

}
