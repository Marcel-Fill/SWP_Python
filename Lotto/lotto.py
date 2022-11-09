import random

lottoList = []
lottoDict = {}

def createList():
    x = range(1,46)
    for i in x: 
        lottoList.append(i)
    
def createDicton():
    x = range(1,46)
    for i in x:
        lottoDict[i] = 0
    
def lotterien(): 
    rdmNumber = []
    newLottoList = lottoList[:]
    x = range(5)
    for i in x:
        rdm = random.choice(newLottoList)
        newLottoList.remove(rdm)
        rdmNumber.append(rdm)
    return rdmNumber


def rounds(c):
    for i in range(c):
        for x in lotterien():
            lottoDict[x] += 1
    print(lottoDict)
    

createList()
createDicton() 
countRounds= input("How many rouns shoud the number be rolled \n")
rounds(int(countRounds))
    
    
