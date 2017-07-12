

Before first use, you need to get All needed content for testing:
mvn clean test-compile exec:java -Dexec.mainClass="get_content.GetAllContent" -Dexec.classpathScope="test" -Dexec.cleanupDaemonThreads=false

In the case when you need to refresh some content (e.g. You have changed some info at ContactPage, so you have to run GetContactScreenshots.class to get new content):
mvn clean test-compile exec:java -Dexec.mainClass="get_content.GetContactScreenshots" -Dexec.classpathScope="test" -Dexec.cleanupDaemonThreads=false

To run regression test suite:
mvn clean install -P regression