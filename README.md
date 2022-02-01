# ananya-web
This is a simple skeletal spring-boot application that is created for learning purpose
# Building the project
Build the project by running this command in your terminal at the folder ananya-web folder
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

* If you open ```localhost:8080``` in your browser ths will get the counter value OR you cal also run ```curl  localhost:8080``` 
* To increase the counter you can do a HTTP/PUT to increment the counter ```curl -X PUT localhost:8080```
* Now if you open the browser the count would have increased by one
* To increase the counter you can do a HTTP/DELETE to decrement the counter ```curl -X DELETE localhost:8080```
