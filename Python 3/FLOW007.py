def revString(s):
    return s[::-1]
n = int(input())
listx = []
for i in range(n):
    listx.append(revString(input()))
for i in range(n):
    print(listx[i])