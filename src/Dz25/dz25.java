package Dz25;
import java.io.*;

public class dz25 {

    public static void main (String[]args) {

        File filedz25 = new File("FileDz25.txt");
        if (!filedz25.exists()) {
            try {
                filedz25.createNewFile();

                writeToFile("test dz25", "test DZ25");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = readFile("FileDz25.txt");
        System.out.println(content);
    }






    private static void writeToFile (String filepath , String content){
        try (OutputStream outputStream = new FileOutputStream(filepath,false)){
            byte []bytes = content.getBytes();
    }catch (IOException e){
        e.printStackTrace();
    }
    }

    private static String readFile (String filePath ){

        StringBuilder content = new StringBuilder();

        try (InputStream inputStream = new FileInputStream (filePath)){
int ch ;
while ((ch = inputStream.read()) !=-1){
    content.append((char) ch);
}
        }catch (IOException e){
            e.printStackTrace();
        }
            return content.toString();
    }


}

