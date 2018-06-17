''' 
    A Function is a block of Code Which is executed when it is only called
'''
def myfunction():
    print('Geekymano is a Geek')
myfunction()
myfunction()
myfunction()
myfunction()
def function(k):

    print(k+" is a beautiful land")
function('India')
function('Russia')
function('Canada')
def coldwar(a,b):
    print(a+" and "+b+" "+"Take Active Part in Cold War")
coldwar('america',"russia")
# To let a function return a value use the return statement
def ret(k):
    return k+5
koa = ret(5)
print(koa)
# We can also use the Default parameter in some cases
def zeno(country="Maskoo"):
    print(country+" is the Guardian of Shinji Ikari")
zeno()
zeno('Misato Kasturagi')
# In Python the Keywordl lambda is used to denote the anonymus functions
# myfunc = lambda a: a*5
# print(myfunc(10))
alaska = lambda i,j: i*j
print(alaska(4,5))

def myfunc(n):
    return lambda i: i*n
doubler = myfunc(2)
tripler = myfunc(3)
val = 11
print("Doubled: "+str(doubler(val))+". Tripled: "+ str(tripler(val)))
# End of Python Functions and Lambda
'''
    Author: geekymano
    Date:17062018
'''