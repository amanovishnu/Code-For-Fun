# for loop is one of two conditional loops in python the other one being while loop
'''
    the for loop in python is different when compared to other for loop in programming languages
    it is more of a iterator in object oriented programming
    it can also execute a list tuple
'''
fruits = ['Apple','Banana','Mango','pineapple']

# print (x)
# Similar to While loop we can also use continue and break statements here alsofor y in fruits:
for y in fruits:
    if(y=='Banana'):
        continue
    print(y)
for i in range(10):
    print(i)
for i in range(1,10+1,2):
    print (i)


'''
    Python also supports Recursion which means a defined function can call itself
'''
# Recursion in Python
def recfunc(k):
    if(k>0):
        result = k + recfunc(k-1)
        print(result)
    else:
        result = 0
    return result
recfunc(10)
# End of For Loop notes
'''
    Author:geekymano
    Date: 17062018
'''