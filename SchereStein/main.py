import json
import random
from OOP_Klassen import stein, schere, papier, spock, echse, spieler

def initDict():
    return {"sieg": 0, "unentschieden": 0, "verloren": 0, "schere": 0, "stein": 0, "papier": 0, "spock": 0, "echse": 0}

def initPlayer(name):
    return spieler.Spieler(name)

def initItem(nr, msg,p=None):
    match nr:
        case 1:
            if p != None:
                id = p.getID()
                logEvent(id, "stein")
            return stein.stein()
        case 2:
            if p != None:
                id = p.getID()
                logEvent(id, "schere")
            return schere.schere()
        case 3:
            if p != None:
                id = p.getID()
                logEvent(id, "papier")
            return papier.papier()
        case 4:
            if p != None:
                id = p.getID()
                logEvent(id, "spock")
            return spock.spock()
        case 5:
            if p != None:
                id = p.getID()
                logEvent(id, "echse")
            return echse.echse()
        case other:
            return initItem(int(input("Options:\nstein = 1, schere = 2, papier = 3, spock = 4, echse = 5\n\nChoose your Item for the win now: ")), "You better use one of the right numbers!")

def checkMatch(nr, p):
    match nr:
        case -1:
            logEvent(p.getID(), "verloren")
            return "No chicken dinner for you!"
        case 0:
            logEvent(p.getID(), "unentschieden")
            return "No one will get a chicken dinner now! GREAT!!!!"
        case 1:
            logEvent(p.getID(), "sieg")
            return "WINNER WINNER CHICKEN DINNER!"
        case other:
            return "A unexcpected error occured! Try again"

def getEvents():
    with open("SchereStein\saves.txt", "r") as e:
        return json.load(e)

def logEvent(user_id, event):   
    events = getEvents()
    events[user_id][event] += 1   
    with open("SchereStein\saves.txt", "w") as e:
        e.write(json.dumps(events))
    return "Werte wurd geupdated " + event + " zu " + str(events[user_id][event])

def difficulty(p, diff):
    match diff:
        case 1:
            return random.randint(1,5)
        case 2:
            e = getEvents()
            chosen = max(e[p.getID()].values())+1
            counters = chosen.getStats().values().sort()
            return counters[random.randint(0,1)]

def main():
    p = initPlayer(input("Input Username:"))
    diff = input("input difficulty: 1 or 2")
    comp = initItem(diff, "")
    player = initItem(int(input("Options:\nstein = 1, schere = 2, papier = 3, spock = 4, echse = 5\n\nChoose your Item: ")),"")
    print("Player chose "+player.getItemName() + " vs " + comp.getItemName()+" Computer chose")
    print(checkMatch(player.getItemCompare(comp.getItemName())))
    main()

def runWeb():
    pass

if __name__ == "__main__":
    main()