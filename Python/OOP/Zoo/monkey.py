from animal import Animal

class Monkey(Animal):
    def __init__(self, name = "", age = "", health = 0, happiness = 0, eyes_color = ""):
        super().__init__(name, age, health, happiness)
        self.eyes_color = eyes_color
    def feed(self):
        super().feed()
        if(self.health_level > 30):
            print("thanks you")
        if(self.happiness_level > 50):
            print("I'm happey")
    def display_info(self):
        info = super().display_info()
        info += f", Eyes color: {self.eyes_color}"
        print(info)