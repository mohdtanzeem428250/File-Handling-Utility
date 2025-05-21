import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

// Class that handles file operations
class File_Operations
{
    String filename = "Testing.txt"; // Name of the file to be used

    // Method to create a new file
    public void createFile()
    {
        File file = new File(filename); // Create a File object
        try
        {
            // Check if file is created successfully
            if(file.createNewFile())
            {
                System.out.println("File Created Successfully...");
            }
            else
            {
                // If file already exists
                System.out.println("File Creation Error...");
            }
        }
        catch(IOException exception)
        {
            // Handle any error during file creation
            System.out.println("File Created Error..."+exception.getMessage());
        }
    }

    // Method to write data into the file
    public void writeFile(String data)
    {
        try
        {
            FileWriter fileWriter = new FileWriter(filename); // Create FileWriter to write data
            fileWriter.write(data); // Write the provided data to the file
            System.out.println("Data Is Written Successfully...");
            fileWriter.close(); // Close the FileWriter
        }
        catch(IOException exception)
        {
            // Handle any error during file writing
            System.out.println("File Write Error..."+exception.getMessage());
        }
    }

    // Method to read data from the file
    public void readFile()
    {
        char[] data = new char[100]; // Create a character array to store the data
        try
        {
            FileReader fileReader = new FileReader(filename); // Create FileReader to read the file
            fileReader.read(data); // Read data into the character array
            System.out.println("Data Receiving From A File");
            System.out.println(data); // Print the data read from the file
            fileReader.close(); // Close the FileReader
        }
        catch(IOException exception)
        {
            // Handle any error during file reading
            System.out.println("File Read Error..."+exception.getMessage());
        }
    }

    // Method to append data to the existing file
    public void appendDataFile(String appendData)
    {
        try
        {
            FileWriter fileWriter = new FileWriter(filename, true); // 'true' enables append mode
            fileWriter.write(appendData); // Append the given data to the file
            System.out.println("File Updated Successfully...");
            fileWriter.close(); // Close the FileWriter
        }
        catch(IOException exception)
        {
            // Handle any error during file update
            System.out.println("File Updated Error..."+exception.getMessage());
        }
    }

    // Method to delete the file
    public void deleteFile()
    {
        File file = new File(filename); // Create a File object
        if(file.delete())
        {
            // If file is successfully deleted
            System.out.println("File ("+file.getName()+") Deleted Successfully...");
        }
        else
        {
            // If file could not be deleted
            System.out.println("File Deleted Error");
        }
    }
}

// Main class that contains the main() method to execute the program
class File_Handling
{
    public static void main(String[] args)
    {
        System.out.println("Internship Work");
        File_Operations object = new File_Operations(); // Create an object of File_Operations

        object.createFile(); // Create the file
        object.writeFile("124, Mohd Tanzeem, India"); // Write data into the file
        object.readFile(); // Read and display data from the file
        object.appendDataFile("This Is Data In This File Append"); // Append additional data
        object.deleteFile(); // Delete the file
    }
}
