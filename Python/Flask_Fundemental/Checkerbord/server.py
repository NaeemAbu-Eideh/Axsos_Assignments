from flask import Flask, render_template
app = Flask(__name__)

@app.route("/")
def diplay_eight_eight():
    return render_template("page.html", num1 = 8, num2 = 8, color1 = "white", color2 = "black")

@app.route("/<row>")
def diplay_eight_num(row, column = "8"):
    return render_template("page.html", num1 = int(row), num2 = int(column), color1 = "white", color2 = "black")

@app.route("/<row>/<column>")
def display_row_column(row = 8, column = 8):
    return render_template("page.html", num1 = int(row), num2 = int(column), color1 = "white", color2 = "black")

@app.route("/<c1>")
@app.route("/<c1>/<c2>")
@app.route("/<row>/<c1>/<c2>")
@app.route("/<row>/<c1>")
@app.route("/<row>/<column>/<c1>/<c2>")
@app.route("/<row>/<column>/<c1>")
def display_colors(row = "8", column = "8", c1 = "white", c2 = "black"):
    return render_template("page.html", num1 = int(row), num2 = int(column), color1 = c1, color2 = c2)

if(__name__ == "__main__"):
    app.run()