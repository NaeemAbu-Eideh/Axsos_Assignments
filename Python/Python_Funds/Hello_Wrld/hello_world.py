# print Hello World!
print("Hello World!")

# print Hello {my name} using ,
myName = "Naeem Abueideh"
print("Hello", myName)

# print Hello {my name} using +
myName = "Naeem Abueideh"
print("Hello "+ myName)

# print Hello {my favorit number} using ,
myFavNum = 3
print("Hello", myFavNum)

# print Hello {my favorit number} using +
myFavNum = 3
print("Hello "+ str(myFavNum))

# Ninja Bonus: to solve the error without change + to comma , we should change MyFavNum type 
# from number to string , so we must use function str() to change the type of variable , 
# the we can use + without any problems

# print two of my favorite food
burger = "Burger"
shawerma = "Shawerma"
print(f"I'ev eat {burger} and {shawerma}")

# Ninja bonus
print(burger.upper())
print(burger.lower())
print(len(burger))

