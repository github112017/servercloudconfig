package com.profesorp.configclient.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BeanConfiguration {
	private int  minResultados;
	private int maxResultados;		
	private String valorFijo;
	//private String valorFuncion;
	
	public  BeanConfiguration(int minResultado,int maxResultado,String valorFijo)
	{
		this.minResultados=minResultado;
		this.maxResultados=maxResultado;
		this.valorFijo=valorFijo;
	
	}
}
