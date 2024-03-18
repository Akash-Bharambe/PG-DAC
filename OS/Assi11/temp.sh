#!/bin/bash

# Function to calculate grade
calculate_grade() {
    if [ "$1" -ge 90 ]; then
        echo "A"
    elif [ "$1" -ge 80 ]; then
        echo "B"
    elif [ "$1" -ge 70 ]; then
        echo "C"
    elif [ "$1" -ge 60 ]; then
        echo "D"
    else
        echo "F"
    fi
}

read -p "Enter Roll Number: " rollno

# Check if roll number exists or marks are out of range
if grep -q "^$rollno " students.txt; then
    echo "Roll number exists." >> log1.txt
    grep "$rollno" students.txt >> log1.txt
elif [[ ! "$rollno" =~ ^[0-9]+$ ]]; then
    echo "Invalid Roll Number." >> log1.txt
elif [ "$marks_hindi" -lt 1 ] || [ "$marks_hindi" -gt 99 ] || [ "$marks_maths" -lt 1 ] || [ "$marks_maths" -gt 99 ] || [ "$marks_physics" -lt 1 ] || [ "$marks_physics" -gt 99 ]; then
    echo "Marks out of range." >> log1.txt
else
    read -p "Enter Name: " name
    read -p "Enter Marks in Hindi: " marks_hindi
    read -p "Enter Marks in Maths: " marks_maths
    read -p "Enter Marks in Physics: " marks_physics

    # Calculate total, percentage, and grade
    total=$((marks_hindi + marks_maths + marks_physics))
    percentage=$((total / 3))
    grade=$(calculate_grade $percentage)

    # Display results
    echo "Total Marks: $total"
    echo "Percentage: $percentage%"
    echo "Grade: $grade"
fi
