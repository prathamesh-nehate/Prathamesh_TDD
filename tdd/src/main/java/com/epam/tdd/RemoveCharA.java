package com.epam.tdd;

public class RemoveCharA {

	public String remove(String string) {
        StringBuilder temporayString = new StringBuilder(string);
        Integer stringLength = temporayString.length();
        if( stringLength >=2){
            boolean firstCharIsA = temporayString.charAt(0) == 'A';
            boolean secondCharIsA = temporayString.charAt(1) == 'A';
            
            if(firstCharIsA && secondCharIsA)
                temporayString.delete(0,2);
            else if(firstCharIsA)
                temporayString.deleteCharAt(0);
            else if(secondCharIsA)
                temporayString.deleteCharAt(1);            
        }
        else if( stringLength == 1 && temporayString.charAt(0) == 'A' )
            temporayString.deleteCharAt(0);
        return new String(temporayString);
    }   

}
