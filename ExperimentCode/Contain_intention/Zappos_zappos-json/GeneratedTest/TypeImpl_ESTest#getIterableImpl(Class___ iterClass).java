// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/TypeImpl_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:15:15 GMT 2024
 */
package com.zappos.json.util;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
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
    public void testGetIterableImpl() {
        Class<?> listClass = List.class;
        Class<?> collectionClass = Collection.class;
        Class<?> iterableClass = Iterable.class;
        Class<?> abstractClass = AbstractClass.class; // Assuming AbstractClass is a custom abstract class for testing
        Class<?> interfaceClass = InterfaceClass.class; // Assuming InterfaceClass is a custom interface for testing
        Class<?> otherClass = OtherClass.class; // Assuming OtherClass is a custom class for testing

        TypeImpl listResult = TypeImpl.getIterableImpl(listClass);
        assertEquals(ArrayList.class, listResult.getImplClass());

        TypeImpl collectionResult = TypeImpl.getIterableImpl(collectionClass);
        assertEquals(ArrayList.class, collectionResult.getImplClass());

        TypeImpl iterableResult = TypeImpl.getIterableImpl(iterableClass);
        assertEquals(ArrayList.class, iterableResult.getImplClass());

        try {
            TypeImpl.getIterableImpl(abstractClass);
            fail("Expected RuntimeException for abstract class");
        } catch (RuntimeException e) {
            assertEquals("Cannot find appropriate implementation of collection type: " + abstractClass.getName(), e.getMessage());
        }

        try {
            TypeImpl.getIterableImpl(interfaceClass);
            fail("Expected RuntimeException for interface class");
        } catch (RuntimeException e) {
            assertEquals("Cannot find appropriate implementation of collection type: " + interfaceClass.getName(), e.getMessage());
        }

        TypeImpl otherResult = TypeImpl.getIterableImpl(otherClass);
        assertEquals(otherClass, otherResult.getImplClass());
    }
}
