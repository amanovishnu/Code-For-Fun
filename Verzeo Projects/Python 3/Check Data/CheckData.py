name = input("Enter Your Username: ")
age = int(input("Enter Your Age: "))
print(type(age))
if type(age) == int:
    print("Name :" ,name)
    print("Age :", age)
else:
    print("Enter a valid Username or Age")