// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
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
    public void testHashCode() {
        // Create TextElements for testing
        TextElement textElement1 = new TextElement(10, 20, 30, 40);
        TextElement textElement2 = new TextElement(50, 60, 70, 80);
        
        // Create a TextChunk object with the TextElements
        List<TextElement> textElements = new ArrayList<>();
        textElements.add(textElement1);
        textElements.add(textElement2);
        TextChunk textChunk = new TextChunk(textElements);
        
        // Calculate the expected hash code manually
        int expectedHashCode = 31 * (super.hashCode() + textElements.hashCode());
        
        // Verify that the actual hash code matches the expected hash code
        assertEquals(expectedHashCode, textChunk.hashCode());
    }
}
