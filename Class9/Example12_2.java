package yaozongbin.co.in;

import java.io.File;

public class Example12_2 {
    public static void main(String[] args) {
        File dir = new File("D:\\Class7\\yaozongbin.com.in\\src\\yaozongbin\\co\\in");
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        String fileName[] = dir.list(fileAccept);
        for(String name:fileName){
            System.out.println(name);
        }
    }
}
