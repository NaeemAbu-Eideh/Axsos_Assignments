from flask import Flask, render_template, redirect, session, request
app = Flask(__name__)
app.secret_key = "naeem"

@app.route("/")
def index():
    if(not 'number' in session):
        session['number']  = 0
    else:
        session['number']  += 1
    return render_template("page.html", number = session['number'])

@app.route("/destroy")
def destroy():
    del session['number']
    return redirect("/")

@app.route("/restart")
def restart():
    return redirect('/destroy')

if __name__ == "__main__":
    app.run()