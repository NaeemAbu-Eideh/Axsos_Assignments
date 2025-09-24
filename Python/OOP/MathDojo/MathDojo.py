class MathDojo:
    def __init__(self, result = 0):
        self.result = result
    
    def add(self, number, *numbers):
        self.result += number
        i = 0
        while(i < len(numbers)):
            self.result += numbers[i]
            i+=1
        return self
    
    def subtract(self, number, *numbers):
        self.result -= number
        i = 0
        while(i < len(numbers)):
            self.result-= numbers[i]
            i+=1
        return self

x = MathDojo(10)
print(x.add(1,3,3).add(1,3).add(3,4,5,6).result)
print(x.subtract(1,3,3).subtract(1,3).subtract(3,5,6).result)


