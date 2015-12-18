package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBoxer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BoxerType boxerType = new BoxerType();

        //System.out.println("Please Select Boxer weight division");
        //boxerWeights value = boxerWeights.values()[br.];
        //String b = br.readLine();

        IBoxer p = boxerType.getBoxerType("Lightweight");
        System.out.println(p.boxerDetails());


    }

    public enum boxerWeights { LIGHTWEIGHT, HEAVYWEIGHT};
}
