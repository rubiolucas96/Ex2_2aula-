package lote2_ex2;

public class bincontroller {
	public bincontroller() {
		super();
	}
		public String num (int bin) {
		if(bin / 2 == 0) {
			return String.valueOf(bin%2);
			
		}
		    return  num (bin / 2) + String.valueOf(bin%2) ;
		    
	}
 
}

