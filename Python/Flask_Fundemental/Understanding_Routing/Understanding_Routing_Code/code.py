from flask import Flask
app = Flask(__name__)
@app.route("/")
def hello_world():
    return "Hello World!"

@app.route("/Champion")
def champion():
    return "Champion"

@app.route("/say/Flask")
def hi_flask():
    return "Hi Flask"

@app.route("/say/Michael")
def hi_micheal():
    return "Hi Micheal"

@app.route("/repeat/<num>/<name>")
def repeat_hello(num, name):
    text = ""
    for i in range(int(num)):
        text += f"{i+1}. {name} \n"
    return text

if __name__=="__main__":  
    app.run()