#!/bin/bash

# 10 Write a script that takes a command line argument and reports on its file type (regular file, directory file, etc.). For more than one argument generate error message.

for FILE in "$@"; do
if [ -e "$FILE" ]; then
    echo "File Exists"
    if [ -f "$FILE" ]; then
        echo "$FILE is Ordinary File"
    elif [ -b "$FILE"]; then
        echo "$FILE is Block File"
    elif [ -d "$FILE"]; then
        echo "$FILE is Directory"
    fi
else
    echo "$FILE file do not Exist"
fi
done