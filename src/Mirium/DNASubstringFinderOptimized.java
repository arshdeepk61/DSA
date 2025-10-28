package Mirium;

public class DNASubstringFinderOptimized {

    public static void main(String[] args) {
        String dna = "ACGGATGCATTTGACGTAGCGAC";
        System.out.println("No of Codons in a DNA are : " + dnaLengthOptimized(dna));

    }

    //O(n^2)
    private static int dnaLengthOptimized(String dna) {
        //ATGTAG
        if(dna==null || dna.length()<6)
            return 0;

        String s= dna.toUpperCase().replaceAll("[^ACGT]","");

        int forward=findCodonLength(s);
        int reverse=findCodonLength(new StringBuilder(s).reverse().toString());

        return Math.max(forward,reverse);
    }

    private static int findCodonLength(String s) {
        int n=s.length();
        for(int i=0;i<n-2;i++){
            //look for ATG
            if(s.startsWith("ATG",i))
            {
                //move in steps of 3
                for(int j=i+3;j<=n;j++)
                {
                    if(s.startsWith("TAG",j))
                    {
                        //number of codons-including ATG & TAG
                        return ((j-i)/3)+1;
                    }
                }
            }

        }
        return 0;
    }
}
