#!/bin/bash

# 3 Display the name of files in the current directory along with the names of files with maximum & minimum size. The file size is considered in bytes.

echo "Method 1:"
current=$(ls -l | awk '{print $5, $9}' | sort -n | awk 'NR==2{print $0} END{print $0}')
echo "$current"
echo



echo "Method 2:"
min=$(ls -l | awk '{print $5, $9}' | sort -n | awk 'NR==2{print $0}')
max=$(ls -l | awk '{print $5, $9}' | sort -rn | awk 'NR==1{print $0}')
echo "$min"
echo "$max"
echo


echo "Method 3:"
ls -l | awk '{print $5, $9}' | sort -n | awk 'NR==2{print $0}'
ls -l | awk '{print $5, $9}' | sort -rn | awk 'NR==1{print $0}'