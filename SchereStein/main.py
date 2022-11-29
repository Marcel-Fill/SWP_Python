import random
from OOP_Klassen import stein, schere, papier, spock, echse

def initItem(nr, msg):
    match nr:
        case 1:
            return stein.stein()
        case 2:
            return schere.schere()
        case 3:
            return papier.papier()
        case 4:
            return spock.spock()
        case 5:
            return echse.echse()
        case other:
            return initItem(int(input("Options:\nstein = 1, schere = 2, papier = 3, spock = 4, echse = 5\n\nChoose your Item for the win now: ")), "You better use one of the right numbers!")

def checkMatch(nr):
    match nr:
        case -1:
            return "No chicken dinner for you!"
        case 0:
            return "No one will get a chicken dinner now! GREAT!!!!"
        case 1:
            return "WINNER WINNER CHICKEN DINNER!"
        case other:
            return "A unexcpected error occured! Try again"

if __name__ == "__main__":
    computer = initItem(random.randint(1,5), "")
    player = initItem(int(input("Options:\nstein = 1, schere = 2, papier = 3, spock = 4, echse = 5\n\nChoose your Item: ")),"")
    print("Player chose "+player.getItemName() + " vs " + computer.getItemName()+" Compiter chose")
    print(checkMatch(player.getItemCompare(computer.getItemName())))