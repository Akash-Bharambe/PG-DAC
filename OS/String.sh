#!/bin/bash

myvar="Hello"

length=${#myvar}

upper=${myvar^^}
lower=${myvar,,}


echo "$length"
echo "$myvar"
echo "$upper"
echo "$lower"