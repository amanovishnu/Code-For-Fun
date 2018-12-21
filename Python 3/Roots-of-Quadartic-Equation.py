import math
a = int(input())
b = int(input())
c = int(input())
x1 = (-b+(math.sqrt(b*b-4*a*c)))/(2*a)
x2 = (-b-(math.sqrt(b*b-4*a*c)))/(2*a)
# x1 = math.sqrt(b*b-4*a*c)
# x2 = math.sqrt(b*b-4*a*c)
print(x1)
print(x2)

