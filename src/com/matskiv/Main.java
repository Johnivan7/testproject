package com.matskiv;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        Flight.main(null);
	// write your code here
    }

    public static void callMethod() throws IOException{
        throw new IOException("Hey again");
    }
}
