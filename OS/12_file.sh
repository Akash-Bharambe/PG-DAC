#!/bin/bash

read -p "Enter File Name: " filename

while read line
do
    echo "$line"
done < $filename

c=$(cat $filename | wc -c) # wc -c counts number of characters in the file
w=$(cat $filename | wc -w) # wc -w counts number of words in the file

echo "No of Words: $w"
echo "No of Characters: $c"