n = int(input())
listx = []
for i in range(n):
    x,y =input().split()
    listx.append(int(x)+int(y))
for i in range(n):
    print(listx[i])