#  创建Exam1
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam1 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false -DarchetypeCatalog=internal

#执行项目
cd Exam1

mvn jetty:run

#在网页输入localhost:8080进入登录界面

#在网页输入http://localhost:8080/views/film.jsp进入功能界面




