original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The POM for org.evosuite:evosuite-standalone-runtime:jar:1.2.0 is missing, no dependency information available
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[30,21] no suitable constructor found for Page(no arguments)
    constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[31,13] cannot find symbol
  symbol:   method setText(java.lang.String)
  location: variable page of type technology.tabula.Page
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[34,30] no suitable constructor found for Page(no arguments)
    constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[35,22] cannot find symbol
  symbol:   method setText(java.lang.String)
  location: variable minimalRegion of type technology.tabula.Page
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,9] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,36] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,9] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,39] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,14] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,34] cannot find symbol
  symbol:   class ArrayList
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[53,52] cannot find symbol
  symbol:   variable Mockito
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,9] cannot find symbol
  symbol:   variable Mockito
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[57,51] cannot find symbol
  symbol:   variable Mockito
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[58,9] cannot find symbol
  symbol:   variable Mockito
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[64,28] cannot find symbol
  symbol:   method setAlgorithm(technology.tabula.extractors.SpreadsheetExtractionAlgorithm)
  location: variable extractionAlgorithm of type technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[65,28] cannot find symbol
  symbol:   method setBasicAlgorithm(technology.tabula.extractors.BasicExtractionAlgorithm)
  location: variable extractionAlgorithm of type technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[INFO] 16 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.402 s
[INFO] Finished at: 2024-02-12T18:49:03+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[30,21] no suitable constructor found for Page(no arguments)
[ERROR]     constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[31,13] cannot find symbol
[ERROR]   symbol:   method setText(java.lang.String)
[ERROR]   location: variable page of type technology.tabula.Page
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[34,30] no suitable constructor found for Page(no arguments)
[ERROR]     constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[35,22] cannot find symbol
[ERROR]   symbol:   method setText(java.lang.String)
[ERROR]   location: variable minimalRegion of type technology.tabula.Page
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,9] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,36] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,9] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,39] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,14] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,34] cannot find symbol
[ERROR]   symbol:   class ArrayList
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[53,52] cannot find symbol
[ERROR]   symbol:   variable Mockito
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,9] cannot find symbol
[ERROR]   symbol:   variable Mockito
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[57,51] cannot find symbol
[ERROR]   symbol:   variable Mockito
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[58,9] cannot find symbol
[ERROR]   symbol:   variable Mockito
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[64,28] cannot find symbol
[ERROR]   symbol:   method setAlgorithm(technology.tabula.extractors.SpreadsheetExtractionAlgorithm)
[ERROR]   location: variable extractionAlgorithm of type technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[65,28] cannot find symbol
[ERROR]   symbol:   method setBasicAlgorithm(technology.tabula.extractors.BasicExtractionAlgorithm)
[ERROR]   location: variable extractionAlgorithm of type technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
