package org.example.stringservice;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface StringManipulationService {
    /**
     * Returns the reversed version of the given string.
     * @param text The input string to reverse
     * @return The reversed string
     */
    String reverseText(@WebParam(name = "text") String text);
    
    /**
     * Returns the number of characters in the given string.
     * @param text The input string to count characters
     * @return The number of characters in the string
     */
    int countCharacters(@WebParam(name = "text") String text);
}
