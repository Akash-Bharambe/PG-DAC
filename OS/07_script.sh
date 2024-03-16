#!/bin/bash

read -p "Enter Number: " a

if [ $a == 10 ] || [ $a == 2]
then
	echo "if part"
elif [ $a == 5 ]
then
	echo "elif part"
else
	echo "else part"
fi
