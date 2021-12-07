package com.magnus;

import java.io.*;
import java.util.*;

public class Util {

    private static StringTokenizer getTokenizer () {
        String line;
        StringTokenizer tok = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = reader.readLine();
            if (line == null) { throw new IOException(); }
            tok = new StringTokenizer(line);
        }
        catch  (IOException e) { System.out.println("Fehler bei der Eingabe (1)"); }
        return tok;
    }

    public static int readInt(String appendix) {
        System.out.print(appendix);
        StringTokenizer tokenizer = Util.getTokenizer();
        try {
            String token = tokenizer.nextToken();
            return Integer.parseInt(token);
        }
        catch (NoSuchElementException e1) { System.out.print("Fehler bei der Eingabe"); }
        catch (NumberFormatException e2)  { System.out.println("Fehler bei der Eingabe"); }
        return -1;
    }
}

