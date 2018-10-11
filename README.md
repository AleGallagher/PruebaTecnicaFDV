# Prueba Tecnica FDV

## Exercise
A company rents bikes under following options:
1. Rental by hour, charging $5 per hour
2. Rental by day, charging $20 a day
3. Rental by week, changing $60 a week
4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price
##### Assigment:
1. Implement a set of classes to model this domain and logic
2. Add automated tests to ensure a coverage over 85%
3. Use GitHub to store and version your code
4. Apply all the recommended practices you would use in a real project
5. Add a README.md file to the root of your repository to explain: your design, the development practices you applied and how run the tests.
Note: we don't expect any kind of application, just a set of classes with its automated tests.

## Design
The project consists in an abstract class called Rental, with four classes that extend this class. There are a extension for each type of rent:
- DayRental
- FamilyRental
- HourRentalWeekRental
- HourRental

These classes override the method calculateRent form the abstract class.
The development was done applying SOLID principles and Patterns Design.

## Run
To run the test use this command in the terminal:
- mvn test