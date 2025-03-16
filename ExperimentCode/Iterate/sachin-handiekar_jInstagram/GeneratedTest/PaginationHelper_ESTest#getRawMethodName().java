// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/utils/PaginationHelper_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:15:36 GMT 2024
 */
package org.jinstagram.utils;





import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.utils.PaginationHelper;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PaginationHelper_ESTest extends PaginationHelper_ESTest_scaffolding {
    


    

    
    @Test
    public void testGetRawMethodName() {
        // Given
        String methodName = "my%20method%20name";
        Map<String, String> params = new HashMap<>();
        Page page = new Page(methodName, params);

        // When
        String rawMethodName = page.getRawMethodName();

        // Then
        assertEquals("my method name", rawMethodName);
    }
}
