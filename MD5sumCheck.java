import java.io.*;
import java.util.LinkedList;

public class MD5sumCheck {

    public static void main(String[] args) throws IOException {

        LinkedList<String> md5_value1 = new LinkedList<>();
        LinkedList<String> md5_value2 = new LinkedList<>();

        Process process = Runtime.getRuntime().exec(" md5sum variant_summary.txt.gz");

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine())!= null){
            String[] splitting_spaces = line.split(" ");
            md5_value1.add(splitting_spaces[0]);
        }

        Process process1 = Runtime.getRuntime().exec("cat variant_summary.txt.gz.md5");

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
        String line1 = "";
        while ((line1 = reader1.readLine())!= null){
            String[] splitting_spaces = line1.split(" ");
            md5_value2.add(splitting_spaces[0]);
        }
        System.out.println("Value 1: " + md5_value1);
        System.out.println("Value 2: " + md5_value2);

        if(md5_value1.equals(md5_value2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
//    public BufferedReader check_md5sum(Process process) throws IOException{
//        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(process)));
//        return reader;
//    }

//    public static void printResults(reader) throws IOException {
//        System.out.println(reader);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line = "";
//        while ((line = reader.readLine())!= null){
//            System.out.println(line);
//        }
//
//    }
}
