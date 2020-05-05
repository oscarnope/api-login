#!/bin/bash
docker build -t login-service-rest:1.0 .
docker run -d -p 9191:8080 --name login-service login-service-rest:1.0