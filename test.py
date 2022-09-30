try:
    import pymongo
    print("Module Import Successful")
except ImportError as error:
    print("Module Import Error")
    print(error)


from pymongo import MongoClient
# Create Connection
client = MongoClient('localhost', 27017)
# Select the Database
database = client.TYITDB1
# Get Details of the specified Collection
collection = database['TYITCOL']
# Print each Document
for studentinfo in collection.find():
    print(studentinfo)


from pymongo import MongoClient
# Create Connection
client = MongoClient('localhost', 27017)
database = client.TYITDB1
collection = database['TYITCOL']
# Insert a Document
collection.insert_one({

    "Name": "Rahul",
    "Age": 20,

})
print("Data Inserted Successfully")
for studentinfo in collection.find():
    print(studentinfo)