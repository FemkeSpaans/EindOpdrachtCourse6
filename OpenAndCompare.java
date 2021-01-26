import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class OpenAndCompare {

    static HashSet<String> parent1 = new HashSet<>();
    static HashSet<String> parent2 = new HashSet<>();
    static HashSet<String> parent3 = new HashSet<>();
    static HashSet<String> parent4 = new HashSet<>();
    static HashSet<String> parent5 = new HashSet<>();
    static HashSet<String> parent6 = new HashSet<>();

    public static void main(String[] args) throws IOException {

            File filename1 = new File("5443.23andme.3943");
            BufferedReader buffered_reader1 = new BufferedReader(new FileReader(filename1));
            String line1 = "";
            while ((line1 = buffered_reader1.readLine()) != null){
                String[] splitting_spaces = line1.split("\t");
                parent1.add(splitting_spaces[0]);
            }

            File filename2 = new File("8608.23andme.6967");
            BufferedReader buffered_reader2 = new BufferedReader(new FileReader(filename2));
            String line2 = "";
            while ((line2 = buffered_reader2.readLine()) != null){
                String[] splitting_spaces = line2.split("\t");
                parent2.add(splitting_spaces[0]);
            }

            File filename3 = new File("8998.23andme.7341");
            BufferedReader buffered_reader3 = new BufferedReader(new FileReader(filename3));
            String line3 = "";
            while ((line3 = buffered_reader3.readLine()) != null){
                String[] splitting_spaces = line3.split("\t");
                parent3.add(splitting_spaces[0]);
            }
            File filename4 = new File("9489.23andme.7786");
            BufferedReader buffered_reader4 = new BufferedReader(new FileReader(filename4));
            String line4 = "";
            while ((line4 = buffered_reader4.readLine()) != null){
                String[] splitting_spaces = line4.split("\t");
                parent4.add(splitting_spaces[0]);
            }
            File filename5 = new File("9590.23andme.8112");
            BufferedReader buffered_reader5 = new BufferedReader(new FileReader(filename5));
            String line5 = "";
            while ((line5 = buffered_reader5.readLine()) != null){
                String[] splitting_spaces = line5.split("\t");
                parent5.add(splitting_spaces[0]);
            }
            File filename6 = new File("9684.23andme.7952");
            BufferedReader buffered_reader6 = new BufferedReader(new FileReader(filename6));
            String line6 = "";
            while ((line6 = buffered_reader6.readLine()) != null){
                String[] splitting_spaces = line6.split("\t");
                parent6.add(splitting_spaces[0]);
            }
        System.out.println(parent1);
        //System.out.println(parent2);
        //System.out.println(parent3);
       // System.out.println(parent4);
        //System.out.println(parent5);
        //System.out.println(parent6);
        }

        public void open_files(){

        }
    }
