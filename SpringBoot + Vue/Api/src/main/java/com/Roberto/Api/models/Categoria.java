package com.Roberto.Api.models;

public enum Categoria {
	  MERCEARIA(" MERCEARIA"),
	  CARNES("CARNES"),
	  HIGIENE("HIGIENE"),
	  LATICINIOS("LATICINIOS"),
	  LIMPEZA("LIMPEZA"),
	  CAFEDAMANHA("CAFE DA MANHA");
	  
	  private String categoria;
	  
	  
	private Categoria(String categoria){
		this.categoria = categoria;
	}
 
	
	public String getCategoria() { 
		return categoria;
	}
	

	
}
