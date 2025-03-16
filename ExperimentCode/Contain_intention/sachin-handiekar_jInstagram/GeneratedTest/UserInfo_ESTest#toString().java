// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/basicinfo/UserInfo_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:22:05 GMT 2024
 */
package org.jinstagram.entity.users.basicinfo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.users.basicinfo.UserInfo;
import org.jinstagram.entity.users.basicinfo.UserInfoData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class UserInfo_ESTest extends UserInfo_ESTest_scaffolding {
    @Test
    public void testToString() {
        UserInfoData userInfoData = new UserInfoData();
        userInfoData.setId("123");
        userInfoData.setUsername("testUser");

        UserInfo userInfo = new UserInfo();
        userInfo.setData(userInfoData);

        String expected = "UserInfo [data=UserInfoData{id='123', username='testUser'}]";
        String actual = userInfo.toString();

        assertEquals(expected, actual);
    }
}
