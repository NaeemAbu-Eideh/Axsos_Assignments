def print_return(list):
    print(f"the first number is {list[0]}")
    return list[1]

list = []
number1 = input("input the first number: ")
number2 = input("input the second number: ")
list.append(int(number1))
list.append(int(number2))
number = print_return(list)
print(f"the second number is {number}")