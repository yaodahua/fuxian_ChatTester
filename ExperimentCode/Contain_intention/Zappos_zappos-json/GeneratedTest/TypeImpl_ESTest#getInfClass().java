// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/TypeImpl_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:15:15 GMT 2024
 */
package com.zappos.json.util;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.TypeImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeImpl_ESTest extends TypeImpl_ESTest_scaffolding {
    @Test
    public void testGetInfClass() {
        // Given
        Class<?> infClass = String.class;
        Class<?> implClass = Integer.class;
        TypeImpl typeImpl = new TypeImpl(infClass, implClass);

        // When
        Class<?> retrievedInfClass = typeImpl.getInfClass();

        // Then
        assertEquals(infClass, retrievedInfClass);
    }
}
