import math
n = int(input())
listx = []
for i in range(n):
    x = int(input())
    listx.append(math.factorial(x))
for i in range(n):
    print(listx[i])