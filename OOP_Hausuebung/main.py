from OOP_Klassen import firma,abteilungsLeiter,mitarbeiter,geschlecht,rang

def createComp(name):
    return firma.Firma(name)

def createWorker(rang,name,abt,gender,f):
    e = None 
    match rang:
        case rang.rang.mitarbeiter:
            e = mitarbeiter.mitarbeiter(name,abt,gender)
        case rang.rang.abteilungsLeiter:
            e = abteilungsLeiter.abteilungsLeiter(name,abt,gender)
    f.addPerson(e)
    return e

def runCompany():
    f = createComp("YA YEET GmbH UND COKG")
    m1 = createWorker(rang.rang.mitarbeiter,"JUSTUS","BWL",geschlecht.geschlecht.maennlich,f)
    setattr(m1,"name","VALLAHBILLA")
    print(getattr(m1,"abt"))
    print(m1)
    

    


if __name__ == "__main__": 
    runCompany()
    