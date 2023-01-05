public class Ans1
{
	from abc import ABC, abstractmethod

	class Customer(ABC):
    def __init__(self, name: str, address: str):
	self.__name = name
	self.__address = address

    @abstractmethod
    def calculateBill(self) -> float:
	pass

    @property
    def name(self) -> str:
	return self.__name

    @property
    def address(self) -> str:
	return self.__address
	
}
