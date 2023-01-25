import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTests {
    @Test
    public void testGetFiles() throws IOException{
        String[] expected = {"testDir/a.txt", "testDir/testDirSub/b.txt", "testDir/testDirSub/c.txt"};
        assertArrayEquals(expected, FileExample.getFiles(new File("testDir")).toArray());
    }
}
