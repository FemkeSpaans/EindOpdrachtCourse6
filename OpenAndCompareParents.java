import java.io.*;
import java.util.*;

class OpenAndComparesParents {

    public OpenAndComparesParents(HashMap<Integer, Variant2> variant_hashmap) throws IOException {

        HashMap<String, ArrayList<String>> parent1 = new HashMap<>();
        HashMap<String, ArrayList<String>> parent2 = new HashMap<>();
        HashMap<String, ArrayList<String>> parent3 = new HashMap<>();
        HashMap<String, ArrayList<String>> parent4 = new HashMap<>();
        HashMap<String, ArrayList<String>> parent5 = new HashMap<>();
        HashMap<String, ArrayList<String>> parent6 = new HashMap<>();

        ArrayList <String> temp_values = new ArrayList<>();

        List<String> list_of_files = Arrays.asList("5443.23andme.3943", "8608.23andme.6967", "8998.23andme.7341",
                "9489.23andme.7786", "9590.23andme.8112", "9684.23andme.7952");


        for (String file : list_of_files) {
            File filename = new File(file);
            BufferedReader buffered_reader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = buffered_reader.readLine()) != null) {
                if (line.startsWith("rs")) {
                    String[] splitting_spaces = line.split("\t");
                    if (filename.toString().equals("5443.23andme.3943")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent1.put(splitting_spaces[0], temp_values);
                    }
                    if (filename.toString().equals("8608.23andme.6967")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent2.put(splitting_spaces[0], temp_values);
                    }
                    if (filename.toString().equals("8998.23andme.7341")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent3.put(splitting_spaces[0], temp_values);
                    }
                    if (filename.toString().equals("9489.23andme.7786")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent4.put(splitting_spaces[0], temp_values);
                    }
                    if (filename.toString().equals("9590.23andme.8112")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent5.put(splitting_spaces[0], temp_values);
                    }
                    if (filename.toString().equals("9684.23andme.7952")) {
                        temp_values.add(splitting_spaces[1]);
                        temp_values.add(splitting_spaces[2]);
                        temp_values.add(splitting_spaces[3]);
                        parent6.put(splitting_spaces[0], temp_values);
                    }
                }
            }
        }

        ArrayList<HashMap<String, ArrayList<String>>> list_of_parents = new ArrayList<>();
        list_of_parents.add(parent1);
        list_of_parents.add(parent2);
        list_of_parents.add(parent3);
        list_of_parents.add(parent4);
        list_of_parents.add(parent5);
        list_of_parents.add(parent6);

        ArrayList<ArrayList<String>> kid = new ArrayList<>();


        for (int i = 0; i < 5; i++){
            for (int j = i + 1; j < 5; j++) {
                ArrayList<String> overlappingKeys = CompareKeys(list_of_parents.get(i), list_of_parents.get(j));
                for(String key: overlappingKeys){
                    try{
                        int rs_key  = Integer.parseInt(key.substring(2));
                        Variant2 variant = variant_hashmap.get(rs_key);
                        String alternate_allele = variant.getAlternate_allele();
                        if(list_of_parents.get(i).get(key).get(2).contains(alternate_allele) &&
                                list_of_parents.get(j).get(key).get(2).contains(alternate_allele)){
                            kid.add(new ArrayList<>(Arrays.asList(key, alternate_allele + alternate_allele, variant.getChromosome(),
                                    list_of_parents.get(i).get(key).get(2), list_of_parents.get(j).get(key).get(2),
                                    list_of_files.get(i), list_of_files.get(j))));

                        }
                    } catch (NullPointerException ignored) {
                    }

                }
            }
        }
        WriteFile(kid);
    }

    public void WriteFile(ArrayList<ArrayList<String>> kid) throws IOException {
        FileWriter myWriter = new FileWriter("Output.txt");
        myWriter.write("Rsid\tGenotype child\tChromosome\tAllele parent 1\tAllele parent 2\tFile parent 1\tFile parent 2\n");
        for(ArrayList<String> disease:kid){
            myWriter.append(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",disease.get(0), disease.get(1), disease.get(2),
                    disease.get(3), disease.get(4), disease.get(5), disease.get(6)));
        }
        myWriter.close();
    }

    private ArrayList<String> CompareKeys(HashMap<String,ArrayList<String>> hashMap, HashMap<String, ArrayList<String>> hashMap1) {
        //ArrayList<HashMap> compareKeys = new ArrayList<>(Arrays.asList(hashMap, hashMap1));
        //ArrayList<String> compareKeys = new ArrayList<>();
        ArrayList<String> found_keys = new ArrayList<>();
        for(String key:hashMap.keySet()){
            if(hashMap1.containsKey(key)){
                found_keys.add(key);
            }
        }
        return found_keys;
    }

    }

    // alternate allele is found in both parents than the kid is possibly sick (hopefully, I hope the fucker dies)
