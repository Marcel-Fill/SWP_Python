from OOP_Klassen.rang import rang
from OOP_Klassen.geschlecht import geschlecht

class Firma():


    def __init__(self,name):
        self.name = name 
        self.personen = []
        self.personenProRang = {rang.mitarbeiter:0,rang.abteilungsLeiter:0}
        self.abteilungen = []
        self.mitArbeiterProAbt = {}

    def getName(self):
        return self.name

    def addPersonTodep(self, p):
        self.personen.append(p)
        self.personenProRang[p.getRang()] += 1
        if (p.getAbt() in self.mitArbeiterProAbt):
            self.mitArbeiterProAbt[p.getAbt()] += 1
        else:
            self.mitArbeiterProAbt[p.getAbt()] = 1
            self.abteilungen.append(p.getAbt())
    
    def getPersonen(self):
        return self.personenProRang

    def getAbtZahl(self):
        return len(self.abteilungen)

    def getBestAbt(self):
        count = 0
        abt = ""
        for i in range(len(self.mitArbeiterProAbt)):
            if count < self.mitArbeiterProAbt[self.abteilungen[i]]:
                count = self.mitArbeiterProAbt[self.abteilungen[i]]
                abt = self.abteilungen[i]
        return abt

    def getAnteil(self):
        male = 0
        female = 0 
        undefined = 0 
        for i in self.personen:
            g = i.getGender()
            match g:
                case geschlecht.maennlich:
                    male +=1
                case geschlecht.frau:
                    female += 1 
                case geschlecht.undefined:
                    undefined += 1 
        return "Anteil Männer" + str(round(male/(male+female+undefined * 100,2)))#Beim rest das selbe 

