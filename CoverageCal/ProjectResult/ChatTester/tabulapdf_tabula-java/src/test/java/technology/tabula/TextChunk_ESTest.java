// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;







import java.util.*;
import java.lang.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
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

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
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

import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import technology.tabula.Line;
import technology.tabula.TextChunk;
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

import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import technology.tabula.TextElement;
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class TextChunk_ESTest extends TextChunk_ESTest_scaffolding {

@Test
public void testEquals_SameObject_ReturnsTrue() {
    TextChunk textChunk = new TextChunk(10.0f, 20.0f, 30.0f, 40.0f);
    assertTrue(textChunk.equals(textChunk));
}

@Test
public void testGroupByLines() {
    TextChunk textChunk1 = new TextChunk(10.0f, 20.0f, 30.0f, 40.0f);
    TextChunk textChunk2 = new TextChunk(15.0f, 25.0f, 35.0f, 45.0f);
    TextChunk textChunk3 = new TextChunk(20.0f, 30.0f, 40.0f, 50.0f);
    List<TextChunk> textChunks = new ArrayList<>();
    textChunks.add(textChunk1);
    textChunks.add(textChunk2);
    textChunks.add(textChunk3);
    List<Line> result = TextChunk.groupByLines(textChunks);
    assertNotNull(result);
}

    @Test
    public void testIsSameChar_AllCharactersMatch2() {
        TextChunk textChunk = new TextChunk(0, 0, 10, 10);
        Character[] characters = {'a', 'b', 'c', 'd'};
        assertTrue(textChunk.isSameChar(characters));
    }

    @Test
    public void testIsSameChar_AllCharactersMatch() {
        TextChunk textChunk = new TextChunk(0, 0, 5, 1);
        assertTrue(textChunk.isSameChar(new Character[]{'H', 'e', 'l', 'l', 'o'}));
    }

}
