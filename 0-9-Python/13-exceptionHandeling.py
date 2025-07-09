## try,except,else and finally
try:
    num = int(input("Enter a number: "))
    result = 10 / num
except ValueError:
    print("That's not a valid number!")
except ZeroDivisionError:
    print("You can't divide by zero!")
except Exception as ex:
    print(ex)
else:
    print(f"The result is {result}")
finally:
    print("Execution complete.")



### File handling and Exception HAndling

try:
    file=open('example1.txt','r')
    content=file.read()
   ## a=b
    print(content)

except FileNotFoundError:
    print("The file does not exists")
except Exception as ex:
    print(ex)

finally:
    if 'file' in locals() or not file.closed():
        file.close()
        print('file close')