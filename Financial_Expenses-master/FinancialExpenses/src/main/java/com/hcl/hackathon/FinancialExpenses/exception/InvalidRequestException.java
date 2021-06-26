package com.hcl.hackathon.FinancialExpenses.exception;

public class InvalidRequestException extends Exception {
	
	private static final long serialVersionUID=232739130123302938L;
	
	public InvalidRequestException()
	{
		super();
	}

	public InvalidRequestException(String errorMessage)
	{
		super(errorMessage);
	}
}
