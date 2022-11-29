from OOP_Klassen.item import item

class papier(item):

    def __init__(self):
        self.name = "papier"
        self.compare = {"schere":-1,"stein":1,"papier":0,"echse":-1,"spock":1}

    def getItemName(self):
        return super().getItemName()

    def getItemCompare(self, comparedItem):
        return super().getItemCompare(comparedItem)