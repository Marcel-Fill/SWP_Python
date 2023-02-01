import json

class Spieler:
    
    def __init__(self, name):
        with open("SchereStein\saves.txt", "r") as e:
            events = json.load(e)
    
        if name in events[0]:
            self.ID = events[0].index(name)+1
        else:
            self.ID = len(events[0])+1
            events[0].append(name)
            events.append({"sieg": 0, "unentschieden": 0, "verloren": 0, "schere": 0, "stein": 0, "papier": 0, "spock": 0, "echse": 0})
            with open("SchereStein\saves.txt", "w") as e:
                e.write(json.dumps(events))
        
    def getID(self):
        return self.ID