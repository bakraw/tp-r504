#!/bin/sh

docker run --rm --network net-tp4 --name mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root mysql
