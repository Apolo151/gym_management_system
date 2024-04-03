# Gym Management System
A gym management system that provides fitness businesses the functionality to manage schedules, memberships, and facilities.

# Scenarios

**First: the program greets the user and asks the user to choose what type of user he or she is (Admin, Customer, Coach)**
- Then the user chooses to log in or register

## Customer
**Login: Lisa Wilson, pass999**
3. Display his membership plan details
```bash
Membership Plan Details:
Name: Lisa Wilson
Number of plan: 0
Day: 2	month: 2	Year: 2021 
```
4. Display his in-body information at a specific date:
- input: 08/02/2021
```bash
In-Body Information at 08/02/2021:
Name		Gender		Age		Height		Weight		Time of Measurement
---------------------------------------------------------------------------
Lisa Wilson		female		28		150.0		55.0		08/02/2021	12:00

The daily calories you need : 1186.5
------------------------------------
To gain half a kilogram per week, you must eat "1686.5" calories per day
To gain a kilogram per week, you must eat "2186.5" calories per day
------------------------------------------------------------------------
To lose half a kilogram per week, you must eat "686.5" calories per day
To lose a kilogram per week, you must eat "186.5" calories per day
------------------------------------------------------------------------
Your protein needs : 104.5
Your healthy fat needs : 39.55
Your carb needs : 312.8625
```
5. Display how many kilos need to be reduced according to his body.
```bash
How Many Kilos Need to be Reduced:
You must lose "11" kilogram to reach the ideal weight
```
----
**Register:** 
- input:
  - To get the admin's approval: admin, admin
  - customers data: cu, 4, male, address1, 07775000, meme@meme.com, 2, cupass
  - login with the created customer: cu, cupass
1. Get his coach's info
```bash
1. Coach Info:
Name: Coach Davis
ID:2
Gender: male
Address: 333 Oak St
Phone_number: 558765
E_mail: coach3@example.com
Working Hours: 9
```
2. Display all Gym Equipments
```bash
List of Gym Equipment:
Type: Treadmill
Quantity: 5
Code: 1
-------
Type: Dumbbells
Quantity: 10
Code: 3
-------
Type: Leg_Press
Quantity: 2
Code: 2
-------
```
## Coach
**Register:**
**Login: Coach Johnson, pass333**
1. Show the list of the coach customers
```bash
List of All Customers:
-------
Name: Jane Doe
ID:1
Gender: female
Adress: 789 Pine St
Phone_number: 558765
E_mail: jane@example.com
-------
-------
Name: Lisa Wilson
ID:3
Gender: female
Adress: 222 Cedar St
Phone_number: 556543
E_mail: lisa@example.com
-------
Name: Johnson Doe
ID:4
Gender: male
Adress: 222 Pine St
Phone_number: 553643
E_mail: johnson@example.com
-------
Name: Mark Doe
ID:5
Gender: male
Adress: 333 Cedar St
Phone_number: 556913
E_mail: markD@example.com 
```
2. Get the inbody history of any of his customers.
- input: Lisa Wilson
```bash
InBody History of Lisa Wilson:
Name		Gender		Age		Height		Weight		Time of Measurement
---------------------------------------------------------------------------
Lisa Wilson		female		28		150.0		55.0		08/02/2021	12:00

The daily calories you need : 1186.5
------------------------------------
To gain half a kilogram per week, you must eat "1686.5" calories per day
To gain a kilogram per week, you must eat "2186.5" calories per day
------------------------------------------------------------------------
To lose half a kilogram per week, you must eat "686.5" calories per day
To lose a kilogram per week, you must eat "186.5" calories per day
------------------------------------------------------------------------
Your protein needs : 104.5
Your healthy fat needs : 39.55
Your carb needs : 312.8625
Name		Gender		Age		Height		Weight		Time of Measurement
---------------------------------------------------------------------------
Lisa Wilson		female		28		150.0		57.0		08/03/2021	12:00

The daily calories you need : 1206.5
------------------------------------
To gain half a kilogram per week, you must eat "1706.5" calories per day
To gain a kilogram per week, you must eat "2206.5" calories per day
------------------------------------------------------------------------
To lose half a kilogram per week, you must eat "706.5" calories per day
To lose a kilogram per week, you must eat "206.5" calories per day
------------------------------------------------------------------------
Your protein needs : 108.3
Your healthy fat needs : 40.21666666666667
Your carb needs : 318.6458333333333
Name		Gender		Age		Height		Weight		Time of Measurement
---------------------------------------------------------------------------
Lisa Wilson		female		28		150.0		59.0		08/04/2021	12:00

The daily calories you need : 1226.5
------------------------------------
To gain half a kilogram per week, you must eat "1726.5" calories per day
To gain a kilogram per week, you must eat "2226.5" calories per day
------------------------------------------------------------------------
To lose half a kilogram per week, you must eat "726.5" calories per day
To lose a kilogram per week, you must eat "226.5" calories per day
------------------------------------------------------------------------
Your protein needs : 112.1
Your healthy fat needs : 40.88333333333333
Your carb needs : 324.4291666666666
```
3. Get all the details of a customer by his name.
- input: Mark Doe
```bash
Details of Customer Mark Doe:
Name: Mark Doe
ID:5
Gender: male
Adress: 333 Cedar St
Phone_number: 556913
E_mail: markD@example.com
------------
```
4. Show a list of all his female/male customers.
- input: male
```bash
List of male Customers:
		customer 1
Name: Johnson Doe
ID:4
Gender: male
Adress: 222 Pine St
Phone_number: 553643
E_mail: johnson@example.com
		customer 2
Name: Mark Doe
ID:5
Gender: male
Adress: 333 Cedar St
Phone_number: 556913
E_mail: markD@example.com 
```
- input: female
```bash
List of female Customers:
		customer 1
Name: Jane Doe
ID:1
Gender: female
Adress: 789 Pine St
Phone_number: 558765
E_mail: jane@example.com
		customer 2
Name: Lisa Wilson
ID:3
Gender: female
Adress: 222 Cedar St
Phone_number: 556543
E_mail: lisa@example.com 
```
## Admin

1. (add/edit/delete)
    1. Add: Enter the data of your entity
    2. Edit: Enter the ID of the entity you want to edit, then enter the attribute you want to edit
    3. Delete: Enter the ID of the entity you want to delete
2. Show the subscription history for a customer
- Input: Lisa Wilson
```bash
Name: Lisa Wilson
Number of plan: 0
Day: 2	month: 2	Year: 2021 
 ```
3. Display all the customers that subscribed to the gym in a given month/day.
- Input1: m, 6
```bash
Name: Johnson Doe
ID:4
Gender: male
Adress: 222 Pine St
Phone_number: 553643
E_mail: johnson@example.com 
```
- Input2: d, 5
```bash
Name: cu
ID:4
Gender: male
Adress: add
Phone_number: 7775000
E_mail: meme@meme.com 
```
4. Display all the customers of a specific coach
- Input: 0
```bash
Name: Mark Johnson
ID:2
Gender: male
Adress: 111 Maple St
Phone_number: 559876
E_mail: mark@example.com 
```
5. Display Gym Income in a given month:
- input1: 3, 5, 2020
```bash
The income in month 5 of the year 2020 Was: 50.0
```
6. Display Sorted Coaches
```bash
Name: Coach Johnson
ID:1
Gender: male
Address: 654 Birch St
Phone_number: 557890
E_mail: coach2@example.com
Working Hours: 10
No. of customers: 4
--------
Name: Coach Smith
ID:0
Gender: male
Address: 321 Elm St
Phone_number: 554321
E_mail: coach@example.com
Working Hours: 10
No. of customers: 1
--------
Name: Coach Davis
ID:2
Gender: male
Address: 333 Oak St
Phone_number: 558765
E_mail: coach3@example.com
Working Hours: 9
No. of customers: 1
--------
Name: Coach Brown
ID:3
Gender: male
Address: 444 Pine St
Phone_number: 554321
E_mail: coach4@example.com
Working Hours: 7
No. of customers: 0
-------- 
```
