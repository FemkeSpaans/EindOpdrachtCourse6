//import javax.swing.*;
//import java.io.*;
//
//public class FileReader {
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader reader = file();
//        }
//
//        public static BufferedReader file() throws IOException {
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(null);
//            File file = chooser.getSelectedFile();
//            FileInputStream fileStream = new FileInputStream(file);
//            InputStreamReader input = new InputStreamReader(fileStream);
//            BufferedReader reader = new BufferedReader(input);
//            System.out.println(reader);
//            return reader;
//        }
//
//
//}
