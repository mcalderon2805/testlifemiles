package com.lifemiles.translator.processor;

public class Processor {
	
	public static String getTextToConvert(String input, String text, String output) {
		
			switch(input.toUpperCase()) {
			case "TEXT":
				if(output.toUpperCase().equals("MORSE")) {
					Converter.toMorse(text);
				}
				if(output.toUpperCase().equals("BINARY")) {
					Converter.toBin(text);
				}
				break;
			case "MORSE":
				if(output.toUpperCase().equals("MORSE")) {
					Converter.toText(text);
				}
				if(output.toUpperCase().equals("TEXT")) {
					Converter.toBin(text);
				}
				break;
			}
		
		
		
		
		return output;
		
	}

}
