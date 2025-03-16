// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;
import java.text.Normalizer;
import org.junit.Test;
import static org.junit.Assert.*;
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
    public void testGetText() {
        // Create a TextChunk object with some TextElements
        TextElement textElement1 = new TextElement("Hello");
        TextElement textElement2 = new TextElement("World");
        TextChunk textChunk = new TextChunk(textElement1);
        textChunk.add(textElement2);

        // Call the getText() method
        String result = textChunk.getText();

        // Normalize the expected result
        String expected = Normalizer.normalize("HelloWorld", Normalizer.Form.NFKC).trim();

        // Assert that the result matches the expected value
        assertEquals(expected, result);
    }
}
