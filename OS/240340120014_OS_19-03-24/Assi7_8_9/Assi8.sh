#!/bin/bash

# 8 Modify program 7 to accept the RollNo from the command line.

file="Students.txt"
rollno=$1
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