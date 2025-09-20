#1: 
list = [-1, 3, 5 ,-4]
for i in range(0, len(list)):
    if(list[i] > 0):
        list[i] = "big"
print(list)

#2
list = [-1, 3, 5 ,-4] 
count = 0
for i in range(0, len(list)):
    if(list[i] > 0):
        count+=1
list[len(list)-1] = count
print(list)

#3
list = [1, 3, 5 ,4] 
sum = 0
for i in range(0, len(list)):
    sum+=list[i]
print(sum)

#4
list = [1, 3, 5 ,4]
sum = 0
for i in range(0, len(list)):
    sum+=list[i]
print(sum / len(list))

#5
list = [-1, 3, 5 ,-4] 
count = 0
for i in range(0, len(list)):
    count+=1
print(count)

#7
list = [-1, 3, 5 ,-4] 
max = list[0]
for i in range(1, len(list)):
    if(max < list[i]):
        max = list[i]
print(max)

#6
list = [-1, 3, 5 ,-4] 
min = list[0]
for i in range(1, len(list)):
    if(min > list[i]):
        min = list[i]
print(min)


#8
def ultimat_analysis(list):
    dec = {
        "sumTotal": 0,
        "avarage": 0.0,
        "minimum": 0,
        "maximum": 0
    }
    sum = 0
    for i in range(0, len(list)):
        sum+=list[i]
    dec['sumTotal'] = sum
    dec['avarage'] = sum/len(list)

    max = list[0]
    min = list[0]
    for i in range(1, len(list)):
        if(max < list[i]):
            max = list[i]
        if(min > list[i]):
            min = list[i]
    dec["maximum"] = max
    dec["minimum"] = min

    return dec
print(ultimat_analysis([-1, 3, 5 ,-4]))

#9
list = [-1, 3, 5 ,-4]
list2 = []
i = len(list)-1
while(i >= 0):
    list2.append(list[i])
    i-=1
print(list2)