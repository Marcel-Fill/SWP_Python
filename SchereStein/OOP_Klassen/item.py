class item:

    def __init__(self):
        self.name = "item"
        self.compare = {None: None}

    def getItemName(self):
        return self.name

    def getItemCompare(self, comparedItem):
        return self.compare[comparedItem]