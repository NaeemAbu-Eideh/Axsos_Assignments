def greater_than_second(list):
    list2 = []
    for i in range(0, len(list)):
        if list[i] > list[1]:
            list2.append(list[i])
    return list2

list = [1,4,5,2,5,7,8,6]
print(f"the new list is {greater_than_second(list)}")