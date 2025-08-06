
from abc import ABC,abstractmethod

## Abstract base cclass
class Vehicle(ABC):
    def drive(self):
        print("The vehicle is used for driving")

    @abstractmethod 
    def start_engine(self):
        pass

class Car(Vehicle):
    def start_engine(self):
        print("Car enginer started")

def operate_vehicle(vehicle):
    vehicle.start_engine()
    vehicle.drive()

car=Car()
operate_vehicle(car)



from abc import ABC,abstractmethod

## Define an abstract class
class Vehicle(ABC):
    @abstractmethod
    def start_engine(self):
        pass

## Derived class 1
class Car(Vehicle):
    def start_engine(self):
        return "Car enginer started"
    
## Derived class 2
class Motorcycle(Vehicle):
    def start_engine(self):
        return "Motorcycle enginer started"
    
# Function that demonstrates polymorphism
def start_vehicle(vehicle):
    print(vehicle.start_engine())

## create objects of cAr and Motorcycle

car = Car()
motorcycle = Motorcycle()

start_vehicle(car)