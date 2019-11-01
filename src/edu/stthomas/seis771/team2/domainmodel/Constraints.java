package edu.stthomas.seis771.team2.domainmodel;

public class Constraints {
	
	




	/**
	 * Pet Id for the animal record.
	 */
	private Integer petID;
	
	/**
	 * 	
	 */
	private String instruction;
	
	
	
	public Constraints(String _instruction, Integer _petID)
	{
		this.setInstruction(_instruction);
		this.setPetID(_petID);
	}
	
	
	public Integer getPetID() {
		return petID;
	}



	public void setPetID(Integer petID) {
		this.petID = petID;
	}



	public String getInstruction() {
		return instruction;
	}



	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	

}
