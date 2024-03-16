#!/bin/bash

# 6 Write a shell script that greets the user with an appropriate message depending on the system time.

time=$(time +%T)

if [ $time -ge 00 ] && [ 
