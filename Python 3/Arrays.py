# Arrays are used to store multiple values in one single variable
# Python Doesnot have  inbuilt support for arrays
# Hene we can use lists for arrays in python
cars = ['Shinji Ikari','Gendo Ikari','Yui Ikari',"Misato Kasturagi"]
print(cars[0])
cars.append('Rei Ayanami')
print(cars)
print(len(cars))
for i in cars:
    print(i)
'''
    we can use append() method to add an element at the last
    we can use pop() method to remove an element from specific index
    we can use remove() method to remove mentioned element
'''
cars.append('Ritsuko Ikagi')
cars.remove('Misato Kasturagi')
cars.pop(1)
print(cars)
# End of Evangelion Arrays Completed
