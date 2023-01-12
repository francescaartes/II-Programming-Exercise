# Artes, Francesca Q.
# BSCpE 1-1
# This program calculates the amount of ingredients you need to make cookies.
# PYTHON

name = input('What is your name? ')
cookies = int(input('How many cookies do you want to make? '))

sugar = cookies * 1.5
butter = cookies * 1.0
flour = cookies * 2.75

print(name, ", you need the following ingredients to make ", cookies, " cookie/s:")
print(sugar, " cups of sugar")
print(butter, " cups of butter")
print(flour, " cups of flour")