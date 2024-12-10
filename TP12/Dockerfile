FROM python:latest

RUN \
pip install flask-mysqldb mysql-connector-python request

CMD ["flask","--app","serveur.py","run","--host=0.0.0.0", "--debug"]
