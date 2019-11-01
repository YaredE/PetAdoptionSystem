package edu.stthomas.seis771.team2.domainmodel;

public class Status implements ISaveableObject
{
	
	private int status_id;
	
	private String status_name;

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	
	
	public Status ( int _statusId, String _statusName )
	{
		this.setStatus_id(_statusId);
		this.setStatus_name(_statusName);
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}

	/**
	 *  This must be implemented to add new values to the database.
	 */
	public String values() 
	{
		String values = "( STATUS_ID, STATUS_NAME)  VALUES ("
				+ this.getStatus_id() + ",'" + this.getStatus_name() + "');";
		return values;
	}

	/**
	 * This is the search criteria.
	 */
	public String searchCriteria()
	{
		return " STATUS_NAME = '" + this.getStatus_name() + "'";
	}
}