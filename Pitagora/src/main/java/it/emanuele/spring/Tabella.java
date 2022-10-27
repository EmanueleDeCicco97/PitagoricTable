package it.emanuele.spring;

public class Tabella {

	private String prov[][] = new String [10][10];

	public Tabella(){
		setMess(prov);
	}
	@Override
	public String toString() {
		String aString = "";
		  for(int i = 0; i < prov.length; i++) {
		     for(int col = 0; col < prov[i].length; col++) {
		        aString += " " + prov[i][col];
		     }
		  }
		  return aString;
	}
	public String[][] getMess() {
		return prov;
	}
	public void setMess(String[][] mess) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				mess[i][j] = String.valueOf((i+1)*(j+1));
			}
		}
	}


	
	
	
	
}