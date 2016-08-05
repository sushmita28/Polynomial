package frequentNwords;

import java.util.*;

public class Polynomial {
	
	String poly1, poly2;
	
	
	public Polynomial(String poly1, String poly2) {
		this.poly1=poly1;
		this .poly2 = poly2;
	}

	public static String addn(String pol1,String pol2)
	{
		Map<Integer,Double> polh1 = stringToHash(pol1);
		Map<Integer,Double> polh2 = stringToHash(pol2);
		Map<Integer,Double> result = new HashMap<>();
		
		for (Map.Entry<Integer, Double> entry : polh1.entrySet()) {
		    int key = entry.getKey();
		    double value1 = entry.getValue();
		    if(polh2.containsKey(key)){
		    	value1 = value1+polh2.get(key);
		    }
		    result.put(key,value1);
		}	
		for (Map.Entry<Integer, Double> entry : polh2.entrySet()) {
		    int key = entry.getKey();
		    if(!(result.containsKey(key))){
		    	result.put(key,polh2.get(key));
		    }
		    
		}			
		String res = result.toString();
		return res;
	}
	
	public static String subn(String pol1,String pol2)
	{
		Map<Integer,Double> polh1 = stringToHash(pol1);
		Map<Integer,Double> polh2 = stringToHash(pol2);
		Map<Integer,Double> result = new HashMap<>();
		
		for (Map.Entry<Integer, Double> entry : polh1.entrySet()) {
		    int key = entry.getKey();
		    double value1 = entry.getValue();
		    if(polh2.containsKey(key)){
		    	value1 = value1-polh2.get(key);
		    }
		    result.put(key,value1);
		}	
		
		for (Map.Entry<Integer, Double> entry : polh2.entrySet()) {
		    int key = entry.getKey();
		    if(!(result.containsKey(key))){
		    	result.put(key,(-1)*polh2.get(key));
		    }
		    
		}	
		String res = result.toString();
		return res;
		
	}
	public static String muln(String pol1,String pol2)
	{
		Map<Integer,Double> polh1 = stringToHash(pol1);
		Map<Integer,Double> polh2 = stringToHash(pol2);
		Map<Integer,Double> result = new HashMap<>();
		
		for (Map.Entry<Integer, Double> entry : polh1.entrySet()) {
		    int key1 = entry.getKey();
		    double value1 = entry.getValue();
		    for (Map.Entry<Integer, Double> entry2 : polh2.entrySet()) {
			    int key2 = entry2.getKey();
			    double value2 = entry2.getValue();
			    double val = value1*value2;
			    if(result.containsKey(key1+key2)){
		             result.put(key1+key2, result.get(key1+key2)+ val); 
		            
		        }
				else{
					result.put(key1+key2, val);
				}			    
			}
		}	
		
			
		String res = result.toString();
		return res;
	}
	
	public String toHTML(String resultString){

		StringBuilder HTMLcode = new StringBuilder("");

		HTMLcode.append("<HTML>\n");
		HTMLcode.append("<HEAD><\\HEAD>\n");
		HTMLcode.append("<BODY>\n");
		HTMLcode.append(resultString);
		HTMLcode.append("\n<\\BODY>\n");
		HTMLcode.append("<\\HTML>\n");

		return (HTMLcode.toString());
		}

		public String toLATEX(String resultString){

		StringBuilder LATEXcode = new StringBuilder("");

		LATEXcode.append("\\begin{document}\n");
		LATEXcode.append("\\begin{abstract}\n");
		LATEXcode.append("Basic Arithmetic Operations performed on Polynomials\n");
		LATEXcode.append("\\end{abstract}\n");
		LATEXcode.append("$"+resultString+"$");
		LATEXcode.append("\n\n");
		LATEXcode.append("\\end{document}\n");

		return (LATEXcode.toString());
		}

		public static HashMap<Integer,Double> stringToHash(String poly)
		{
			String replace=poly.replace("-", "+-");
		    String[] splitString = (replace.split("\\+"));
		    String[] splithash = null;
		     for ( int i = 0; i<splitString.length ; i++) {
		    	 
		         if(splitString[i].indexOf('x')==-1)
		         {
		        	 splitString[i]=splitString[i]+"x^0";
		         }
		     }
		     String str = String.join("x^", splitString);
		     splithash=str.split("[x]\\^");

		     HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
		     for(int i=0 ; i < splithash.length ; i = i + 2) {
		    	 hm.put(Integer.parseInt(splithash[i+1]), Double.parseDouble(splithash[i]));
		     }
		     return hm;
		}

	public static void main(String[] args) {
		Polynomial p1=new Polynomial("2x^5+2x^2-3x^1+4","2x^3+2x^2-3x^1+4");
		System.out.println(addn(p1.poly1,p1.poly2));
		System.out.println(subn(p1.poly1,p1.poly2));
		System.out.println(muln(p1.poly1,p1.poly2));
		System.out.println(p1.toLATEX("2x^5+2x^2-3x^1+4"));
		System.out.println(p1.toHTML("2x^5+2x^2-3x^1+4"));
	}


}





