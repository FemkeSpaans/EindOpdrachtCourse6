import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Commandline2 {

    public Commandline2() {

        LinkedList<String> md5_value1 = new LinkedList<>(); // would arraylists be better? faster perhaps?
        LinkedList<String> md5_value2 = new LinkedList<>();
        List<String> list_of_commands = Arrays.asList("curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz",
                "curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz.md5",
                "md5sum variant_summary.txt.gz", "cat variant_summary.txt.gz.md5", "gunzip variant_summary.txt.gz");

        try {
            for (String command:list_of_commands){
                Process process = Runtime.getRuntime().exec(String.valueOf(command));
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream())); // why do you do this??
                String line = "";
                while((line = reader.readLine()) != null){
                    if (process.toString().equals("md5sum variant_summary.txt.gz")){
                        String[] splitting_spaces = line.split(" ");
                        md5_value1.add(splitting_spaces[0]);
                    }if (process.toString().equals("cat variant_summary.txt.gz.md5")){
                        String[] splitting_spaces = line.split(" ");
                        md5_value2.add(splitting_spaces[0]);
                    }
                    //process.destroy();
                }
            }
            System.out.println(md5_value1);
            System.out.println(md5_value2);

            if (md5_value1.equals(md5_value2)) {
                System.out.println("They are equal");
            } else {
                System.out.println("They are not equal");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Class BufferedReader.
        // Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters,
        // arrays, and lines. The buffer size may be specified, or the default size may be used.
        // The default is large enough for most purposes.
        // The BufferedReader is used to provide the buffering to the Reader's object while reading the data from input stream.

//                    if (process.toString().equals("md5sum variant_summary.txt.gz")) {
//                        while ((line = reader.readLine()) != null) {
//                            String[] splitting_spaces = line.split(" ");
//                            md5_value1.add(splitting_spaces[0]);
//                        }
//                        process.destroy();
//                    }
//                    if (process.toString().equals("cat variant_summary.txt.gz.md5")) {
//                        while ((line = reader.readLine()) != null) {
//                            String[] splitting_spaces = line.split(" ");
//                            md5_value2.add(splitting_spaces[0]);
//                        }


    }
}
