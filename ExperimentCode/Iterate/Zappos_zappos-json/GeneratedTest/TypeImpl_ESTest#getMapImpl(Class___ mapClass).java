// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/TypeImpl_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:15:15 GMT 2024
 */
package com.zappos.json.util;





import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;
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
    public void testGetMapImpl() {
        // Test for Map interface
        TypeImpl mapImpl = TypeImpl.getMapImpl(Map.class);
        assertEquals(HashMap.class, mapImpl.getImplClass());

        // Test for AbstractMap class
        mapImpl = TypeImpl.getMapImpl(AbstractMap.class);
        assertEquals(HashMap.class, mapImpl.getImplClass());

        // Test for ConcurrentMap interface
        mapImpl = TypeImpl.getMapImpl(ConcurrentMap.class);
        assertEquals(ConcurrentHashMap.class, mapImpl.getImplClass());

        // Test for SortedMap interface
        mapImpl = TypeImpl.getMapImpl(SortedMap.class);
        assertEquals(TreeMap.class, mapImpl.getImplClass());

        // Test for concrete class
        mapImpl = TypeImpl.getMapImpl(HashMap.class);
        assertEquals(HashMap.class, mapImpl.getImplClass());

        // Test for abstract class or interface (should throw RuntimeException)
        try {
            TypeImpl.getMapImpl(Map.class);
            fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            assertEquals("Cannot find appropriate implementation of collection type: java.util.Map", e.getMessage());
        }
    }
}
