package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBoxerDivisions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getBoxerWeightDivision BoxerWeightF = new getBoxerWeightDivision();

        //System.out.println("Please Select Boxer weight division");
        //boxerWeights value = boxerWeights.values()[br.];
        //String b = br.readLine();

        BoxerWeightDivision p = BoxerWeightF.getBoxerWeightDivision("Lightweight");
        System.out.println(p.boxerDetails());


    }

    public enum boxerWeights { LIGHTWEIGHT, HEAVYWEIGHT};
}
