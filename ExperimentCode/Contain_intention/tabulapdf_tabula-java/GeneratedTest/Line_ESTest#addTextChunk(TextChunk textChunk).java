// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:53:47 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import technology.tabula.Line;
import technology.tabula.TextChunk;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Line;
import technology.tabula.TextChunk;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Line_ESTest extends Line_ESTest_scaffolding {
    @Test
    public void testAddTextChunk() {
        // Create a Line instance
        Line line = new Line();
        
        // Create TextChunks for testing
        TextChunk textChunk1 = new TextChunk(10, 20, 30, 40, "Text1");
        TextChunk textChunk2 = new TextChunk(15, 25, 35, 45, "Text2");
        
        // Add the first TextChunk
        line.addTextChunk(textChunk1);
        
        // Verify that the first TextChunk is set as the rectangle for the Line
        assertEquals(textChunk1, line.getRect());
        
        // Add the second TextChunk
        line.addTextChunk(textChunk2);
        
        // Verify that the second TextChunk is merged with the existing TextChunk
        List<TextChunk> expectedTextChunks = new ArrayList<>();
        expectedTextChunks.add(textChunk1);
        expectedTextChunks.add(textChunk2);
        assertEquals(expectedTextChunks, line.getTextElements());
    }
}
