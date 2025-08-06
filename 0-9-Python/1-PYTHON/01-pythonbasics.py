num1 = float(input("enter num 1"))
num2 = float(input("enter num 2"))
operator=input("enter the operator")

if operator == "+":
    result= num1+num2
elif operator =="-":
    result=num1-num2  
elif operator =="/":
    if num2 !=0:
        result=num1/num2
    else:
        print ("you cannot divite with 0")
else:
    print(f"the operatot {operator}is invalid")

print("result",result)
 
