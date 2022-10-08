from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.TYITDB1
collection = db.TYITCOL
def retrieve():
    try:
        for studentinfo in collection.find():
            print(studentinfo)
    except Exception as e:
        print(str(e))
retrieve()