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

## 2. Write Content to a File
The utility enables users to write content to a file. This operation overwrites the existing file content. The user provides the filename and the content, and the program writes the content into the file. If an error occurs during writing (such as file access issues), the program catches and displays the error.

The writeFile() method uses FileWriter to open the file in write mode and writes the given content.

## 3. Read a File
The read operation allows users to read and display the contents of a file. The program reads each line of the file and prints it to the console. If the file does not exist or is empty, an appropriate error message is displayed. The readFile() method uses BufferedReader to read the file line by line.

## 4. Append Data to a File
The append operation allows users to add content to the end of an existing file without overwriting the original content. The user provides the filename and the data to be appended, and the program adds it to the file. This is particularly useful when maintaining logs or adding continuous data to a file.

The appendDataFile() method uses FileWriter with the true flag to enable append mode.

## 5. Delete a File
The utility allows users to delete a file. If the file exists, it is deleted successfully. If the file cannot be deleted (e.g., due to insufficient permissions), the program will display an error message. The deleteFile() method uses the delete() function of the File class to remove the file from the system.

## 6. Check if a File Exists
The check existence operation allows the user to verify if a file exists. The program checks whether the specified file is present in the system, and if so, it prints the file’s properties such as name, location, size, and read/write permissions. If the file does not exist, it displays an error message.

The isExistsFile() method checks if the file exists using exists() and then prints details about the file.





