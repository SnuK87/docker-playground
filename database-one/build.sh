#!/bin/bash

cd $(dirname $0)

docker build --tag snuk/database-one:latest .