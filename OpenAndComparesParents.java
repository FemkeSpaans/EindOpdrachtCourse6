import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OpenAndComparesParents {

    public OpenAndComparesParents() throws IOException {

        HashSet<String> parent1 = new HashSet<>();
        HashSet<String> parent2 = new HashSet<>();
        HashSet<String> parent3 = new HashSet<>();
        HashSet<String> parent4 = new HashSet<>();
        HashSet<String> parent5 = new HashSet<>();
        HashSet<String> parent6 = new HashSet<>();

        List<String> list_of_files = Arrays.asList("5443.23andme.3943", "8608.23andme.6967", "8998.23andme.7341",
                "9489.23andme.7786", "9590.23andme.8112", "9684.23andme.7952");

        for(String file:list_of_files){
            File filename = new File(file);
            BufferedReader buffered_reader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = buffered_reader.readLine()) != null){
                String[] splitting_spaces = line.split("\t");
                if(filename.toString().equals("5443.23andme.3943")){
                    if(line.startsWith("rs")){ // mmm why doesnt this work?
                        parent1.add(splitting_spaces[0]);
                    }
                }
            }

        }
        System.out.println(parent1);

    }
}
