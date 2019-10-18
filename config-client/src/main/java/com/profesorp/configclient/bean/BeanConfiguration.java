package com.profesorp.configclient.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BeanConfiguration {
	private int  minResultados;
	private int maxResultados;		
	private String firstName;
	private String lastName;
	//private String valorFuncion;
	
	public  BeanConfiguration(int minResultado,int maxResultado,String firstName,String lastName)
	{
		this.minResultados=minResultado;
		this.maxResultados=maxResultado;
		this.firstName=firstName;
		this.lastName=lastName;
	
	
	}
}
