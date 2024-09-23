#!/bin/sh

docker rm $(docker ps -aq)
docker system prune -af --volumes
