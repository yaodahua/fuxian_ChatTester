// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/UserFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:32:23 GMT 2024
 */
package org.jinstagram.entity.users.feed;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.UserFeed;
import org.jinstagram.entity.users.feed.UserFeedData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class UserFeed_ESTest extends UserFeed_ESTest_scaffolding {

    @Test
    public void testGetPagination() {
        UserFeed userFeed = new UserFeed();
        Pagination pagination = new Pagination();
        userFeed.setPagination(pagination);

        Pagination retrievedPagination = userFeed.getPagination();

        assertNotNull("Pagination object should not be null", retrievedPagination);
    }

    @Test
    public void testSetPagination() {
        // Given
        UserFeed userFeed = new UserFeed();
        Pagination pagination = new Pagination();
        
        // When
        userFeed.setPagination(pagination);
        
        // Then
        assertEquals(pagination, userFeed.getPagination());
    }

    @Test
    public void testGetMeta() {
        // Given
        Meta expectedMeta = new Meta();
        UserFeed userFeed = new UserFeed();
        userFeed.setMeta(expectedMeta);

        // When
        Meta actualMeta = userFeed.getMeta();

        // Then
        assertNotNull(actualMeta);
        assertEquals(expectedMeta, actualMeta);
    }

@Test
public void testGetUserList() {
    UserFeed userFeed = new UserFeed();
    List<UserFeedData> expectedUserList = new LinkedList<UserFeedData>();

    UserFeedData user1 = new UserFeedData();
    user1.setId("User1");
    expectedUserList.add(user1);

    UserFeedData user2 = new UserFeedData();
    user2.setId("User2");
    expectedUserList.add(user2);

    userFeed.setUserList(expectedUserList);
    List<UserFeedData> actualUserList = userFeed.getUserList();
    assertNotNull(actualUserList);
    assertEquals(expectedUserList, actualUserList);
}

    @Test
    public void testSetMeta() {
        // Given
        UserFeed userFeed = new UserFeed();
        Meta meta = new Meta();
        
        // When
        userFeed.setMeta(meta);
        
        // Then
        assertEquals(meta, userFeed.getMeta());
    }

}
