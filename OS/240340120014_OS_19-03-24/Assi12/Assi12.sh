#!/bin/bash

# Function to display menu and get user choice
display_menu() {
    echo "1. Add Record"
    echo "2. Save Changes and Exit"
    read -p "Enter your choice: " choice
}

# Function to add record to batch file
add_record() {
    read -p "Enter Roll No: " roll_no
    read -p "Enter Name: " name
    read -p "Enter Marks in Hindi: " hindi_marks
    read -p "Enter Marks in Maths: " maths_marks
    read -p "Enter Marks in Physics: " physics_marks

    echo "$roll_no:$name:$hindi_marks:$maths_marks:$physics_marks" >> "$batch_code.txt"
    echo "Record added successfully!"
}

# Main script starts here
read -p "Enter batch code to search: " batch_code

master_file="master.txt"
batch_record=$(grep "^${batch_code}:" "$master_file")

if [ -z "$batch_record" ]; then
    echo "Batch Code Not Found"
    exit 1
fi

batch_code=$(echo "$batch_record" | cut -d: -f1)
faculty_name=$(echo "$batch_record" | cut -d: -f2)
num_students=$(echo "$batch_record" | cut -d: -f3)

# Increment the number of students for the batch
((num_students++))
sed -i "s/^${batch_code}:${faculty_name}:${num_students}$/&/" "$master_file"

# Create a new file for the batch if it doesn't exist
if [ ! -e "$batch_code.txt" ]; then
    touch "$batch_code.txt"
fi

while :
do
    display_menu
    case $choice in
        1)
            add_record ;;
        2)
            echo "Changes saved!"
            exit ;;
        *)
            echo "Invalid choice. Please select again." ;;
    esac
done
