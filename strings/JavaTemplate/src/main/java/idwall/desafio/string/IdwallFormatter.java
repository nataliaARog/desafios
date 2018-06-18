package idwall.desafio.string;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public class IdwallFormatter extends StringFormatter {
	
	public IdwallFormatter() {
		super();
	}

    /**
     * Should format as described in the challenge
     * 
     * Method that split a given text into lines with around 40 chars.
     * In a foreach from Java 8, a String is splitted into words, and then, these words 
     * are stored into a StringBuilder.
     * After that, the length of StringBuiler is checked, and if it has length 40 (checks 40 by 40), is added a line break.
     *  
     * @param text
     * @return
     */
    @Override
    public String format(String text) {
    	StringBuilder txtFormatted = new StringBuilder(); 
    	AtomicInteger helper = new AtomicInteger(40);
    	    	
    	try {
    		 Arrays.stream(text.split(" ")).forEach(word -> { 
    			 txtFormatted.append(word);
    			
    			 if(txtFormatted.length() >= helper.get() && txtFormatted.length() < helper.get()+40) {
    				 txtFormatted.append("\n");  
    				 helper.getAndAdd(40);    			
    				 
    			 } else {
    				 txtFormatted.append(" ");  
    			 }    	
    			 
    		 });    		  
    		 
    	} catch(Exception e) {
    		e.printStackTrace();
    		throw new UnsupportedOperationException();
    	}    	
    	
		return txtFormatted.toString();        
    }    
}
