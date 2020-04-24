# JAVA Maven Project

### Important Java/Mvn Commands
   * mvn archetype:generate -DgroupId=com.awsys.app -DartifactId=myblockchain-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
   * mvn complile
   
### Run a project
   * mvn exec:java -Dexec.mainClass=com.awsys.app.App

# Docker
   * sudo docker build --tag myblockchain-app:1.0 .
   * sudo docker run --publish 8080:8080 --detach --name mb myblockchain-app:1.0
   * sudo docker save myblockchain-app:1.0 -o myblockchain-app_10.tar

