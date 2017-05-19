#!/bin/bash

cd $(dirname $0)

docker run --name service-one -p 8080:8080 -t snuk/database-one:latest
