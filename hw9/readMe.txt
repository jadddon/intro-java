# Fail2Ban Program

## Overview
The Fail2Ban program is designed to analyze a log file for failed login attempts and identify IP addresses that have failed to log in more than three times. It reads the log file, processes each line, and outputs the offending IP addresses to a specified output file.

## Usage
To run the program, use the following command in the terminal:

```
java Fail2Ban <log_file> <output_file>
```

- `<log_file>`: The path to the log file that contains the login attempts.
- `<output_file>`: The path where the output file will be created, containing the IP addresses that have failed to log in three or more times.

## Design Choices
1. **Input Handling**: The program checks for the correct number of command line arguments to ensure that both the log file and output file are provided.
2. **Data Storage**: It uses two arrays to store IP addresses and their corresponding failure counts. This allows for efficient tracking of how many times each IP address has failed to log in.
3. **Log Processing**: The program reads the log file line by line, checking for the keyword "Invalid" to identify failed login attempts. It splits each line into parts to extract the IP address.
4. **Output Generation**: After processing the log file, the program writes the IP addresses that have failed three or more times to the specified output file.

## Conclusion
This program is a simple yet effective way to monitor failed login attempts and can be useful for security purposes. The design choices made prioritize clarity and efficiency, making it easy to understand and maintain.
