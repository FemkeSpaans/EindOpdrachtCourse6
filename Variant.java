import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Variant {

    private int allele_id, position, pathogenicity, gene_id;
    private String type, alternate_allele, disease, reference_allele, chromosome;

    public Variant(int allele_id, int position, int pathogenicity, int gene_id, String type, String alternate_allele,
                   String disease, String reference_allele, String chromosome) throws IOException {

        String filename = "variant_summary.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }

    }
}

// allele_id[0]
// position[19]
// pathogenicity[7]
// gene_id[3]
// type[1]
// alternate_allele[33]
// disease????
// reference_allele[32]
// chromosome[18]
