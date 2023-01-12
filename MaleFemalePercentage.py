# Artes, Francesca Q.
# BSCpE 1-1
# This program calculates the Percentage of Male and Female students in a class
# PYTHON

male = int(input('Enter the number of male registered in your class: '))
female = int(input('Enter the number of female registered in your class: '))

classTotal = male + female

malePercentage = round((male / classTotal) * 100, 2)
femalePercentage = round((female / classTotal) * 100, 2)

print('There are ', classTotal, ' students in your class.', malePercentage, '% are male and ', femalePercentage, '% are female.')