def length_value(length, value):
    list = []
    for i in range(0, length):
        list.append(value)
    return list

length = input("input the length: ")
value = input("input the value: ")
print(f"the list is {length_value(int(length), int(value))}")