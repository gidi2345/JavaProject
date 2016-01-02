import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.Assert;

public class FileWriterTest {

    private FileEncryptor fileWriter;

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Rule
    public void SetFileEncryptor()
    {
    	
    	
    }

    @Test
    public void throwsErrorWhenTargetFileExists() throws IOException {
        // arrange
        File output = temporaryFolder.newFile("output.txt");

        thrown.expect(IOException.class);
        thrown.expectMessage("file already exists");

        // act
        fileWriter.writeTo(output.getPath(), "test");
    }

    @Test
    public void writesContentToFile() throws IOException {
        // arrange
        File output = temporaryFolder.newFolder("reports")
                .toPath()
                .resolve("output.txt")
                .toFile();

        // act
        fileWriter.writeTo(output.getPath(), "test");

       
    }

 
	private String resolvePath(String folder) {
        return temporaryFolder
                .getRoot().toPath()
                .resolve(folder)
                .toString();
    }
}