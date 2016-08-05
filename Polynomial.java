package wordsFreq;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Polynomial {
	
	String poly1, poly2;
	
	
	public Polynomial(String poly1, String poly2) {
		this.poly1=poly1;
		this .poly2 = poly2;
	}
	
	public static String split(String poly)
	{
		for(int i=0;i<poly.length();i++){
			
		}
		return poly;
	}
	public static HashMap<Integer,Double> stringToHash(String poly)
	{
		
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
		    double value1 = entry.getValue();
		    if(!(result.containsKey(key))){
		    	result.put(key,polh2.get(key));
		    }
		    
		}			
		String res = result.toString();
		return res;
	}
	/*
	public static String hashToString(HashMap<Integer,Double> poly)
	{
		return poly1;
		
	}
	*/
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
		    double value1 = entry.getValue();
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
		    int key = entry.getKey();
		    double value1 = entry.getValue();
		    for (Map.Entry<Integer, Double> entry2 : polh2.entrySet()) {
			    int key2 = entry2.getKey();
			    double value2 = entry2.getValue();
			    val = value1+value2;
			    if(result.containsKey(key+key2){
		             double val = 
		            
		        }
		        
		        map.put(;
			    
			}
		    
		    
		    
		    if(polh2.containsKey(key)){
		    	value1 = value1-polh2.get(key);
		    }
		    result.put(key,value1);
		}	
		
			
		String res = result.toString();
		return res;
	}
	
	public String toHTML(String resultString){

		StringBuilder HTMLcode = new StringBuilder("");

		HTMLcode.append("<HTML>\n");
		HTMLcode.append("<HEAD><\HEAD>\n");
		HTMLcode.append("<BODY>\n");
		HTMLcode.append(resultString);
		HTMLcode.append("\n<\BODY>\n");
		HTMLCode.append("<\HTML>\n");

		return (HTMLcode.toString());
		}

		public String toLATEX(String resultString){

		StringBuilder LATEXcode = new StringBuilder("");

		LATEXcode.append("\begin{document}\n");
		LATEXcode.append("\begin{abstract}\n");
		LATEXcode.append("Basic Arithmetic Operations performed on Polynomials\n");
		LATEXcode.append("\end{abstract}\n");
		LATEXcode.append(resultString);
		LATEXcode.append("\n\n");
		LATEXCode.append("\end{document}\n");

		return (LATEXcode.toString());
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1=new Polynomial("2x^5+2.8x^3","2x^5+2.7x^1");
			
		addn(p1.poly1,p1.poly2);
		subn(p1.poly1,p1.poly2);
		muln(p1.poly1,p1.poly2);
	}


}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
	
	String polynomial;
	public static void stringToHash(String poly)
	{
		String replace=poly.replace("-", "+-");
	    System.out.println(replace);
	    String[] splitString = (replace.split("\\+"));
	    
	     for (String string : splitString) {
	    	 System.out.println(string);
	         int length=string.length();
	         if(string.indexOf('x')>=0)
	         {
	        	 string=string+"x^0";
	         }
	         String[] splithash=string.split("[x]\\^");
	         for(String string1:splithash)
	         System.out.println(string1);
	     }
	}
	public static void main(String args[]){
		stringToHash("2x^5+2x^1-3x^1+4");
	
	}
}

