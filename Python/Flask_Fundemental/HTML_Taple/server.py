from flask import Flask, render_template
users = [
    {'first_name' : 'Michael', 'last_name' : 'Choi'},
    {'first_name' : 'John', 'last_name' : 'Supsupin'},
    {'first_name' : 'Mark', 'last_name' : 'Guillen'},
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]
app = Flask(__name__)

@app.route("/")
def return_page():
    return render_template("page.html", list = users, length = len(users))

if(__name__ == "__main__"):
    app.run(debug=True)


