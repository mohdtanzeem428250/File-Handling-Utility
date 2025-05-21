// Import necessary classes for file handling and user input
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

// Define a class that contains all the file operations
class FileOperationMethod
{
    // Method to create a new file
    public void createFile(String filename)
    {
        File file = new File(filename + ".txt"); // Create a File object with .txt extension
        try
        {
            if (file.createNewFile()) // Try to create the file
            {
                System.out.println("File Created Successfully...");
            }
            else
            {
                System.out.println("File Creation Error..."); // File already exists
            }
        }
        catch (IOException exception)
        {
            // If an error occurs, print the error message
            System.out.println("File Created Error..." + exception.getMessage());
        }
    }

    // Method to write content into a file (overwrites existing content)
    public void writeFile(String filename, String content)
    {
        try (FileWriter writer = new FileWriter(filename + ".txt")) // Open file writer (will overwrite)
        {
            writer.write(content); // Write content to file
            System.out.println("Successfully Write To The File...");
        }
        catch (IOException exception)
        {
            // Print error if something goes wrong
            System.out.println("An Error Occurred While Writing To The File..." + exception.getMessage());
        }
    }

    // Method to read and display file content
    public void readFile(String filename)
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename + ".txt")))
        {
            String lines;
            // Read each line and print it until the end of the file
            while ((lines = bufferedReader.readLine()) != null)
            {
                System.out.println(lines);
            }
        }
        catch (IOException exception)
        {
            // Handle reading errors
            System.out.println("An Error Occurred While Reading To The File..." + exception.getMessage());
        }
    }

    // Method to append data at the end of a file
    public void appendDataFile(String filename, String addData)
    {
        try
        {
            FileWriter fileWriter = new FileWriter(filename + ".txt", true); // 'true' means append mode
            fileWriter.write(addData); // Append data to file
            System.out.println("This Data Successfully Added To The File...");
            fileWriter.close(); // Close the writer
        }
        catch (IOException exception)
        {
            System.out.println("File Data Added Error..." + exception.getMessage());
        }
    }

    // Method to check if a file exists and print its details
    public void isExistsFile(String filename)
    {
        // File path is hardcoded here  ideally, this should be made dynamic
        File file = new File("E:\\CodTech IT Solution PVT. LTD. Internship Work\\Task_1-File_Handling_Utility\\" + filename + ".txt");
        if (file.exists()) // If file exists, print its properties
        {
            System.out.println("File Name : " + file.getName());
            System.out.println("File Location : " + file.getAbsolutePath());
            System.out.println("File Writable : " + file.canWrite());
            System.out.println("File Readable : " + file.canRead());
            System.out.println("File Size : " + file.length()); // File size in bytes
        }
        else
        {
            System.out.println("File Doesn't Exist");
        }
    }

    // Method to delete a file
    public void deleteFile(String filename)
    {
        File file = new File(filename + ".txt");
        if (file.delete()) // Try to delete the file
        {
            System.out.println("File (" + file.getName() + ") Deleted Successfully...");
        }
        else
        {
            System.out.println("File Deletion Error...");
        }
    }
}

// Main class that shows the menu and handles user interaction
class File_Operation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        FileOperationMethod object = new FileOperationMethod(); // Create object to call file methods

        for (boolean flag = true; flag;) // Infinite loop until user chooses to exit
        {
            // Display menu options
            System.out.println("-----Welcome To This Project All File Handling Operations-----");
            System.out.println("1. Create A New File");
            System.out.println("2. Write A File");
            System.out.println("3. Read A File");
            System.out.println("4. Append The Data In File");
            System.out.println("5. Delete A File");
            System.out.println("6. Exists A File");
            System.out.println("7. Exit The Project");

            String filename; // Variable to store user-input filename
            int number = scanner.nextInt(); // Get user's choice
            scanner.nextLine(); // Clear buffer

            // Perform action based on user choice
            switch (number)
            {
                case 1:
                    System.out.println("Enter The Create File Name...");
                    filename = scanner.nextLine();
                    object.createFile(filename); // Call create file method
                    break;

                case 2:
                    System.out.println("Enter Your File Name...");
                    filename = scanner.nextLine();
                    System.out.println("Enter Your Content Write This File...");
                    String content = scanner.nextLine(); // Get content from user
                    object.writeFile(filename, content); // Write to file
                    break;

                case 3:
                    System.out.println("Enter Your Read File Name...");
                    filename = scanner.nextLine();
                    System.out.println("Your File Content...");
                    object.readFile(filename); // Read and print file content
                    break;

                case 4:
                    System.out.println("Enter Your Added File Name...");
                    filename = scanner.nextLine();
                    System.out.println("Enter Your Data Added In This File...");
                    String addData = scanner.nextLine();
                    object.appendDataFile(filename, addData); // Append to file
                    break;

                case 5:
                    System.out.println("Enter Your Delete File...");
                    filename = scanner.nextLine();
                    object.deleteFile(filename); // Delete the file
                    break;

                case 6:
                    System.out.println("Enter Your Exists File Name...");
                    filename = scanner.nextLine();
                    object.isExistsFile(filename); // Check file properties
                    break;

                case 7:
                    return; // Exit the program

                default:
                    // If user enters invalid choice
                    System.out.println("Invalid Options. Please Try Again...");
            }
        }
    }
}
