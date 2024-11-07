import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

//Write a java program to accept a variable x. x can be any number from 1 to 230-1.
//Generate a file with x number of lines and each line consist of a string that is unique with 100
//characters long
//Limitation: This java program needs to run with only 10M of ram

public class MemoryEfficientUniqueStringGenerator {
    public static String randomString(int length){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i<length; i++){
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }

    
    private static final int LINE_LENGTH = 100;
    private static final long MAX_MEMORY = 10485760;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of lines: ");
        int x = scanner.nextInt();
        scanner.close();

        try {
            File file = new File("Output.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            long linesWritten = 0;
            while(linesWritten < x){
                String line = randomString(LINE_LENGTH);
                writer.write(line);
                writer.newLine();

                if(Runtime.getRuntime().totalMemory() > MAX_MEMORY){
                    writer.flush();
                }
                linesWritten++;
            }
            writer.close();
            System.out.println("File Generated");
        } catch (Exception e) {
            System.err.println("An error occured while generating the file: " + e.getMessage());
        }
    }
}
