#!/bin/bash

# 11. Add some student records in the “student” file manually. The fields to be considered are “RollNo”, “Name”, “Marks_Hindi”, “Marks_Maths”, “Marks_Physics”. Write a script which does the following
# a. If the roll number already exists, then store the record and the following message “roll number exists” in a log file “log1”.
# b. If the marks in the subjects is not in the range of 1 – 99 then store such a record followed by a message “marks out of range” in “log1”
# c. If the data is valid, the calculate total, percentage, grade and display on the terminal

read -p "Enter Roll Number: " rollno

if grep -q "^$rollno" students.txt ; then
    echo "Roll no exists." 1> log.txt
    grep "^$rollno" students.txt 1>> log.txt
elif [ "$Marks_Hindi" -lt 1 ] || [ "$Marks_Hindi" -gt 99 ] ||  [ "$Marks_Maths" -lt 1 ] || [ "$Marks_Maths" -gt 99 ] || [ "$Marks_Physics" -lt 1 ] || [ "$Marks_Physics" -gt 99 ]; then
    echo "marks out of range" >> log.txt
else
    read -p "Enter Name: " name
    read -p "Enter marks in Hindi: " Marks_Hindi
    read -p "Enter marks in Maths: " Marks_Maths
    read -p "Enter marks in Physics: " Marks_Physics

    total=$((Marks_Hindi + Marks_Maths + Marks_Physics))
    percentage=$((total/3))

    echo "Total: $total"
    echo "Percentage: $percentage"
fi

