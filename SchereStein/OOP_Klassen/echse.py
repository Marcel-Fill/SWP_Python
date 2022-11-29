from OOP_Klassen.item import item

class echse(item):

    def __init__(self):
        self.naem = "echse"
        self.compare = {"schere":-1,"stein":-1,"papier":1,"echse":0,"spock":1}

    def getItemName(self):
        return self.name

    def getItemCompare(self, comparedItem):
        return self.compare[comparedItem]