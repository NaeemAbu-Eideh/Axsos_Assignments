from flask import Flask, render_template
app = Flask(__name__)

@app.route("/")
def welcome():
    return "Welcome to our page"

@app.route("/play")
def display_first_page():
    return render_template("first_page.html")

@app.route("/play/<x>")
def repeat_box(x):
    return render_template("second_page.html", num = int(x))

@app.route("/play/<x>/<color>")
def repeat_box_color(x, color):
    return render_template("third_page.html", num = int(x), color = color)

if(__name__ == "__main__"):
    app.run()