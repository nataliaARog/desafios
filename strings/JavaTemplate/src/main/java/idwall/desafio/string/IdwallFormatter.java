package idwall.desafio.string;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

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
     * @param text
     * @return
     */
    @Override
    public String format(String text) {
    	StringBuilder txtFormatted = new StringBuilder();    	
    	AtomicInteger l = new AtomicInteger(41);
    	    	
    	try {
    		 Arrays.stream(text.split(" ")).forEach(word -> { 
    			 txtFormatted.append(word);
    			 txtFormatted.append(" ");   			 
    		 });
    		 
    		 txtFormatted.delete(l.get(),txtFormatted.length());
    		 
    		 IntStream.range(0, txtFormatted.length()).forEach(i -> {   
    			 if(l.get() < txtFormatted.length()) {
    				 
    				 l.getAndAdd(40);    				 
    			 }  
    		 });  		 
    		 
    	} catch(Exception e) {
    		e.printStackTrace();
    		throw new UnsupportedOperationException();
    	}    	
    	
		return txtFormatted.toString();        
    }    
}
