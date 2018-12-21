'''
Problem Statement: Read inputs from the user name and age and store them in file and read stored data from file and display
'''
# Solution
f = open('data.txt','w')
f.write(input("Enter Your Username: ")+'\n')
f.write(input("Enter Your Age: "))
f.close()
r = open('data.txt','r')
print('\n')
print('Name of the User: '+r.readline())
print('Age of the User: ' +r.readline())

