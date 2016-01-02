package com.example;

import lombok.Getter;
import lombok.Setter;

public class Echo {

    private final String echo;
    private final int times;
    @Getter @Setter private final String pipo;

    public Echo(String echo, int times) {
        this.echo = echo;
        this.times = times;
        this.pipo = "clown";
    }

    public String getEcho() {
        String output = ""; 
    	
        for (int i=0; i < this.times; i++) {
        	output += this.echo + " ";
        }
        
    	return output;
    }
}
