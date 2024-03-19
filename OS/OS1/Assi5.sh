#!/bin/bash

# 5 Write a script that accepts a member into MBT health club, if the weight of the person is withing the range of 30-250 Kgs.

read -p "Enter Your Weight in Kg: " weight

if [ $weight -ge 30 ] && [ $weight -le 250 ]
then
	echo "Welcome to MBT health Club"
else
	echo "Sorry you are not welcome"
fi
