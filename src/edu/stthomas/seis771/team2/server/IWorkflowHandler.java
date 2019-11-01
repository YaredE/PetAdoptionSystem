package edu.stthomas.seis771.team2.server;

import edu.stthomas.seis771.team2.domainmodel.ProcessResults;

public interface IWorkflowHandler 
{
	
	public ProcessResults  handleRequest();
	
	public ProcessResults processRequest();
	
	

}
