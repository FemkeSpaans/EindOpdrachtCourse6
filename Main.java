import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        try{
            new Commandline1();
        } catch (NotAValidMD5 notAValidMD5) {
            notAValidMD5.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        new OpenAndComparesParents(ReadSummary.read_file());
    }
}

