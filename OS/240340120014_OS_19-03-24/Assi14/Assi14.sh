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
sed -i '1, 3 s/|/:/g' EmpData.txt 
# b From the above database substitute the delimiter with “ : ”
sed -i 's/|/:/g' EmpData.txt 
# c Insert the string “ TechM Employees” in the first line.
sed -i '1i\TechM Employees' EmpData.txt 
# d Store the lines pertaining to the directors, d.g.m and g.m into three separate files.
sed -n '/director/p' EmpData.txt > directors.txt
sed -n '/d.g.m/p' EmpData.txt > dgm.txt
sed -n '/g.m/p' EmpData.txt > gm.txt
# e Using address store first 4 lines into a file Empupdate.
sed -i '1, 4 w Empupdate.txt' EmpData.txt
# f Find the pattern “account” in the database and replaces that with “accounts”.
sed -i 's/account/accounts/g' EmpData.txt 
# g Select those lines which do not have a pattern “g.m”.
sed -n '/g.m/!p' EmpData.txt
# h Insert a blank line after every line in the database.
sed G EmpData.txt