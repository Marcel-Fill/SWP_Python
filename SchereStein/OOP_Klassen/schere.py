from OOP_Klassen.item import item

class schere(item):

    def __init__(self):
        self.name = "schere"
        self.compare = {"schere":0,"stein":-1,"papier":1,"echse":1,"spock":-1}

    def getItemName(self):
        return super().getItemName()

    def getItemCompare(self, comparedItem):
        return super().getItemCompare(comparedItem)