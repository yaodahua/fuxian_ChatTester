// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/ProjectionProfile_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:59:46 GMT 2024
 */
package technology.tabula;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Page;
import technology.tabula.ProjectionProfile;
import technology.tabula.Rectangle;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ProjectionProfile_ESTest extends ProjectionProfile_ESTest_scaffolding {
    @Test
    public void testGetAutocorrelation() {
        float[] projection = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        float[] expected = {0.02f, 0.06f, 0.12f, 0.2f};

        float[] result = ProjectionProfile.getAutocorrelation(projection);

        assertArrayEquals(expected, result, 0.001f);
    }
}
