package com.lifemiles.translator.processor;
import java.util.Hashtable;
import java.util.Set;

import com.lifemiles.translator.codes.*;

public class Converter {
	
	public String input = "";
	public static String text = "";
	public static StringBuilder output;
	
	
	 public static String toMorse(String input) {	
	 try {		 
	   output = new StringBuilder();
       for (int i = 0; i < input.length(); i++) {
    	   text = String.valueOf(input.charAt(i));    	   
    	   output.append(textToMorse(text.toUpperCase())).append(" ");
    	   
    	  
       }
	 }catch(Exception ex) {
		 System.out.println(ex);
	 }
		return output.toString();	 
	 }


	public static String textToMorse(String text) {
			
	      Hashtable<String, String> value = GetMorseCode.getMorseCode();
	        return value.getOrDefault(text, "");
	}

	public static String toText(String input) {
		
		try {
			
			  output = new StringBuilder();        
		        
		        String[] morse = input.split(" ");
		        
		        for (String inputOrigin : morse) {
		            String value = morseToText(inputOrigin);
		            output.append(value);
		        }
			
			
		}catch(Exception ex) {
			System.out.println(ex);	
			}

        return output.toString();
    }
	
		
	  public static String morseToText(String input) {
		  
			try {
				
				Hashtable<String, String> values = GetMorseCode.getMorseCode();
		        Set<String> codes = values.keySet();
		        for (String code : codes) {
		            String morse = values.get(code);
		            if (morse.equals(input)) {
		                return code;
		            }
		        }
				
				
			}catch(Exception ex) {
				System.out.println(ex);
			}
		  
	        
	        return "";
	    }
	
	  public static String toBin(String input) {
		  
			try {
				
				  int lenghtText;		  
				  lenghtText = input.length();
				  text = "";
				  
				  for(int i = 1; i < lenghtText; i++) {
					  text += String.format("%8s", Integer.toBinaryString(input.charAt(i)));			  
					  }					
				
			}catch(Exception ex) {
				System.out.println(ex);
			}
			  return text;

		
	  }
	    }
		
	


