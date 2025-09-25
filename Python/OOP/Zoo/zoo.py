from lion import Lion
from monkey import Monkey
from bear import Bear

class Zoo:
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
    def add_lion(self, name = "", age = "", health = 0, happiness = 0, typeof = ""):
        self.animals.append( Lion(name, age, health, happiness, typeof) )
    def add_monkey(self, name = "", age = "", health = 0, happiness = 0, eye_color = ""):
        self.animals.append( Monkey(name, age, health, happiness, eye_color) )
    def add_bear(self, name = "", age = "", health = 0, happiness = 0, color = ""):
        self.animals.append( Bear(name, age, health, happiness, color) )
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)
        for animal in self.animals:
            animal.display_info()