import random
import liste

if __name__ == "__main__":
    list = liste.List()
    for i in range(10):
        list.append(random.randint(0,100))
    print("normal List")
    print(list)
    list.remove(list[2])
    print("remove test list")
    print(list)
    print("Vallah Kriese")
    list.removePos(0)
    print(list)
    print("test")
    list.shuffleList()
    print(list)
    print("data")
    list.getData()
    print(list)
    print("split")
    list2 = list.split(2)
    print(list2)
    print("fghjkl")
    list3 = list.getItems(2,5)
    print(list3)
    print("sort")
    list.bubble_sort()
    print(list)
    print(len(list))
    
    