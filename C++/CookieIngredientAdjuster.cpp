/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates the amount of ingredients you need to make cookies. 

    C++
*/

#include <iostream>
#include <string>
using namespace std;

int main ()
{
    string name;
    int cookies;
    double sugar, butter, flour;

    cout << "What is your name? ";
    getline(cin, name);

    cout << "How may cookies do you want to make? ";
    cin >> cookies;

    sugar = 1.5 * cookies;
    butter = 1 * cookies;
    flour = 2.75 * cookies;

    cout << name << ", you need the following ingredients to make " << cookies << " cookie/s:" << endl;
    cout << sugar << " cups of sugar" << endl;
    cout << butter << " cups of butter" << endl;
    cout << flour << " cups of flour" << endl;

    return 0;
}