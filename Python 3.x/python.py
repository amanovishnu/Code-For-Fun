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