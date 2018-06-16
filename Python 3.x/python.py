# Guido van Rossum is the Father of Python
# Python operators and Operands
'''
    Arithmetic Operators +,-,*,/,//,**(exponential),%(modulus)
    Comparison Operators ==,>=,<=,<>,>,<,!=
    Logical Operators and, or, not
    Assignment Operators =,+=,-=,*=,/=,//=,**=,%=,&=,|=,^=,>>=,<<=
    Bitwise Operators => &, |, ^, ~, <<, >>,
    Membership Operators in, notin (returns a boolean value) => true or false
    Identity Operators is ,is not (returns a Boolean Value) => true or false
'''
# python Collections
'''
    lists => collection which is ordered, changeable and allows duplicate numbers
    tuples => collection which is ordered, not changeable and allows duplicate nunmbers
    set => collection which is unordered and unchangeable and doesnot allow duplicate numbers
    dictionary =>  collection which is unordered changeable indexed but doesnot allow duplicate numbers
'''
# lists are declared inside square brackets 
oneday = ['sunday','tuesday','wednesday']
print(oneday[0:len(oneday)-1])
oneday.append("wednesday")
print(oneday)
oneday.remove('wednesday')
print(oneday)
twoday = [10,25,15,45,0,78]
# in python lists are enclosed with square brackets
oneday[0]="Zues"
print(oneday)
"""
    lists are ordered
    changeable
    allows Duplicate Items
"""
# lists can also be defined by using an inbuilt constructor like list()
newlist = list(("Zues","Posideon","Aries"))
print(newlist)
'''
    append() method to add new items to list at last
    remove() method to remove an item from the list
    len() function to findout the length of the list
    clear() method to remove all the list items from the list
    copy() method returns the copy of list
    count() method returns the number of elements with specific name
    reverse() method reverses the list
    pop() method removes the element at specific position
    insert() method adds the element at specific position
    index() method returns the index of first element with specified value
    extend() method adds one list to another list


'''
list = ["one","two","Three"]
print(list)
list.append('Four')
print(list)
# print(list.append('Aloha')
# list.clear()
list.remove('one')
print(list)
var = list.copy()
var.append('this is list two')
print(var)
print(var.count("two"))
alaska = ['me','you','pg']
print(alaska.reverse())
# print(alaska)
sore = ['on','by','meow','jack']
print(sore.sort())

