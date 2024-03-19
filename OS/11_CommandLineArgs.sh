#!/bin/bash

echo "Number of args: $#"
echo "Script Name: $0"
echo "1st Argument: $1"
echo "2nd Argument: $2"
echo "Argument Passed: $@" # $@ and $* works same
echo "Argument Passed: $*"

#bash 11_CommandLineArgs.sh  hello world hiiiii