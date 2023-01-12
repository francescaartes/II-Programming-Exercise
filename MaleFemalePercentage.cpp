/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates the Percentage of Male and Female students in a class

	C++
*/

#include <iostream>
using namespace std;

int main()
{
    int male, female, classTotal;
    double malePercentage, femalePercentage, percentage = 100.0;

    cout << "Enter the number of male registered in your class: ";
    cin >> male;

    cout << "Enter the number of female registered in your class: ";
    cin >> female;

    classTotal = male + female;
    malePercentage = male * percentage / classTotal;
    femalePercentage = female * percentage / classTotal;
    
    cout << "There are " << classTotal << " students in your class. " << malePercentage << "% are male and " << femalePercentage << "% are female.";

    return 0;
}