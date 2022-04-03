from flask import Flask,jsonify, request;
app=Flask(__name__)
app.config['JSON_SORT_KEYS'] = False


@app.route("/")
def hello():
    return "Welcome to API"
    
@app.route("/bfhl",methods=['POST'])
def bfhl():
    jdata=request.get_json()
    numbers=[]
    alphabets=[]
    if ('data' in jdata):
        data=jdata['data']
        status=True
    else:
        data=[]
        status=False


    for x in data:
        if x.isnumeric():
            numbers.append(x)
        else:
            alphabets.append(x)

    return jsonify({
    "is_Success":status,
    "user_id":"john_doe_17091999",
    "email":"john@xyz.com",
    "roll_number":"ABCD123",
    "numbers":numbers,
    "alphabets":alphabets
    })

if __name__=="__main__":
    app.run(debug=True)