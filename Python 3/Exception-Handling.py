try:
    num = int(input("Enter a Number:"))
    if(num>=0):
        print(num)
    else:
        print("Sorry Number is Less than Zero")
except ValueError:
    print("Please Enter a Numneric Value")
except TypeError:
    print("False Type")
finally :
    print("Your Execution is Complete")
