package hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Fail2Ban {
    public static void main(String[] args) throws FileNotFoundException {
        // Check if the number of command line arguments is not equal to 2
        if (args.length != 2){
            System.out.println("usage java Fail2Ban <log_file> <output_file>");
            return;
        }

        // Capture the log file name and output file name
        String logFile = args[0];
        String outputFile = args[1];
        
        // Create arrays to store data from input
        String[] ipAddresses = new String[1000];
        int[] failTotal = new int[1000];

        // Initialize a counter for unique IPs that fail
        int i = 0; 

        // Read the log file and process each line
        try (Scanner in = new Scanner(new File(logFile))){
            while (in.hasNextLine()){
                String line = in.nextLine();
                String[] parts = line.split(" "); // Divide lines using spaces
                // Check if the line contains "Invalid"
                if (line.contains("Invalid") && parts.length >= 9){
                    String ipAddress = parts[9];
                    // Find the index of the IP address in the array
                    int ipIndex = findIpIndex(ipAddresses, ipAddress, i);
                    // If the IP address is not in the array, add it
                    if(ipIndex != -1){
                        failTotal[ipIndex]++;
                    } else {
                        // Add the new IP address to the array and initialize its fail count
                        ipAddresses[i] = ipAddress; // Add the new IP address
                        failTotal[i] = 1; // Initialize the fail count
                        i++;
                    }
                }
            }
        }
        // Create the output file and write the IP addresses that fail 3 or more times
        try (PrintWriter out = new PrintWriter(outputFile)){
            for (int j = 0; j < i; j++) {
                if(failTotal[j] >= 3){
                    out.println(ipAddresses[j]);
                }
            }
        }
    }

    // Method to find the index of an IP address in the array
    private static int findIpIndex(String[] ipAddresses, String ipAddress, int count ) {
        for (int j = 0; j < count; j++) {
            if (ipAddresses[j].equals(ipAddress)){
                return j;
            }
        }

        return -1;

    }
}
