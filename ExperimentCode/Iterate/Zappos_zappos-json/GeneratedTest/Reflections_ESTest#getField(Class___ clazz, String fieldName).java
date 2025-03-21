// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:11:21 GMT 2024
 */
package com.zappos.json.util;




import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Reflections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Reflections_ESTest extends Reflections_ESTest_scaffolding {
    


    
    
    @Test
    public void testGetField() throws NoSuchFieldException {
        // Test when field is found in the given class
        Field fieldInClass = Reflections.getField(TestClass.class, "fieldInClass");
        assertNotNull(fieldInClass);
        assertEquals("fieldInClass", fieldInClass.getName());

        // Test when field is found in a superclass
        Field fieldInSuperclass = Reflections.getField(TestClass.class, "fieldInSuperclass");
        assertNotNull(fieldInSuperclass);
        assertEquals("fieldInSuperclass", fieldInSuperclass.getName());

        // Test when field is not found in the class hierarchy
        Field nonExistentField = Reflections.getField(TestClass.class, "nonExistentField");
        assertNull(nonExistentField);
    }
}
