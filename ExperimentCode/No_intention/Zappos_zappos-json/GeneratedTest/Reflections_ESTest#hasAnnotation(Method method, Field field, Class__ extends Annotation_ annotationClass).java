// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:11:21 GMT 2024
 */
package com.zappos.json.util;
import org.junit.Test;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.junit.Assert.*;
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
    public void testHasAnnotation() throws NoSuchFieldException {
        // Create a test class instance
        Reflections reflections = new Reflections();

        // Create a test method
        Method testMethod = Reflections.class.getDeclaredMethod("hasAnnotation", Method.class, Field.class, Class.class);

        // Create a test field
        Field testField = Reflections.class.getDeclaredField("hasAnnotation");

        // Create a test annotation class
        Class<? extends Annotation> testAnnotationClass = Test.class;

        // Test when both method and field have the annotation
        assertTrue(reflections.hasAnnotation(testMethod, testField, testAnnotationClass));

        // Test when only the field has the annotation
        assertFalse(reflections.hasAnnotation(testMethod, testField, Override.class));

        // Test when only the method has the annotation
        assertFalse(reflections.hasAnnotation(testMethod, testField, Deprecated.class));

        // Test when neither method nor field has the annotation
        assertFalse(reflections.hasAnnotation(testMethod, testField, SuppressWarnings.class));
    }
}
