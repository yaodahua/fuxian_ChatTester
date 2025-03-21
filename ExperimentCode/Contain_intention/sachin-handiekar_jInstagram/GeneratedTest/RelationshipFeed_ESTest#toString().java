// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/relationships/RelationshipFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:10:49 GMT 2024
 */
package org.jinstagram.entity.relationships;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.relationships.RelationshipData;
import org.jinstagram.entity.relationships.RelationshipFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RelationshipFeed_ESTest extends RelationshipFeed_ESTest_scaffolding {
    @Test
    public void testToString() {
        RelationshipData testData = new RelationshipData();
        testData.setId("123");
        testData.setType("test");

        Meta testMeta = new Meta();
        testMeta.setCode(200);
        testMeta.setErrorType("none");

        RelationshipFeed testFeed = new RelationshipFeed();
        testFeed.setData(testData);
        testFeed.setMeta(testMeta);

        String expected = "RelationshipFeed [data=RelationshipData{id='123', type='test'}, meta=Meta{code=200, errorType='none'}]";
        String actual = testFeed.toString();

        assertEquals(expected, actual);
    }
}
