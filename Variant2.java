import java.io.IOException;

public class Variant2 {

    private int allele_id, position, pathogenicity, gene_id;
    private String type, alternate_allele, disease, reference_allele, chromosome;

    public void variant(int allele_id, int position, int pathogenicity, int gene_id, String type, String alternate_allele,
                        String disease, String reference_allele, String chromosome) throws IOException {
    }

    public int getAllele_id() {
        return allele_id;
    }

    public void setAllele_id(int allele_id) {
        this.allele_id = allele_id;
    }

    public int getPathogenicity() {
        return pathogenicity;
    }

    public void setPathogenicity(int pathogenicity) {
        this.pathogenicity = pathogenicity;
    }

    public int getGene_id() {
        return gene_id;
    }

    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlternate_allele() {
        return alternate_allele;
    }

    public void setAlternate_allele(String alternate_allele) {
        this.alternate_allele = alternate_allele;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getReference_allele() {
        return reference_allele;
    }

    public void setReference_allele(String reference_allele) {
        this.reference_allele = reference_allele;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }
}
