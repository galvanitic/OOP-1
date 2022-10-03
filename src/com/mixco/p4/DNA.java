package com.mixco.p4;

public class DNA {
    private String base_pairs = "ACGT";
    public char[] generateRandDNA(int dna_length){
        StringBuilder sb = new StringBuilder(dna_length);
        char[] randDNA = new char[dna_length];
        for (int i = 0; i < dna_length; i++){
            int randIndex = (int) (this.base_pairs.length() * Math.random());
            randDNA[i] = this.base_pairs.charAt(randIndex);
        }
        return randDNA;
    }
    public int indexOf4ConsecutiveGuanine(char[] DNA1, char[] DNA2){
        int guanine_counter = 0;
        if (DNA1.length != DNA2.length) {
            System.out.println("ERROR: DNA are of different lengths.");
            return -1;
        }

        for (int i = 0; i < DNA1.length; i++){
            if (guanine_counter < 4){
                if (DNA1[i] == 'G' && DNA2[i] == 'G'){
                    if (DNA1[i+1] == 'G' && DNA2[i+1] == 'G')
                        guanine_counter++;
                    else
                        guanine_counter = 0;
                }
            }
            if (guanine_counter == 4){
                return i-4;
            }
            if (i == DNA1.length - 1){
                System.out.println("ERROR: No consecutive 4 guanine bases were found in the two DNAs.");
                return -1;
            }
        }
        return -1;
    }
}
