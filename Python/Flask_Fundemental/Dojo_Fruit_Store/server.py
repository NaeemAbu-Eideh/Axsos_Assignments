from flask import Flask, render_template, request, redirect
app = Flask(__name__)  

@app.route('/')         
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])         
def checkout():
    context = {
        'apple': request.form['apple'],
        'strawberry': request.form['strawberry'],
        'raspberry': request.form['raspberry'],
        "fname": request.form['first_name'],
        "lname": request.form['last_name'],
        "id": request.form['student_id']
    }
    print(f"charging {request.form['first_name']} {request.form['last_name']} for: {(int(context['apple']) + int(context['strawberry']) + int(context['raspberry']))} fruits")
    return render_template("checkout.html", context = context, summation = (int(context['apple']) + int(context['strawberry']) + int(context['raspberry'])))

@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")


if __name__=="__main__":   
    app.run(debug=True) 