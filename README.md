# ananya-web
This is a simple skeletal spring-boot application that is created for learning purpose

#Prerequisites
You should install
- jdk - [Installing JDK](https://docs.oracle.com/en/java/javase/13/install/overview-jdk-installation.html)
- maven - [Installing maven](https://maven.apache.org/install.html)
- curl -[Installing curl in windows](https://www.oracle.com/webfolder/technetwork/tutorials/obe/cloud/objectstorage/restrict_rw_accs_cntainers_REST_API/files/installing_curl_command_line_tool_on_windows.html)


# Building the project
Clone this repository to your local and build the project by running this command in your terminal at the folder ananya-web folder
```
mvn clean install
```

# Running the Project
Change directory to learn-springboot and run this command
```
cd ./learn-springboot
mvn spring-boot:run
```
## Running various APIs

* If you open ```localhost:8080/zoo``` in your browser this will get all the animals listed in this zoo application OR you cal also run ```curl  localhost:8080/zoo``` 
* To add an animal you can do a HTTP/POST ```curl -X POST "localhost:8080/zoo?animal=elephant"```
* To remove an animal you can do a HTTP/DELETE ```curl -X DELETE "localhost:8080/zoo?animal=elephant"```
