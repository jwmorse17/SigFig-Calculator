# File: Calc.py
# using python 3

from collections import Counter
numbers = Counter()
operators = Counter()

def main():


	userInput(numbers, operators)



def userInput(numbers, operators):
	i = 0
	cont = True
	while cont:
		i += 1
		print(i)
		if i == 1:
			print("The first number: \n")
			usrNum = input()
			print("The first operator: \n")
			usrOp = input()
		else:
			print("The next number: \n")
			usrNum = input()
			print("the next operator (blank if none)")
			usrOp = input()

		numbers({i:usrNum})
		operators({i:usrOp})

		print("more numbers? y/n")
		more = input();
		if(input.equals(n)):
			cont = False
		else: 
			cont = True






main()