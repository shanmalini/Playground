class Normal_room:
  def calculates(self, no_rooms, days):
    if(days == 1):
      return 300*no_rooms*days
    elif(days > 1 and days <= 5):
      return 250*no_rooms*days
    elif(days > 5):
      return 200*no_rooms*days
class Ac_room:
  def Ac_calculates(self, no_rooms, days):
    if(days == 1):
      return 450*no_rooms*days
    elif(days > 1 and days <= 5):
      return 300*no_rooms*days
    elif(days > 5):
      return 250*no_rooms*days
class Suite_room:
  def Suite_calculates(self, no_rooms, days):
    if(days == 1):
      return 550*no_rooms*days
    elif(days > 1 and days <= 5):
      return 500*no_rooms*days
    elif(days > 5):
      return 450*no_rooms*days
class Hotel(Normal_room, Ac_room, Suite_room):
  def display(self, name, address, mobile, rent):
    print("Name:", name)
    print("Address:", address)
    print("Mobile:", mobile)
    print("Room Rent =", rent)
#main
h = Hotel()
name = input()
address = input()
mobile = input()
rooms = int(input())
days = int(input())
choice = int(input())
if(choice == 1):
  rent = h.calculates(rooms, days)
elif(choice == 2):
  rent = h.Ac_calculates(rooms, days)
elif(choice == 3):
  rent = h.Suite_calculates(rooms, days)
h.display(name, address, mobile, rent)