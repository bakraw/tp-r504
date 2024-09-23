#!/bin/sh

docker run -v $(pwd)/srv:/srv --name tp4-app -p 127.0.0.1:5000:5000 --network net-tp4 im-tp4
