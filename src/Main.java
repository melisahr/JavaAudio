import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    //throw declaration for audioInputStream's file, and the clip open method.
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        //User input
        Scanner scanner = new Scanner(in);

        //Create an audio file
        File file = new File("D:\\Java\\Java Audio\\JavaAudio\\Dreams Of River Ganga - Hanu Dixit.wav");
        //Create AudioInputStream
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        //Clip Object
        Clip clip = AudioSystem.getClip();
        //Open method of the clip
        clip.open(audioStream);

        //Response variable
        String response = "";

        //While loop for response not equal to Q
        while(!response.equals("Q")){
            System.out.println("P = Play, S =Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            //Method to make the letter uppercase
            response = response.toUpperCase();

            switch (response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"):clip.close();
                break;
                default: System.out.println("Not a valid response");
            }
        }
        //Escape the while loop
        System.out.println("Bye!");
    }
}