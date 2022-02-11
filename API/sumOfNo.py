from flask import Flask,jsonify;
app=Flask(__name__)

@app.route("/")
def hello():
    return "hello"

@app.route("/sum/<int:a>,<int:b>")
def sum(a,b):
    res={"num1":a,"num2":b,"Result":a+b}
    return res

if __name__=="__main__":
    app.run(debug=True)