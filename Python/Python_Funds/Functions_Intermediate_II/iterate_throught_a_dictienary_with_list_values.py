def printInfo(dojo):
    for i in dojo:
        print(f"{len(dojo[i])} {i}")
        for j in range(len(dojo[i])):
            print(dojo[i][j])

dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

printInfo(dojo)

