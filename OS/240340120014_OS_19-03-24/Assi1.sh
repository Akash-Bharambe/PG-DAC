#!/bin/bash

for ((i=1;i<=4;i++))
do
	for((j=1;j<=i;j++))
	do
		echo -n "*"
	done
	echo " "
done
