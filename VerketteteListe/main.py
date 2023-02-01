import random
import liste

if __name__ == "__main__":
    list = liste.List()
    for i in range(10):
        list.add(random.randint(0,100))
    print("normal List")
    print(list)
    list.remove(list[2])
    print("remove test list")
    print(list)
