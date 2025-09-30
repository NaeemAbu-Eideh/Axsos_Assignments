from flask import Flask, render_template, request
app = Flask(__name__)


@app.route("/")
def input_info():
    return render_template("sign_information.html")

@app.route('/result', methods=['POST'])
def create_user():
    name = request.form["name"]
    language = request.form["language"]
    location = request.form["location"]
    comment = request.form["comment"]    
    return render_template("show_information.html", name = name, language = language, location = location, comment = comment)

if(__name__ == "__main__"):
    app.run()