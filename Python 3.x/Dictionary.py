# python is a General Purpose High level Programming Language
# Dictionaries
''' Dictionaries are unordered changeable (muteable) indexed collections
    in Python Dictionaries are Declared with {} and key value pairs 
'''
thisDict = {
    'Name':'Shinji Ikari',
    'Father':'Gendo Ikari',
    'Mother':'Yui Ikari',
    'Guardian':'Misato Kasturagi'
}
print(thisDict)
thisDict['Father']='Ikari Gendo'
print(thisDict)
'''
    the dictionary collections can also be declared using the dict() constructor
    adding items into dictionary is done through index like var['key']='value'
'''
thisDict2 = dict(Name="Ikari Shinji",father="Ikari Gendo",Mother="Ikari Yui")
print(thisDict2)
thisDict2['Guardian']='Misato Kasturagi'
print(thisDict2)
'''
    unlike other collections like tuple list set in dictionary elements are deleted through del() function
'''
del(thisDict2['Guardian'])
print(thisDict2)

# End of Collections
# Author: geekymano
# date: 16062018

