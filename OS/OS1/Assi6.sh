#!/bin/bash

# 6 Write a shell script that greets the user with an appropriate message depending on the system time.

time=$(date +%H)

if [ $time -ge 00 ] && [ $time -lt 12 ]; then
	echo "Good morning"
elif [ $time -ge 12 ] && [ $time -lt 16 ]; then
	echo "Good Afternoon"
elif [ $time -ge 16 ] && [ $time -lt 20 ]; then
	echo "Good Evening"
else
	echo "Good Night"
fi
