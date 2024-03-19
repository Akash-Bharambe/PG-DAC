#!/bin/bash

# 2 Accept the first name, middle name, and last name of a person in variables fname, mname and lname respectively. Greet the person (take his full name) using appropriate message.

read -p "Enter First Name: " fname
read -p "Enter middle Name: " mname
read -p "Enter Last Name: " lname

echo "Hello $fname $mname $lname"
