# API JAVA 10 #

* SpringBoot
* RabbitMQ
* Hystrix
* MongoDB
* Feign
* Locust.io

Build
```
./gradlew clean build
./gradlew build spotbugs
./gradlew integrationTest
./gradlew contractTest
./gradlew jacocoTestReport
```

Run
```
./gradlew bootRun
```

To access doc
```
http://localhost:9900/docs/index.html
```

To access actuator
```
http://localhost:8888/actuator
```


# Locust #

### Load testing with Locust ###

To install with Ubuntu
```
sudo apt-get install python3 python3-pip
python3 -m pip install locustio
```

Run
```
locust -f locustfile.py --host=http://localhost:9900
```

To access web ui
```
http://localhost:8089/
```

Locust Documentation
```
https://docs.locust.io/en/latest/what-is-locust.html
```