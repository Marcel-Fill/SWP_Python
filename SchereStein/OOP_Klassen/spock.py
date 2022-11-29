from OOP_Klassen.item import item

class spock(item):

    def __init__(self):
        self.name = "spock"
        self.compare = {"schere":1,"stein":1,"papier":-1,"echse":-1,"spock":0}

    def getItemName(self):
        return super().getItemName()

    def getItemCompare(self, comparedItem):
        return super().getItemCompare(comparedItem)