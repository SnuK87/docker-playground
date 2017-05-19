#!/bin/bash

cd $(dirname $0)
docker run --name databse-one -p 8080:8080 -t snuk/database-one:latest