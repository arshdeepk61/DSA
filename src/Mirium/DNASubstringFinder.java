package Mirium;

public class DNASubstringFinder {

    public static void main(String[] args) {
        //ACGGATGCATTTGACGTAGCGAC
        String dna = "ACGGATGCATTTGACGTAGCGAC";
        System.out.println("No of Codons in a DNA are : " + dnaLengthBruteForce(dna));
    }

    public static int dnaLengthBruteForce(String dna) {
        String s = dna.toUpperCase();
        int lengthOfDNA = s.length();
        int maxCodons = 0;

        //Worst complexity- O(n^3)
        System.out.println("Length of DNA: " + lengthOfDNA);
        maxCodons = getMaxCodons(lengthOfDNA, s, maxCodons);

        //also check reversed string
        String reversed= new StringBuilder(s).reverse().toString();
        maxCodons = getMaxCodons(lengthOfDNA, reversed, maxCodons);
        return maxCodons;
    }

    private static int getMaxCodons(int lengthOfDNA, String s, int maxCodons) {
        for (int i = 0; i < lengthOfDNA - 2; i++) {  // O(n)
            for (int j = i + 3; j <= lengthOfDNA; j++) { //O(n)
                String sub = s.substring(i, j);
                if (sub.startsWith("ATG") && sub.endsWith("TAG")) { //O(n)
                    int codons = sub.length() / 3;
                    maxCodons = Math.max(maxCodons, codons);
                }
            }
        }
        return maxCodons;
    }
}
