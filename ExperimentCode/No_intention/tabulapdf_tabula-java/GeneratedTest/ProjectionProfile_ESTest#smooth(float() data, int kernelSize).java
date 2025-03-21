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
    public void testSmooth() {
        float[] data = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        int kernelSize = 3;
        float[] expected = {2.5f, 3.5f, 4.5f, 4.5f, 4.5f};

        float[] result = ProjectionProfile.smooth(data, kernelSize);

        assertArrayEquals(expected, result, 0.001f);
    }
}
