# Python has two types of loops namely for loop and while loop
# While Loop
'''
    While Loops Executes until the given Condition satisfies to be true
    when it fails to satisfy the condition the execution stops
    remeber to add increment at the end of loop 
    else the execution will be infinite
'''
a = 200
b = 300
while( b > a):
    print(a)
    a=a+1
'''
    in while loop the break statement to used to stop execution at a particluar condition
    in while loop the continue statement is used to skip the execution
'''
a=5
b=10
while(b>a):
    print(a)
    if(a==7):
        break
    a=a+1
# continue Statement
a = 10
while (a<20):
    a+=1
    if(a==15):
        continue
    print(a)    
''' While Loop notes Completed ''''

      
