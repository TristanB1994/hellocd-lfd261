#!/bin/bash

docker run --rm -it -p 8080:8080 -v m2:/root/.m2 -v ${PWD}:/app maven mvn spring-boot:run -f /app/pom.xml
