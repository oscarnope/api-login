#!/bin/bash
docker stop login-service
docker rm login-service
docker rmi login-service-rest:1.0