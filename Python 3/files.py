fname = input("Enter a  File name: ")
fh = open(fname)
print(fh.read().upper())