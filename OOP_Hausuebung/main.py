from OOP_Klassen import firma,abteilungsLeiter,mitarbeiter,geschlecht,rang

def createComp(name):
    return firma.Firma(name)

def createWorker(rang,name,abt,gender,f):
    e = None 
    match rang:
        case rang.Rang.mitarbeiter:
            e = mitarbeiter.mitarbeiter(name,abt,gender)
        case rang.Rang.abteilungsLeiter:
            e = abteilungsLeiter.abteilungsLeiter(name,abt,gender)
    f.addPerson(e)
    return e

def runCompany():
    f = createComp("YA YEET GmbH UND COKG")
    m1 = createWorker(rang.Rang.mitarbeiter,"JUSTUS","BWL",geschlecht.geschlecht.undefined,f)
    

if __name__ == "__main__": 
    runCompany()
    