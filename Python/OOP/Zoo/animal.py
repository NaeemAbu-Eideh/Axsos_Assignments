
class Animal:
    def __init__(self, name = "", age = "", health = 0, happiness = 0):
        self.name = name
        self.age = age
        self.health_level = health
        self.happiness_level = happiness
    
    def display_info(self):
        return (f"animal name: {self.name}, age: {self.age}, health level: {self.health_level}, happiness level: {self.happiness_level}")
    def feed(self):
        self.happiness_level += 10
        self.health_level += 10
        return self