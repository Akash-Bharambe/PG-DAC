#!/bin/bash

# 9 Modify the program 7 to accept the RollNo and display the record and ask for delete confirmation. Once confirmed delete the record and update the data file.

file="Students.txt"
read -p "Enter Roll No: " rollno
data=$(grep -n "^${rollno}:" "$file")

echo "$data"
read -p "Are you sure You want to delete this record (y/n): " choice

if [ "$choice" == "n" ]; then
    echo "Deletion Cancelled"
    exit 1
elif [ "$choice" == "y" ]; then
    sed -i "/^${rollno}:/d" "$file"
    echo "data Modified"
fi