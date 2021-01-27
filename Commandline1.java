import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Femke Spaans
 * Commandline
 * Code to run several commands in the terminal
 */
public class Commandline1 {

    /**
     * Creates 2 linkedlists, one for each hashfunction
     * Executes 5 commands (processes), if the command is one of two it will split on the space
     * and add them to the linked lists.
     */
    public Commandline1() throws NotAValidMD5 {

        LinkedList<String> md5_value1 = new LinkedList<>();
        LinkedList<String> md5_value2 = new LinkedList<>();
        List<String> list_of_commands = Arrays.asList("curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz",
                "curl -O ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/tab_delimited/variant_summary.txt.gz.md5",
                "md5sum variant_summary.txt.gz", "cat variant_summary.txt.gz.md5", "gunzip variant_summary.txt.gz");

        try {
            for (String command : list_of_commands) {
                Process process = Runtime.getRuntime().exec(String.valueOf(command));
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    if (process.toString().equals("md5sum variant_summary.txt.gz")) {
                        String[] splitting_spaces = line.split(" ");
                        md5_value1.add(splitting_spaces[0]);
                        System.out.println(md5_value1);
                    }
                    if (process.toString().equals("cat variant_summary.txt.gz.md5")) {
                        String[] splitting_spaces = line.split(" ");
                        md5_value2.add(splitting_spaces[0]);
                        System.out.println(md5_value2);
                    }
                }
            }
            if (md5_value1.equals(md5_value2)) {
                System.out.println("They are equal");
            }else {
                throw new NotAValidMD5();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Custom exeception which throws an error if the linkedlists arent equal to one another.
 */
class NotAValidMD5 extends Exception{
    public NotAValidMD5(){
        JOptionPane.showMessageDialog(null, "The md5check shows different hashfunctions");
    }
}





