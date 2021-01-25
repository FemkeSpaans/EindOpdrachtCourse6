import java.io.*;
import java.util.LinkedList;

public class MD5sumCheck {

    public MD5sumCheck() {

        LinkedList<String> md5_value1 = new LinkedList<>();
        LinkedList<String> md5_value2 = new LinkedList<>();

        try{
            Process download_variant = Runtime.getRuntime().exec("curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz");
            Process download_md5 = Runtime.getRuntime().exec("curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz.md5");

            Process process = Runtime.getRuntime().exec("md5sum variant_summary.txt.gz");

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
            Process unzip_variant_file = Runtime.getRuntime().exec("gunzip variant_summary.txt.gz");

        } catch (IOException e) {
            e.printStackTrace();
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
