// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;





import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.util.List;
import technology.tabula.TextChunk;
import technology.tabula.TextElement;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Line;
import technology.tabula.Rectangle;
import technology.tabula.TextChunk;
import technology.tabula.TextElement;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TextChunk_ESTest extends TextChunk_ESTest_scaffolding {
    


    
    
    
    @Test
    public void testSqueeze() {
        // Create TextElements for testing
        TextElement textElement1 = new TextElement("AAA");
        TextElement textElement2 = new TextElement("BBB");
        TextElement textElement3 = new TextElement("CCC");
        TextElement textElement4 = new TextElement("DDD");
        
        // Create a TextChunk with the TextElements
        TextChunk textChunk = new TextChunk(List.of(textElement1, textElement2, textElement3, textElement4));
        
        // Perform squeeze operation
        List<TextChunk> squeezedChunks = textChunk.squeeze('A', 2);
        
        // Verify the squeezedChunks
        assertEquals(2, squeezedChunks.size());
        assertEquals("AAA", squeezedChunks.get(0).getTextElements().get(0).getText());
        assertEquals("BBB", squeezedChunks.get(1).getTextElements().get(0).getText());
    }
}
