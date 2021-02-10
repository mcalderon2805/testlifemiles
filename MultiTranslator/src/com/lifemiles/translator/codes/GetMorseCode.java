package com.lifemiles.translator.codes;

import java.util.Hashtable;

public class GetMorseCode {
	
	public static Hashtable<String, String> getMorseCode() {
        Hashtable<String, String> values = new Hashtable<>();
        values.put("A", ".-");
        values.put("B", "-...");
        values.put("C", "-.-.");
        values.put("D", "-..");
        values.put("E", ".");
        values.put("F", "..-.");
        values.put("G", "--.");
        values.put("H", "....");
        values.put("I", "..");
        values.put("J", ".---");
        values.put("K", "-.-");
        values.put("L", ".-..");
        values.put("M", "--");
        values.put("N", "-.");
        values.put("O", "---");
        values.put("P", ".--.");
        values.put("Q", "--.-");
        values.put("R", ".-.");
        values.put("S", "...");
        values.put("T", "-");
        values.put("U", "..-");
        values.put("V", "...-");
        values.put("W", ".--");
        values.put("X", "-..-");
        values.put("Y", "-.--");
        values.put("Z", "--..");
        return values;
    }
	
	 

}
