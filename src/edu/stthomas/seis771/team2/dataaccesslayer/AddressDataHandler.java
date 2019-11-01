package edu.stthomas.seis771.team2.dataaccesslayer;


import edu.stthomas.seis771.team2.domainmodel.ISaveableObject;

/**
 * <p>
 *   Represents the AddressDataHandler
 *   </p>
 * @author Yared
 *
 */
public class AddressDataHandler extends PersistDataChainHandler
{
	/**
	 * <p>
	 * 
	 * @param objToSave
	 * @param pdata
	 */
	public AddressDataHandler(ISaveableObject objToSave,
			PersistDataChainHandler pdata) {
		super(objToSave, pdata);
	}

	@Override
	protected void saveObjectHandler(ISaveableObject object) throws Exception
	{
		TransactionHandler handler = new TransactionHandler();
		if ( !handler.searchRecord(this.getDataToProcess()) ) 
		{
			this.saveObject();
		}
	}
 
}
