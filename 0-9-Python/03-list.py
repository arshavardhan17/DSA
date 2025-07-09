fruits =["apple","banana","cherry","gauva",True,12,5]

fruits.append("orange") ## Add an item to the end
fruits.insert(1,"watermelon") ## Add an item at a specified index
fruits.remove("apple") ## Remove the first occurance of an item
fruits.pop(1) ## Remove the item at the specified index
fruits.pop() ## Remove and return the last element
fruits.index("banana") ## Return the index of the first occurance of an item
fruits.count("apple") ## Return the number of times an item appears in the list
fruits.sort() ## Sort the list in ascending order
fruits.reverse() ## Reverse the order of the list
fruits.clear() ## Remove all items from the list

## SLICING LIST

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(numbers[2:5])
print(numbers[:5])
print(numbers[5:])
print(numbers[::2])  ## step size
print(numbers[::-1])

# output
# [3, 4, 5]
# [1, 2, 3, 4, 5]
# [6, 7, 8, 9, 10]
# [1, 3, 5, 7, 9]
# [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 
############################ REVISE AGAIN #######################

## List comprehension--->[ operation loop ]

[x**2 for x in range(10)]

### List Comprehension with Condition--->[operation loop condition]

even_numbers=[num for num in range(10) if num%2==0]