/**
 * 
 */
package edu.stthomas.seis771.team2.dataaccesslayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import edu.stthomas.seis771.team2.domainmodel.ISaveableObject;
 
/**
 * @author Yared
 *
 */
public class TransactionHandler 
{
	
	/**
	 * <p>
	 *  SQLLITE database for the system.
	 *  </p>
	 */
	private static String databaseName = "PetAdoptionSystemV4A.db"; 
	/**
	 * <p>
	 * 	It takes connection manager and connects for processing transactions.
	 * </p>
	 * @param _manger
	 */
	public TransactionHandler ()
	{	
		intSystem();
	}

	/**
	 * <p>
	 * Saves the data to the database.
	 * </p>
	 * @param _object
	 * @throws Exception 
	 */
	public void processInsertTransaction ( ISaveableObject _object ) throws Exception
	{
		new ConnectionManager(databaseName);
		Connection c = ConnectionManager.getInstance().getConnection();
	    Statement stmt = null;
	    String _statment = "INSERT INTO " + _object.getClass().getSimpleName().toUpperCase() + " " + _object.values() + ";";
	    try {
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      stmt.executeUpdate(_statment);
	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      throw new Exception(e);
	    }
	    System.out.println("Records created successfully");
	}
	
	/**
	 * <p>
	 * Delete object from the database.
	 * </p>
	 * @param _object
	 */
	public void processDeleteTransaction ( ISaveableObject _object )
	{
		new ConnectionManager(databaseName);
		Connection c = ConnectionManager.getInstance().getConnection();
	    Statement stmt = null;
	    String _statment = "DELETE FROM " + _object.getClass().getSimpleName().toUpperCase() + " WHERE "  + _object.searchCriteria() + ";";
	    try {
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      stmt.executeUpdate(_statment);
	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records deleted successfully");
	}
	
	/**
	 * <p>
	 * Generic method to search for a record by its type and Id.
	 * </p>
	 * @param typeName
	 * @param iden
	 */
	public boolean searchRecord ( ISaveableObject _object )
	{
		new ConnectionManager(databaseName);
		Connection c = ConnectionManager.getInstance().getConnection();
	    Statement stmt = null;
	    boolean isFound = false;
	    try {
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      String sql = "SELECT * FROM " + _object.getClass().getSimpleName().toUpperCase() + " WHERE "  + _object.searchCriteria() + ";";
	      ResultSet rs = stmt.executeQuery( sql );
	      
	      while ( rs.next() ) 
	      {
	    	  isFound = true;
	    	  break;
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } 
	    catch ( Exception e )
	    {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
	    return isFound;
	}
	
	
	/**
	 * <p>
	 * Generic method to search for a record by its type and Id.
	 * </p>
	 * @param typeName
	 * @param iden
	 */
	public Integer searchRecordId ( ISaveableObject _object )
	{
		new ConnectionManager(databaseName);
		Connection c = ConnectionManager.getInstance().getConnection();
	    Statement stmt = null;
	    String result = "-1";
	    try {
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      String sql = "SELECT * FROM " + _object.getClass().getSimpleName().toUpperCase() + " WHERE "  + _object.searchCriteria() + ";";
	      ResultSet rs = stmt.executeQuery( sql );
	      
	      String idFieldName = _object.getClass().getSimpleName().toUpperCase()  + "_ID";
	      while ( rs.next() ) 
	      {
	    	  result = rs.getString(idFieldName);
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } 
	    catch ( Exception e )
	    {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
	    return Integer.parseInt(result);
	}
	
	public static void intSystem()
	{
		ArrayList<String> creates = getAllTableToCreate();
		runGivenSQL(creates);
		new ConnectionManager(getDatabaseName());
		Connection c = ConnectionManager.getInstance().getConnection();
	    String _table_name_ =  "ANIMAL_TYPE";
	    int countOfRecords =  getRecordCount(c, _table_name_);
	    if ( countOfRecords == 0 )
	    {//ONLY if there is not initialized we need to do this, a One time deal
	    	ArrayList<String> inserts = new ArrayList<String>();
	    	inserts.add(" INSERT INTO ANIMAL_TYPE VALUES ( 1, 'Dog' );");
	    	inserts.add(" INSERT INTO ANIMAL_TYPE VALUES ( 2, 'Cat' );");
	    	inserts.add(" INSERT INTO ANIMAL_TYPE VALUES ( 3, 'Bird' );");
	    	inserts.add(" INSERT INTO ANIMAL_TYPE VALUES ( 4, 'Others' );");
	    	//These are default statuses.
	    	inserts.add(" INSERT INTO SATUS VALUES ( 1, 'Requested' );");
	    	inserts.add(" INSERT INTO SATUS VALUES ( 2, 'In Review' );");
	    	inserts.add(" INSERT INTO SATUS VALUES ( 3, 'Approved' );");
	    	inserts.add(" INSERT INTO SATUS VALUES ( 4, 'Rejected' );");
	    	inserts.add(" INSERT INTO SATUS VALUES ( 5, 'Open' );");
	    	inserts.add(" INSERT INTO SATUS VALUES ( 6, 'Archived' );");
	    	runGivenSQL(inserts);
	    }
	}

	private static void runGivenSQL(ArrayList<String> creates)
	{
		new ConnectionManager(getDatabaseName());
		for (String _statment : creates) 
		{
			new ConnectionManager(getDatabaseName());
			Connection c = ConnectionManager.getInstance().getConnection();
			Statement stmt = null;
			try {
				c.setAutoCommit(false);
				stmt = c.createStatement();
				stmt.executeUpdate(_statment);
				stmt.close();
				c.commit();
				c.close();
			} catch (Exception e) 
			{
				System.err.println (_statment);
				System.err.println(e.getClass().getName() + ": "
						+ e.getMessage());
				System.exit(0);
			}
		}
	}
	
	
	
	/**
	 * <p>
	 * These are our tables.
	 * Due to lack of time we are using this method to get the create statements but it should be read from file.
	 * </p>
	 * @return
	 */
	private static ArrayList<String> getAllTableToCreate()
	{
		ArrayList<String> createSQL = new ArrayList<String>();
		createSQL.add("CREATE TABLE IF NOT EXISTS ADDRESS (  ADDRESS_ID INTEGER PRIMARY KEY, STREET    CHAR(50), CITY    CHAR(30),ZIP    CHAR(10)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS PERSON( PERSON_ID INTEGER PRIMARY KEY, FIRST_NAME CHAR (20),LAST_NAME CHAR (20),EMAIL_ADDRESS CHAR(40), ADDRESS_ID INTEGER, FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS USER( USER_ID CHAR(30) PRIMARY KEY, PASSWORD CHAR(30), PERSON_ID INTEGER, FOREIGN KEY (PERSON_ID) REFERENCES PERSON(PERSON_ID)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS EMPLOYEE( EMPLOYEE_ID INTEGER PRIMARY KEY,EMPLOYEE_TYPE CHAR(20),USER_LEVEL CHAR(20),USER_ID CHAR(30),  FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID)); ");		
		createSQL.add("CREATE TABLE IF NOT EXISTS ANIMAL_TYPE( ANIMALTYPE_ID INTEGER PRIMARY KEY, ANIMALTYPE_NAME CHAR(30)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS ANIMAL( ANIMAL_ID INTEGER PRIMARY KEY, NAME CHAR(30), GENDER CHAR(10), BREED CHAR  (20), WEIGHT INTEGER, COLOR CHAR(30), DOB CHAR(30), DESC CHAR (500), ANIMALTYPE_ID INTEGER, FOREIGN KEY(ANIMALTYPE_ID) REFERENCES ANIMAL_TYPE(ANIMALTYPE_ID)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS PETMEDICALRECORD( MEDICALRECORD_ID INTEGER PRIMARY KEY, ANIMAL_ID INTEGER, EMPLOYEE_ID INTEGER, CARE_DATE CHAR(50), COMMENT CHAR(150), OUTSIDECARE_NEEDED CHAR(150), FOREIGN KEY (ANIMAL_ID) REFERENCES ANIMAL(ANIMAL_ID), FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS INTAKE_SUBMISSION( SUBMISSION_ID INTEGER PRIMARY KEY,USER_ID CHAR(30), ANIMAL_ID INTEGER, "
					+ " MEDICALRECORD_ID INTEGER, INTAKESUBMISSION_DATE DATE,FOREIGN KEY(USER_ID) REFERENCES USER(USER_ID), FOREIGN KEY(ANIMAL_ID) REFERENCES ANIMAL(ANIMAL_ID), "
					+ " FOREIGN KEY(MEDICALRECORD_ID) REFERENCES MEDICAL_RECORD(MEDICALRECORD_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS ABUSE_DETAILS( ABUSE_ID INTEGER PRIMARY KEY, RESCUE_ID INTEGER, DESCRIPTION CHAR(150), EMPLOYEE_ID INTEGER, FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS POLICE_NOTIFICATION( POLICE_NOTIFICATION_ID INTEGER PRIMARY KEY, ABUSE_ID INTEGER, POLICE_ID INTEGER, NOTIFICATION DATE, DETAILS CHAR(100), FOREIGN KEY (ABUSE_ID) REFERENCES ABUSE_DETAILS(ABUSE_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS ADOPTIONREQUEST( ADOPTIONREQUEST_ID INTEGER PRIMARY KEY, USER_ID CHAR(30), ANIMALTYPE_ID INTEGER,  CRITERIA CHAR(1000), REQUEST_DATE CHAR(100), FOREIGN KEY(USER_ID) REFERENCES USER(USER_ID), FOREIGN KEY(ANIMALTYPE_ID) REFERENCES ANIMAL_TYPE(ANIMALTYPE_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS ADOPTION_FOLLOWUP( ADOPTIONFOLLOWUP_ID INTEGER PRIMARY KEY, REQUEST_ID INTEGER,  FOLLOWUP_DATE DATE, FOLLOWUP_NEEDED CHAR(100), COMMENT CHAR(100), FOREIGN KEY (REQUEST_ID) REFERENCES ADOPTION_REQUEST(REQUEST_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS PROCESS_STAGE(PROCESS_ID INTEGER PRIMARY KEY,EMPLOYEE_ID INTEGER, REQUESTED_DATE DATE,COMMENTS CHAR(50),LASTMODIFIED_DATE DATE, FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS FACILITY_REQUEST(FACILITYREQUEST_ID INTEGER PRIMARY KEY,EMPLOYEE_ID INTEGER, PROCESS_ID INTEGER, REQUEST_DATE DATE,COMPLETE_DATE DATE,STATUS_ID CHAR(10),COMMENTS CHAR(30), FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID), FOREIGN KEY (PROCESS_ID) REFERENCES PROCESS_STAGE(PROCESS_ID) ); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS SATUS( STATUS_ID INTEGER PRIMARY KEY, STATUS_NAME CHAR(20)); ");
		createSQL.add("CREATE TABLE IF NOT EXISTS DONATION_RECORD(DONATIONRECORD_ID INTEGER,AMOUNT INTEGER,DONATION_DATE DATE,ENCRYPTEDBANK_INFO CHAR(250)); ");
		return createSQL;
	}
	
	
	
	
	/**
	 * Helper method to generate the next ID for any of the classes.
	 * @param _object
	 * @return
	 */
	public int generateNextID ( ISaveableObject _object )
	{
		new ConnectionManager(getDatabaseName());
		Connection c = ConnectionManager.getInstance().getConnection();
	    String _table_name_ =  _object.getClass().getSimpleName().toUpperCase();
	    return getRecordCount(c, _table_name_);
	}
	
 

	/**
	 * 
	 * @param c
	 * @param _table_name_
	 * @return
	 */
	private static int getRecordCount(Connection c, String _table_name_) 
	{
		Statement stmt = null;
		int isFound = 1;
	    try {
	      c.setAutoCommit(false);
	      stmt = c.createStatement();
	      String sql = "SELECT * FROM  " + _table_name_ + ";";
	      ResultSet rs = stmt.executeQuery( sql );
	      while ( rs.next() ) 
	      {
	    	  isFound++;
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } 
	    catch ( Exception e )
	    {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
	    return isFound;
	}
	
	
	public static String getDatabaseName()
	{
		return databaseName;
	}
	
}
