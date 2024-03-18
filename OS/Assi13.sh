#!/bin/bash
str1="Akash"
str2="Bharambe"
# 13 Create a library of shell functions to do the followings:
# Function to concatenate 2 strings. Pass 2 strings as parameters to function.
concatenate(){
    echo "$1 $2"
}
concatenate $str1 $str2

# Function to find out the length of a given string, Pass string as a parameter to function.
length(){
    # par1=$1
    # len=${#par1}
    # echo "$len"
    echo "${#1}"
}
length $str2
# Function to compare the two strings. Pass 2 strings as parameters to function.
compare(){
    str1=$1
    str2=$2
    if [ $str1 == $str2 ]; then
        echo "String are same"
    else
        echo "Strings are not same"
    fi
}
compare $str1 $str2

# Function to print given string in reverse order. Pass string as a parameter to function.
reverse(){
    rev <<< $1
}
reverse $str1

# Function to check if string is palindrome or not. Pass string as a parameter to function.
palindrome(){
    str1=$1
    str2=${str1,,}
    reve=$(reverse $str1)
    reve1=${reve,,}
    if [ $str2 == $reve1 ]; then
        echo "Palindrome"
    else
        echo "Not Plaindrome"
    fi
}
palindrome Nitin
