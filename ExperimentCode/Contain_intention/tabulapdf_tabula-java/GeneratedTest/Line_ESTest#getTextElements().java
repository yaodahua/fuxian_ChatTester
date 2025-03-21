// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/Line_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:53:47 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import technology.tabula.TextChunk;
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
    public void testGetTextElements() {
        // Create a Line object
        Line line = new Line();
        
        // Create TextChunk objects
        TextChunk textChunk1 = new TextChunk("TextChunk 1");
        TextChunk textChunk2 = new TextChunk("TextChunk 2");
        
        // Add TextChunk objects to the Line object
        line.addTextChunk(textChunk1);
        line.addTextChunk(textChunk2);
        
        // Retrieve the list of TextChunk objects using getTextElements()
        List<TextChunk> textElements = line.getTextElements();
        
        // Check if the size of the retrieved list matches the expected size
        assertEquals(2, textElements.size());
        
        // Check if the retrieved list contains the expected TextChunk objects
        assertEquals(textChunk1, textElements.get(0));
        assertEquals(textChunk2, textElements.get(1));
    }
}
