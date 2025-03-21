package org.example.endpoint;

import org.example.stringservice.StringManipulationServiceImpl;

import jakarta.xml.ws.Endpoint;

public class StringServicePublisher {
    public static void main(String[] args) {
        System.out.println("Publishing the String Manipulation Service");
        Endpoint.publish("http://localhost:8080/stringservice", new StringManipulationServiceImpl());
        System.out.println("String Manipulation Service published. WSDL available at:  http://localhost:8080/stringservice/soap?wsdl");
    }
}
