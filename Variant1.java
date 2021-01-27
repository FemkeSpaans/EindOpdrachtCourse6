import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Variant1 {
    private int allele_id, position, pathogenicity, gene_id;
    private String type, alternate_allele, disease, reference_allele, chromosome;

    ArrayList<String> allele_id_list = new ArrayList<>();
    ArrayList<String> position_list = new ArrayList<>();
    ArrayList<String> pathogenicity_list = new ArrayList<>();
    ArrayList<String> gene_id_list = new ArrayList<>();
    ArrayList<String> type_list = new ArrayList<>();
    ArrayList<String> alternate_allele_list = new ArrayList<>();
    ArrayList<String> disease_list = new ArrayList<>();
    ArrayList<String> reference_allele_list = new ArrayList<>();
    ArrayList<String> chromosome_list = new ArrayList<>();

    public void main(String[] args) throws IOException {
        String filename = "variant_summary.txt";
        BufferedReader buffered_reader1 = new BufferedReader(new FileReader(filename));
        String line = "";
        while ((line = buffered_reader1.readLine()) != null) {
            if (line.startsWith("#")) {
                //
            }else{
                String[] splitting_spaces = line.split("\t");
                allele_id_list.add(splitting_spaces[0]);
                int temp = Integer.parseInt(String.valueOf(allele_id_list));
                setAllele_id(temp);

                position_list.add(splitting_spaces[19]);
                int temp1 = Integer.parseInt(String.valueOf(position_list));
                setPosition(temp1);

                pathogenicity_list.add(splitting_spaces[7]);
                int temp2 = Integer.parseInt(String.valueOf(pathogenicity_list));
                setPathogenicity(temp2);

                gene_id_list.add(splitting_spaces[3]);
                int temp3 = Integer.parseInt(String.valueOf(gene_id_list));
                setGene_id(temp3);

                type_list.add(splitting_spaces[1]);
                String temp4 = String.valueOf(type_list);
                setType(temp4);

                alternate_allele_list.add(splitting_spaces[33]);
                String temp5 = String.valueOf(alternate_allele_list);
                setAlternate_allele(temp5);

                disease_list.add(splitting_spaces[12]);
                String temp6 = String.valueOf(disease_list);
                setDisease(temp6);

                reference_allele_list.add(splitting_spaces[32]);
                String temp7 = String.valueOf(reference_allele_list);
                setReference_allele(temp7);

                chromosome_list.add(splitting_spaces[18]);
                String temp8 = String.valueOf(chromosome_list);
                setChromosome(temp8);
            }
        }
    }

    public void setAllele_id(int allele_id) {
        this.allele_id = allele_id;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public void setPathogenicity(int pathogenicity) {
        this.pathogenicity = pathogenicity;
    }

    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAlternate_allele(String alternate_allele) {
        this.alternate_allele = alternate_allele;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setReference_allele(String reference_allele) {
        this.reference_allele = reference_allele;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }


    public void variant(int allele_id, int position, int pathogenicity, int gene_id, String type, String alternate_allele,
                        String disease, String reference_allele, String chromosome) throws IOException {

    }
}



