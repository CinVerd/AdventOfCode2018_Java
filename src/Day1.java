import java.io.File;

/**
 * Lets get Freqy
 * Created by CinVerd on 03/12/2018.
 */
public class Day1 {

    public static void main(String[] args) {
        File text = new File("C:\\santadata\\day1input.txt");
        //make sure nothing untoward is happening
        if(text.isFile()){
            System.out.println(text.list());
        }

    }
}
