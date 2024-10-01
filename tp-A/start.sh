#!/bin/sh

docker build . -t im-nginx-lb

mkdir shared1 shared2
cat '<h1>Hello 1</h1>' > ./shared1/index.html
cat '<h1>Hello 2</h1>' > ./shared2/index.html
