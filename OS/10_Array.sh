#!/bin/bash

myarray=(a 2 hello "Hello All") # Declare Array

echo "${myarray[0]}" # Print 1st element of Array
echo "${myarray[*]}" # Print all args of Array

echo "Length: ${#myarray[*]}" # Length of Array

echo "${myarray[*]:1}" # Print array after position 1
echo "${myarray[*]:1:2}" # Print array after position 1 after that 2 elements

myarray+=(5 4 array) # Add elements to existing array
echo "${myarray[*]}"
