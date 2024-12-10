from flask import Flask, render_template, request
import mysql.connector
import re

app = Flask(__name__)


@app.route('/newuser/', methods =["GET", "POST"])
def login():
    if request.method == "POST":
        username = request.form.get("username")
        password = request.form.get("password") 

        pattern = re.compile("^(?=.*\d)(?=.*[A-Z])(?=.*[!@#$%^&*._?])[A-Za-z\d!@#$%^&*_.?]{8,}$")
        if pattern.match(password):
            return "OK"
        return "MDP invalide"
        
    return render_template("login.html")

if __name__ == '__main__':
    app.run(debug=True)
    
