// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/likes/LikesFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:59:43 GMT 2024
 */
package org.jinstagram.entity.likes;
import org.jinstagram.entity.common.Meta;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.User;
import org.jinstagram.entity.likes.LikesFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class LikesFeed_ESTest extends LikesFeed_ESTest_scaffolding {
    @Test
    public void testGetMeta() {
        // Create a LikesFeed object
        LikesFeed likesFeed = new LikesFeed();

        // Create a Meta object
        Meta meta = new Meta();
        meta.setCode(200);
        meta.setErrorType("none");
        meta.setErrorMessage("");

        // Set the Meta object in the LikesFeed object
        likesFeed.setMeta(meta);

        // Call the getMeta() method and assert the returned value
        Meta returnedMeta = likesFeed.getMeta();
        assertEquals(meta, returnedMeta);
    }
}
