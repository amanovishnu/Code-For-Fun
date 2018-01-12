a=1
s=0
print('Enter a Number ?')
print('Enter 0 to Quit')
while a!=0:
    print('Current Sum:',s)
    a=float(input('Number?' ))
    a=float(a)
    s+=a
print('Total Sum:',s)
