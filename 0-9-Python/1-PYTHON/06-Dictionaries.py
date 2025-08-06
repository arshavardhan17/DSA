## key value pairs

student={"name":"Krish","age":32,"grade":24}

## accessing Dictionary Elements
print(student)
print(student["name"])
    ## (or) ##
print(student.get("grade"))


## Modifying Dicitonary Elements

## Dictionary are mutable,so you can add, update or delete elements
student["age"]=33  ##update value for the key
print(student)
student["address"]="India" ## added a new key and value
print(student)
del student['grade'] ## delete key and value pair


## Dictionary methods

keys=student.keys() ##get all the keys
print(keys)

values=student.values() ##get all values
print(values)

items=student.items() ##get all key value pairs
print(items)


## Iterate over key value pairs
for key,value in student.items():
    print(f"{key}:{value}")


## Dictionary Comphrehension
squares={x:x**2 for x in range(5)}

evens={x:x**2 for x in range(10) if x%2==0}
