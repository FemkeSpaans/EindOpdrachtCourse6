import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Commandline1 {

        public Commandline1() {

            LinkedList<String> md5_value1 = new LinkedList<>();
            LinkedList<String> md5_value2 = new LinkedList<>();
            List<String> list_of_commands = Arrays.asList("curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz",
                    "curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz.md5",
                    "md5sum variant_summary.txt.gz", "cat variant_summary.txt.gz.md5");

            try {
                for (int command = 0; command < list_of_commands.size(); command++) {
                    Process process = Runtime.getRuntime().exec(String.valueOf(command));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line = "";
                    if (process.toString().equals("md5sum variant_summary.txt.gz")) {
                        while ((line = reader.readLine()) != null) {
                            String[] splitting_spaces = line.split(" ");
                            md5_value1.add(splitting_spaces[0]);
                        }
                    }
                    if (process.toString().equals("cat variant_summary.txt.gz.md5")) {
                        while ((line = reader.readLine()) != null) {
                            String[] splitting_spaces = line.split(" ");
                            md5_value2.add(splitting_spaces[0]);
                        }

                    }
                }
                if (md5_value1.equals(md5_value2)) {
                    System.out.println("They are equal");
                } else {
                    System.out.println("They are not equal");
                }
                Process unzip_variant_file = Runtime.getRuntime().exec("gunzip variant_summary.txt.gz");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

