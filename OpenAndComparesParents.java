import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OpenAndComparesParents {

    public OpenAndComparesParents() throws IOException {

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
        // you need to compare these
        // how are you going to do this?
        // you want to compare the keys of 1 and 2 and safe the ones that are the same in a different data structure, but which one?




    }
}



