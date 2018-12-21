# Python is a General Purpose High Level Programming Language
# python was Created by Guido Van Rossum in the Early 90's when he was Working in National Research Institute Netherlands
# the First offical Release of python was made on 13th feb 1991
# python comments begin with pound or hash symbol
print ("Guido Van Rosumm is the Father of Python ?")
print("Hello World")
# in other programming languages indentation is for Readablity only where as in python it is used to identify a block of code
# python uses indentation to identify a block of code
if 5>2 :
    print("true")
else:
    print("False")
''' This is a Python Docstring or Multi line Comment in Python'''
""" Python Multiline Comment can also use Double Quotes as Comment Symbols """
# Pound or Hash # symbol is used as Single line Comment in Python
# in Python Comments are also called docstrings
# in python variables are declared using the variable name there is no need to specify the data type for the variable
# python is a forgiving language interms of data types
x = 5
print(x)
# in python statements dont end with semicolons where as in other programming langugaes statements end with semicolons
x = 10  
print(x)
name = "geekymano"
print(name)
name = "this repo belongs to geekymano"
print(name)
''' Rules for variable names
    the variable name can contain letters, alphabets and it can also use special characters like underscore
    the variable names can begin with letters only it cannot begin with number or underscore
    in python variable names are case sensitive similar to other programming languages
    Example age and AGE are Different variables in python
'''
name = "geekymano"
print (name)
# python uses + symbol or concatenation operator to join a string and string or a variable and a string
print(name+" is a Geek")
print(name + " is a Machine Learning Enthusiast")
# in Python we can use concatenation operator to also join a string and a string
print("geekymano"+" "+"owns this Repository")
print("Python "+"is "+"a "+"General "+"Purpose "+"Programming "+"Language")
print("Pyton"+" "+"was"+" "+"Created"+" "+"by"+" "+"Guido Van Rossum")
# + operator when used with a string and varaiable or string and string joins them into one single string whereas when used with two numbers add them
x= 15554654
print(x)
print(x+456798798)
x = 5
# print(x+"Mano")
# if you try to combine a string and a number or a number and a string it will result in a error
''' in python there are three Numeric types
    int
    float
    complex
'''
int = 5
print(int)
float = 1.05
print(float)
complex = 1j
print(complex)
# to verify the data type of the variable use the type() function which results out the data type of the given parameter
print(type(int))
print(type(float))
print(type(complex))
# int or integer is a whole number +ve or -ve without decimal point it can be of unlimited or infinite length
myintvariable = 1
print(myintvariable)
myintvariable = -465456467987987
print(myintvariable)
print(type(myintvariable))
# float is number with +ve or -ve values with decimal point it can be also of unlimited length similar to int
myfloat = -1.0456465456
print(myfloat)
myfloat = 0.4545698898
print(myfloat)
print(type(myfloat))
# floats can be defined with scientific letters like e to denote the power of 10
mynum = 2e3
print(mynum)
# mynum-ve = 2e-3
# print(mynum-ve)
# python variable names cannot use special characters except underscore so the above line is not valid
mynum2 = 2e-3
print(mynum2)
a = -7E3
print(a)
# Complex Numbers are those numbers with a Real Part and a Imaginary part but in python this numbers are represented with J  for the imaginary part like 5j or 0+5j
complexvariable = 5j
print(complexvariable)
variable = 0+5j
print(variable)
variable = 0-5j
print(variable)
""" Python is a Procedural Language
    Python is a Object Oreinted Programming Language
    Python is a Modular language
    Python is also a Scripting Language
    Altast Python is a General Purpose high level Programming Language
"""
# Casting in Python Contains Three Functions (atleast for now)
# int() to  convert int to int float to int string to int => if the string contains a whole number
# float() to convert float to int float to float string to float providing the string contains a float or int
# str() to convert int to str float to str and str to str
# Mano = int(input("Whats Your name Lady? "))
# print(Mano)
variable = 45
print(float(variable))
# End of File Hellowworld.py
# Auhor: Manovishnu
# Date: 16062018
