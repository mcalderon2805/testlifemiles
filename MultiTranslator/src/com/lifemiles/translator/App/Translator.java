package com.lifemiles.translator.App;
import java.util.Scanner;

import com.lifemiles.translator.processor.*;


public class Translator {

	public static void main(String[] args) {
		
    	System.out.println(Converter.toMorse("esto es una prueba"));
		System.out.println(Converter.toText(".--. .-. ..- . -... .-"));
	    System.out.println(Converter.toBin("prueba"));        
	    
	   
		

	      }

}
