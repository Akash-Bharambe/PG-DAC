#!/bin/bash

# 1 Write a shell script which will generate the O/P as follows
# *
# **
# ***
# ****

for ((i=1;i<=4;i++))
do
	for((j=1;j<=i;j++))
	do
		echo -n "*"
	done
	echo " "
done
