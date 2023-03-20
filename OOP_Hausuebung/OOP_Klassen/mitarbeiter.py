from OOP_Klassen.rang import Rang
from OOP_Klassen.person import Person

class mitarbeiter(Person):
    def __init__(self, name, abt, gender,):
        super().__init__(name, abt, gender)
        self.rang = Rang.mitarbeiter
    
    def getName(self):
        return super().getName()
    
    def getAbt(self):
        return super().getAbt()

    def getGender(self):
        return super().getGender()

    def getRang(self):
        return self.rang
