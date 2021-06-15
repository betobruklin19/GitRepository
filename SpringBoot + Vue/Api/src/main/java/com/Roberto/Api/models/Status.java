package com.Roberto.Api.models;

public enum Status {
	   PENDENTE("PEDENTE"),
	   EMESTOQUE("EM ESTOQUE"),
	   SEMESTOQUE("SEM ESTOQUE"),
	   BAIXOESTOQUE("BAIXO ESTOQUE");
	   
	  private String status;
	  
	  
		private Status(String status){
			this.status = status;
		}
	 
		
		public String getStatu() {
			return status;
		}
		
		
	   

}
