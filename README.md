# File-Handling-Utility

*COMPANY* : CODTECH IT SOLUTIONS PVT. LTD.

*NAME* : MOHD TANZEEM

*INTERN ID* : CT08DA696

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 8 WEEKS

*MENTOR* : NEELA SANTHOSH KUMAR

# Task Description: File Handling Utility in Java

The objective of my task was to build a File Handling Utility using Java that performs the most basic and essential file operations: creating, reading, writing, appending, and deleting files. This utility was designed to be run in the command line, providing a simple and interactive user interface. Each operation is implemented using Java’s built-in file handling classes, including File, FileWriter, FileReader, BufferedReader, BufferedWriter, and the File class for deleting files.

## 1. Creating a File
The utility allows users to create a new file with a .txt extension. The program prompts the user to enter the filename and attempts to create the file. If the file does not exist, it is created successfully. If the file already exists, an error message is shown to prevent overwriting the existing file.

The createFile() method uses the createNewFile() function of the File class to check if the file exists and to create it if it does not.
