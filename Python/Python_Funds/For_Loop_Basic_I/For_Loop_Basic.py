# Basic
for i in range (0, 150):
    print(f"number is: {i}")

# Multible of Five
for i in range (5, 1000):
    print(f"{i}*5 = {i*5}")

# print from 1 to 100, division by 5: Codding , if division by 10: Coding Dojo
for i in range (1, 100):
    if i % 10 == 0 :
        print("Coding Dojo")
    elif i % 5 == 0:
        print("Codding")
    else:
        print(f"i = {i}")

# summ of all odd integers from 0 to 500000
sum = 0
for i in range(0, 500000):
    if i % 2 == 1:
        sum += i
print(f"sum of all odd numbers from 0 to 500000 is: {sum}")

# Countdown by fourth
number = 2018
while (number >= 0):
    print(number)
    number -= 4

# Flexible Count
lowNum = input("enter the lower number: ")
hightNum = input("enter the hight number: ")
mult = input("enter the mult number: ")

for i in range(int(lowNum), int(hightNum)+1):
    if(i % 3 == 0):
        print(i)