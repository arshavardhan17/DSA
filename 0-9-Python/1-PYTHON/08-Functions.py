
def add (num1,num2):
  return num1+num2

a=int(input("a"))
b=int(input("b"))
result=add(a,b)
print(result)

### Return multiple parameters
def multiply(a,b):
    return a*b,a

multiply(2,3)


## Default Parameters
def greet(name="Guest"):
    print(f"Hello {name} Welcome To the paradise")

greet()
greet("arsha")


## Positional arguments *
## used if there are many arguments
def print_numbers(*args):
    for number in args:
        print(number)
print_numbers(1,2,3,4,5,6,7,8,"Krish")


### Keywords Arguments **
## used if ther are many key value pair arguments

def print_details(**kwargs):
    for key,value in kwargs.items():
        print(f"{key}:{value}")

