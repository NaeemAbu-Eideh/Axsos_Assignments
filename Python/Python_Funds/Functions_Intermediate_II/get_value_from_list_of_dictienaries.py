def iterateDictionary(key, students):
    for i in range(len(students)):
        for j in students[i]:
            if(j == key):
                print(students[i][j])

students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

iterateDictionary("first_name", students)
print("===============")
iterateDictionary("last_name", students)