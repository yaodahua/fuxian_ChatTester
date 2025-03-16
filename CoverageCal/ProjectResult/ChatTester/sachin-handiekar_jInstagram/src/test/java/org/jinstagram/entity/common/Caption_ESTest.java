// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Caption_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:34:16 GMT 2024
 */
package org.jinstagram.entity.common;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Caption;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Caption_ESTest extends Caption_ESTest_scaffolding {

    @Test
    public void testGetFrom() {
        // Given
        FromTagData expectedFrom = new FromTagData();
        Caption caption = new Caption();
        caption.setFrom(expectedFrom);

        // When
        FromTagData actualFrom = caption.getFrom();

        // Then
        assertEquals(expectedFrom, actualFrom);
    }

    @Test
    public void testGetText() {
        // Given
        Caption caption = new Caption();
        String expectedText = "Sample text";
        caption.setText(expectedText);

        // When
        String actualText = caption.getText();

        // Then
        assertEquals(expectedText, actualText);
    }

    @Test
    public void testSetId() {
        // Given
        Caption caption = new Caption();
        String id = "12345";

        // When
        caption.setId(id);

        // Then
        assertEquals(id, caption.getId());
    }

    @Test
    public void testGetCreatedTime() {
        Caption caption = new Caption();
        String expectedCreatedTime = "2022-01-01T12:00:00"; // Set an expected created time value

        // Set the created time using the setter method (not directly accessing the private field)
        caption.setCreatedTime(expectedCreatedTime);

        // Call the getCreatedTime method and assert that it returns the expected value
        String actualCreatedTime = caption.getCreatedTime();
        assertEquals(expectedCreatedTime, actualCreatedTime);
    }

    @Test
    public void testSetCreatedTime() {
        Caption caption = new Caption();
        String createdTime = "2022-01-01T12:00:00Z";
        
        caption.setCreatedTime(createdTime);
        
        assertEquals(createdTime, caption.getCreatedTime());
    }

    @Test
    public void testSetText() {
        Caption caption = new Caption();
        String newText = "New Caption Text";
        
        caption.setText(newText);
        
        assertEquals(newText, caption.getText());
    }

    @Test
    public void testGetId() {
        Caption caption = new Caption();
        String expectedId = "12345";
        caption.setId(expectedId);

        String actualId = caption.getId();

        assertEquals(expectedId, actualId);
    }

}
