original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -------------------< com.sachinhandiekar:jInstagram >-------------------
[INFO] Building jInstagram 1.2.3-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The POM for org.evosuite:evosuite-standalone-runtime:jar:1.2.0 is missing, no dependency information available
[INFO] 
[INFO] --- enforcer:1.0:enforce (enforce-maven) @ jInstagram ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ jInstagram ---
[INFO] skip non existing resourceDirectory /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[34,45] cannot find symbol
  symbol:   class IOException
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[44,39] no suitable method found for thenReturn(java.lang.String)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,60] cannot find symbol
  symbol:   class TokenExtractor
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,9] cannot find symbol
  symbol:   method whenNew(java.lang.Class<org.jinstagram.auth.model.OAuthRequest>)
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[66,83] cannot find symbol
  symbol:   variable AUTHORIZATION_CODE
  location: class org.jinstagram.auth.model.OAuthConstants
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.819 s
[INFO] Finished at: 2024-02-12T16:40:08+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[34,45] cannot find symbol
[ERROR]   symbol:   class IOException
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[44,39] no suitable method found for thenReturn(java.lang.String)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[50,60] cannot find symbol
[ERROR]   symbol:   class TokenExtractor
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,9] cannot find symbol
[ERROR]   symbol:   method whenNew(java.lang.Class<org.jinstagram.auth.model.OAuthRequest>)
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[66,83] cannot find symbol
[ERROR]   symbol:   variable AUTHORIZATION_CODE
[ERROR]   location: class org.jinstagram.auth.model.OAuthConstants
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
