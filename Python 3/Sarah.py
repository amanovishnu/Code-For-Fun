def computepay(hours , rph):
    if hours <= 40:
        return hours * rph
    elif hours > 40:
        return 40*rph+(hours-40)*(rph*1.5)
hours = float(input("Enter Hours: "))
rph = float(input("Enter Rate: "))
pay = computepay(hours,rph)
print(pay)
