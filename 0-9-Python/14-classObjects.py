# ### Instance Variable and Methods
class Dog:
    ## constructor
    def __init__(self,name,age):
        self.name=name
        self.age=age

## create objects
dog1=Dog("Buddy",3)
print(dog1)
print(dog1.name)
print(dog1.age)
    

## Define a class with instance methods

class animal:
    def __init__(self,name,breed,sound):
        self.name=name
        self.breed=breed
        self.sound=sound
    def bark(self):
        print(f"{self.name} makes  {self.sound}")

cat=animal("Tom","Persian","meow")
dog=animal("Jerry","Bulldog","woof")
print (cat.name)
print (cat.breed)
cat.bark()
print (dog.name)
print (dog.breed)
dog.bark()


