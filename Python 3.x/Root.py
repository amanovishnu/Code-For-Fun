# Guido Van Rosuum is the Father of Python
variable = int(45.154)
print(variable)
variable2 = int(45)
print(variable2)
variable3= int("5")
print(variable3)
''' End of testing with int() fuction '''
info = float(45)
print(info)
inf = float(45e-5)
print(inf)
infos = float("458989E-25")
print(infos)
'''End of testing with float() function '''
stat = str(5)
print(stat)
print(type(stat))
sta = str(500.5454)
print(sta)
print(type(sta))
stus = str('geekymano')
print(type(stus))
print(stus)
# like many other programming languages strings in python are just a array of bytes
# unfortunately python doesnot have character data types so a single characer is astring with a length of 1 
# in python square brackets can be used to access the elements of a string
var = "geekymano"
print(var)
print(var[5])
# Similar to Other Programming Languages in python indexing starts with zero not one
print(var[0])
# to get characters from a to b in a string use the [a:b] method
print(var[5:9])
# python when printing a substring doesnot print the last letter so better to add one more extra digit
# strip method is used to remove white spaces in a string only in the begining or the end
var = "   geeky mano"
print(len(var))
print(var.strip())
# here len() is a Function where as strip is a method 
'''
    important note : strip() method only removes whitespace from begining or end but not in between
'''
var ="     geekymano"
print(len(var))
print(len(var.strip()))
# lower() method is used to convert a string lo lowercase
var = "GEEKYMANO"
print(var)
print(var.lower())
# upper() method is used to convert a lowercase string to uppercase
var = "heman was shit"
print(var)
print(var.upper())
var = "geekymano".upper()
print(var)
var = "GEEKYMANO".lower()
print(var)
# replace() method replaces a particular character or string with another
var = "GEEKYMANO"
print(var.replace("geeky","lovely"))
var ="geeymano"
# split() method spilts a string into two substrings if it finds the seperator
var  = "geeky,mano"
print(var.split(","))
# inorder to take input from a user through command line use the input method
# print(var2.strip())
varx = "    geekymano is a great geek"
print(len(varx.strip()))
code = "   Wingardium Levoisaaa  harrypotter is shit"
print(code)
print(code.strip())
print(len(code))
print(len(code.strip()))
robo = input("Who is Thaliva ?")
print(robo)
print(len(robo))
print(len(robo.strip()))
# input() function is Amazings
salute = input("Who is the Father of Linux? ")
print(salute + " Salute to him")
# Author : geekymano
# date : 16062018
# String notes Completed
