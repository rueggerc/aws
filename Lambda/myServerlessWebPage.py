import json

def lambda_handler(event, context):
    print("Inside Lamba Handler")
    resp = {
    	"statusCode": 200,
    	"headers": {
    	  "Access-Control-Allow-Origin": "*",
    	},
    	"body": "Hey Ruge Hello From Lambda!"
    }
    return resp
