#!/bin/sh

mysql -u root -p -h 127.0.0.1 --port=3307 < data.sql
