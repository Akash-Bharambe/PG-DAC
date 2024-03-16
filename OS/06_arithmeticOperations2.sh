#!/bin/bash

a=5
b=10

#((c=$a+$b))
c=`expr $a + $b`

echo "sum: $c"
