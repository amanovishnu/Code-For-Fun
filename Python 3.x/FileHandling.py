# Python was Created by Guido Van Rosumm in Earlier 1990 and the First offical Release of Python was made on 13th Feb 1992
'''
    file handing in python mostly depends on open() function
    open function mainly takes two parameters filename and open format
    open format are "r=>read", "w=>write", "a=>append", "x=>create",
    additional to this it also contains to more formats "t=>textmode", "b=>binarymode(for images)"
'''
f=open('Demo.txt')
print(f.read(100))
