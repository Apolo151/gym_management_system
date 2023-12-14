package Main;
import EQ_GYM.*;
import Gym.*;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Main {
    static File output = new File("output.csv");
    static ArrayList<Gym> gymObj = new ArrayList<>();
    static Map<String, Boolean> className = new HashMap<String, Boolean>();
    public static void ReadFile(String file)
    {
        File newFile = new File(file);
        try (Scanner scanner = new Scanner(Paths.get(file)))
        {
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if(line.equals("Gym"))
                {
                    while(true)
                    {
                        line = scanner.nextLine();
                        if(className.get(line)!= null)
                        {
                            break;
                        }
                        String[] attribute = line.split(",");
                        String name = attribute[0];
                        String address = attribute[1];
                        long phoneNumber = Long.valueOf(attribute[2]);

                        gymObj.add(new Gym(name, address, phoneNumber));
                    }
                }


            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }
    public static void WriteFile(String classOutput)
    {
        try
        {
            FileWriter outputFile = new FileWriter("output.csv");
            outputFile.write(classOutput);
            outputFile.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        className.put("Gym:",true);
        className.put("Equipment:", true);
        className.put("Customer:", true);
        className.put("Coach:", true);
        className.put("Subscription:", true);
        className.put("Membership plan:", true);
        className.put("InBody:", true);
        className.put("Admin:", true);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path");
        String file = input.nextLine();
        ReadFile(file);

        WriteFile(gymObj.getFirst().getAddress());
    }


}