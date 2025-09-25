from animal import Animal

class Bear(Animal):
    def __init__(self, name = "", age = "", health = 0, happiness = 0, color = ""):
        super().__init__(name, age, health, happiness)
        self.color = color
    def feed(self):
        super().feed()
        if(self.health_level > 100):
            print("thanks you")
        if(self.happiness_level > 130):
            print("I'm happey")
        return self
    def display_info(self):
        info = super().display_info()
        info += f", Color: {self.color}"
        print(info)