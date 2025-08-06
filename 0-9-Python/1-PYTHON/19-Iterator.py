my_list=[1,2,3,4,5,6]

iterator=iter(my_list)
print(iterator)
print(next(iterator))


# String iterator
my_string = "Hello"
string_iterator = iter(my_string)

print(next(string_iterator))  # Output: H
print(next(string_iterator))  # Output: e