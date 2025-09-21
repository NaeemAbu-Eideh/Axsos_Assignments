def get_list(number):
    list = []
    for i in range(0, number+1):
        list.append(number-i)
    return list

number = input("inter a number that count dowwn it into array: ")
print(get_list(int(number)))  