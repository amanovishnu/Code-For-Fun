largest = 0
smallest = 0
listx = []
while True:
    num = input("Enter a number:")
    try:
        if num == "done":
            break
        listx.append(int(num))
        # print(listx)
    except:
        print("Invalid Syntax")
        continue
print('Maximum',max(listx))
print('Minimum',min(listx))