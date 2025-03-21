package org.example.stringservice;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.stringservice.StringManipulationService")
public class StringManipulationServiceImpl implements StringManipulationService {
    
    @Override
    public String reverseText(String text) {
        if (text == null) {
            return "";
        }
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
    
    @Override
    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}
