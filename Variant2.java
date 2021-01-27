import java.io.IOException;

public class Variant2 {

    private int allele_id, position, pathogenicity, gene_id, rs;
    private String type, alternate_allele, disease, reference_allele, chromosome;

    /**
     * Constructor for Variant2
     * Is used for ???
     * @param allele_id
     * @param position
     * @param pathogenicity
     * @param gene_id
     * @param rs
     * @param type
     * @param alternate_allele
     * @param disease
     * @param reference_allele
     * @param chromosome
     * @throws IOException
     */
    public Variant2(int allele_id, int position, int pathogenicity, int gene_id, int rs, String type, String alternate_allele,
                        String disease, String reference_allele, String chromosome) throws IOException {

        // making the values from the constructor into getters and setters

        setAllele_id(allele_id);
        setPosition(position);
        setPathogenicity(pathogenicity);
        setGene_id(gene_id);
        setRs(rs);
        setType(type);
        setAlternate_allele(alternate_allele);
        setDisease(disease);
        setReference_allele(reference_allele);
        setChromosome(chromosome);
    }

    /**
     * The getter for allele_id
     * @return
     */
    public int getAllele_id() {
        return allele_id;
    }

    /**
     * The getter for rs
     * @return
     */
    public int getRs() {
        return rs;
    }

    /**
     * The setter for rs
     * @param rs
     */
    public void setRs(int rs) {
        this.rs = rs;
    }

    /**
     * The setter for allele_id
     * @param allele_id
     */
    public void setAllele_id(int allele_id) {
        this.allele_id = allele_id;
    }

    /**
     * The getter for pathogenicity
     * @return
     */
    public int getPathogenicity() {
        return pathogenicity;
    }

    /**
     * The setter for pathogenicity
     * @param pathogenicity
     */
    public void setPathogenicity(int pathogenicity) {
        this.pathogenicity = pathogenicity;
    }

    /**
     * The getter for position
     * @return
     */
    public int getPosition() {
        return position;
    }

    /**
     * The setter for position
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * The getter for gene_id
     * @return
     */
    public int getGene_id() {
        return gene_id;
    }

    /**
     * The setter for gene_id
     * @param gene_id
     */
    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    /**
     * The getter for type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * The setter for type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The getter for alternate_allele
     * @return alternate_allele
     */
    public String getAlternate_allele() {
        return alternate_allele;
    }

    /**
     * The setter for alternate_allele
     * @param alternate_allele
     */
    public void setAlternate_allele(String alternate_allele) {
        this.alternate_allele = alternate_allele;
    }

    /**
     * The getter for disease
     * @return disease
     */
    public String getDisease() {
        return disease;
    }

    /**
     * The setter for disease
     * @param disease
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }

    /**
     * The getter for reference_allele
     * @return reference_allele
     */
    public String getReference_allele() {
        return reference_allele;
    }

    /**
     * The setter for reference_allele
     * @param reference_allele
     */
    public void setReference_allele(String reference_allele) {
        this.reference_allele = reference_allele;
    }

    /**
     * The getter for chromosome
     * @return chromosome
     */
    public String getChromosome() {
        return chromosome;
    }

    /**
     * The setter for chromosome
     * @param chromosome
     */
    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }
}
