#!/bin/bash

# 7. A data file has some student records including rollno, names and subject marks. The fields are separated by a “:”. Write a shell script that accepts roll number from the user, searches it in the file and if the roll number is present - allows the user to modify name and marks in 3 subjects. If the roll number is not present, display a message “Roll No Not Found”. Allow the user to modify one record at a time.

file="Students.txt"
read -p "Enter Roll No: " rollno
line=$(grep -n "^${rollno}:" "$file" | cut -d: -f1)

if [ -z "$line" ]; then
    echo "Roll No. Not Found"
    exit 1
else
    read -p "Enter New name: " name
    read -p "Enter marks in Subject 1: " marks1
    read -p "Enter marks in Subject 2: " marks2
    read -p "Enter marks in Subject 3: " marks3
    sed -i "${line}s/:.*$/:${name}:${marks1}:${marks2}:${marks3}/g" "$file"
    echo "data Modified"
fi