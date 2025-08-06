
## Tuples are immutable, meaning their elements cannot be changed once assigned.

numbers=tuple(1,1,1,2,3,4,5,6)
numbers[1]="Krish"

## Converting Tuple to list , list to Tuple
tuple([1,2,3,4,5,6])
list((1,2,3,4,5,6))

##Methods 
numbers.count(1)
numbers.index(3)

## Packing and Unpacking tuple (IMP) 

## packing
packed_tuple=1,"Hello",3.14   ## this is also a tuple
print(packed_tuple)

##unpacking a tuple
##Destructuring 
a,b,c=packed_tuple

print(a)
print(b)
print(c)

## Unpacking with *
numbers=(1,2,3,4,5,6)
first,*middle,last=numbers
print(first)
print(middle)
print(last)


## iterating over nested tuples

nested_tuple = ((1, 2, 3), ("a", "b", "c"), (True, False))
for sub_tuple in nested_tuple:
    for item in sub_tuple:
        print(item,end=" ")
    print()