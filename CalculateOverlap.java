import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CalculateOverlap {

    public static void main(String[] args) throws IOException {
        String fileName = "Output.txt";

        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line1 = "";
        while ((line1 = bufferedReader.readLine()) != null) {
                if (!list.contains(line1)) {
                    list.add(line1);

                }
            }
            int len = list.size();
            System.out.println(len);
        }
    }
