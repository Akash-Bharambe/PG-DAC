#!/bin/bash

myfun(){
    echo "Hello World"
}
myfun

#args

add(){
    num1=$1
    num2=$2
    let sum=$num1+$num2
    echo "sum: $sum"
}

add 10 20

