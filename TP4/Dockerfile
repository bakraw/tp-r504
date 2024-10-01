FROM python:latest

RUN \
pip install flask-mysqldb mysql-connector-python

CMD ["flask","--app","srv/app_1","run","--host=0.0.0.0", "--debug"]
