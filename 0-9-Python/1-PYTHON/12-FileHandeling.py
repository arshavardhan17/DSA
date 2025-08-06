### Read a Whole File
with open('example.txt','r')as file:
    content=file.read
    print(content)


## Read a file line by line
with open('example.txt','r') as file:
    for line in file:
        print(line.strip()) ## sstrip() removes the newline character    


## Writing a file(Overwriting)
with open('example.txt','w') as file:
    file.write('Hello World!\n')
    file.write('this is a new line.')


## Write a file(wwithout Overwriting)
with open('example.txt','a') as file:
    file.write("Append operation taking place!\n")


# Copying a text file
with open('example.txt', 'r') as source_file:
    content = source_file.read()

with open('destination.txt', 'w') as destination_file:
    destination_file.write(content)