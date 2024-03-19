#!/bin/bash

# 14 Assignemnts on “sed” command
# EmpData(Sample Database)
# 1122|j.b. saxena |g.m. |account |12/12/52|6000
# 2233|n.k. gupta |d.g.m |sales |31/12/40|9000
# 4545|anil agarwal |director |account |06/07/47|7500
# 5656|lalit choudhury |executive|marketing|07/09/50|5000
# 1265|chanchal singhvi|g.m. |admin |12/09/63|6000
# 0110|shyam saksena |chairman |marketing|12/12/43|8000
# 5566|jai sharma |director |account |23/12/89|7000
# 7733|jayant |d.g.m |sales |29/02/70|6000
# a From the above database substitute the delimiter of first 3 lines with “ : “
# b From the above database substitute the delimiter with “ : ”
# c Insert the string “ TechM Employees” in the first line.
# d Store the lines pertaining to the directors, d.g.m and g.m into three separate files.

grep -v -E 'director|d.\.g\.m|g\.m\.' Emp.txt > non_directors.txt
grep -v -E 'director|d.\.g\.m|g\.m\.' Emp.txt > non_directors.txt
# e Using address store first 4 lines into a file Empupdate.
# f Find the pattern “account” in the database and replaces that with “accounts”.
# g Select those lines which do not have a pattern “g.m”.
# h Insert a blank line after every line in the database.

