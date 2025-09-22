import random

def random_number(min = 0, max = 100):
    return random.randint(min, max)

print(random_number())
print(random_number(max=20))
print(random_number(min=40))
print(random_number(min=10, max = 20))
