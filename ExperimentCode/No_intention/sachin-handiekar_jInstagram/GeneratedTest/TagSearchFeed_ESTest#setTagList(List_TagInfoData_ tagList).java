// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/tags/TagSearchFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:18:17 GMT 2024
 */
package org.jinstagram.entity.tags;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.tags.TagInfoData;
import org.jinstagram.entity.tags.TagSearchFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TagSearchFeed_ESTest extends TagSearchFeed_ESTest_scaffolding {
    @Test
    public void testSetTagList() {
        // Create a new instance of TagSearchFeed
        TagSearchFeed tagSearchFeed = new TagSearchFeed();

        // Create a list of TagInfoData objects
        List<TagInfoData> tagList = new ArrayList<>();
        tagList.add(new TagInfoData("tag1"));
        tagList.add(new TagInfoData("tag2"));
        tagList.add(new TagInfoData("tag3"));

        // Set the tagList using the setTagList method
        tagSearchFeed.setTagList(tagList);

        // Verify that the tagList is set correctly
        assertEquals(tagList, tagSearchFeed.getTagList());
    }
}
