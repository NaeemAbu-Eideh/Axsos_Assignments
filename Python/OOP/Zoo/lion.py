from animal import Animal

class Lion(Animal):
    def __init__(self, name = "", age = "", health = 0, happiness = 0, typeof = ""):
        super().__init__(name, age, health, happiness)
        self.typeof = typeof
    def feed(self):
        super().feed()
        if(self.health_level > 60):
            print("thanks you")
        if(self.happiness_level > 100):
            print("I'm happey")
        return self
    def display_info(self):
        info = super().display_info()
        info += f", Type: {self.typeof}"
        print(info)