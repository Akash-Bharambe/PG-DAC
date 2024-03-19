#!/bin/bash

# 4 Write a script which when executed checks out whether it is a working day or not? (Note: Working day Mon-Fri)

date=$(date +%u)

if [ $date == 6 ] || [ $date == 1 ]
      then
      echo "Weekend"
else
  echo "Working Day"
fi  
