# Day 1

- Shell Files Extension is .sh

**To check Current Shell**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ echo $0
bash
```

**All Shells Available**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ cat /etc/shells
# /etc/shells: valid login shells
/bin/sh
/bin/bash
/usr/bin/bash
/bin/rbash
/usr/bin/rbash
/usr/bin/sh
/bin/dash
/usr/bin/dash
```

**List contents in current Directory**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ ls
text.txt
student@dac-Veriton-M200-H310:~/Downloads/OS$ ls -a
.  ..  text.txt
student@dac-Veriton-M200-H310:~/Downloads/OS$ ls -l
total 4
-rw-rw-r-- 1 student student   0 Mar 16 18:46 text.md
-rw-rw-r-- 1 student student 754 Mar 16 18:45 text.txt
```

**Show all running Processes**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ ps -a
    PID TTY          TIME CMD
   1991 tty2     00:00:00 gnome-session-b
   7528 tty3     00:00:00 gnome-session-b
  10759 pts/1    00:00:00 ps
```

**Switch to Root User**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ sudo -i
[sudo] password for student:
root@dac-Veriton-M200-H310:~# exit
logout
student@dac-Veriton-M200-H310:~/Downloads/OS$
```

**SheBang!**: It is not treated as a comment

```bash
#!/bin/bash
```

**echo = println**

```bash
echo "Hello World!"

```

- It works even without ""

**First Script**

```sh
#!/bin/bash

echo "Hello World!"
```

- Running .sh

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ vi 01_script.sh
student@dac-Veriton-M200-H310:~/Downloads/OS$ ./01_script.sh
bash: ./01_script.sh: Permission denied
student@dac-Veriton-M200-H310:~/Downloads/OS$ chmod 755 01_script.sh

student@dac-Veriton-M200-H310:~/Downloads/OS$ ./01_script.sh
Hello World!
```

- Cannot work without providing permission
- `chmod` is used to give permission

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ bash ./01_script.sh
Hello World!
```

- Can work without giving permission by using bash command
  **Comments**

```sh
#!/bin/bash

#Single Line Comment

<<Multi_Line_Comment
Hello
DAC
Multi_Line_Comment
```

- Single Line Comment Starts with `#`
- Multi Line Comment Starts with `<<` followed by a name to that comment, when the comment ends same name has to be typed again to specify end of comment

**Variables**

```sh
#!/bin/bash

#Declaring and intializing a variable
a=Aakash

#using a variable
echo "Hello $a"
```

- While declaring and initializing a variable there should not be space between variable name , `=` and value
- While using the variable `$` should be used before variable to use its value
- Shell scripting is weakly typed language hence no data type is there in this language.

**Taking Input from user**

```sh
#!/bin/bash

echo "Enter Your Name: "
read a
echo "Hello $a"
```

- output:

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ bash ./04_script.sh
Enter Your Name:
Akash
Hello Akash
student@dac-Veriton-M200-H310:~/Downloads/OS$
```

```sh
#!/bin/bash

# Here Input will be taken on same line
read -p "Enter your Age: " age
echo "Age: $age"
```

- output:

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ bash ./04_script.sh

Enter your Age: 21
Age: 21
student@dac-Veriton-M200-H310:~/Downloads/OS$
```

```sh
#!/bin/bash

read -sp "Enter Password: " psd
echo
echo "Password $psd"
```

```bash
sonu@Akash:/mnt/d/Study/PG-DAC/PG-DAC/OS$ bash 04_readingVariables.sh 
Enter Password: 
Password 1234
sonu@Akash:/mnt/d/Study/PG-DAC/PG-DAC/OS$ 
```

**Mathematical Operations:**

```sh
#!/bin/bash

a=5
b=10

let c=$a+$b

echo "sum: $c"
```

- for arithmetic operation `let` command is used
- without `$` also it will work, but it is a good practise to use `$`.

```sh
#!/bin/bash

a=5
b=10

((c=a+b))

echo "sum: $c"
```

- Instead of `let` `((c=a+b))` can also be used
- Also `expr` can be used

```sh
#!/bin/bash

a=5
b=10

c=`expr $a + $b`

echo "sum: $c"
```

**Logical Operators:**

| Operator         | Description                       |
| ---------------- | --------------------------------- |
| **-eq** / **==** | Equal (for arithmetic and string) |
| **-ge**          | Greater than or equal to          |
| **-le**          | Less than or equal to             |
| **-ne** / **!=** | Not equal                         |
| **-gt**          | Greater than                      |
| **-lt**          | Less than                         |

**If Else:**

```sh
#!/bin/bash

read -p "Enter Number: " a

if [ $a == 10 ] || [ $a == 2]
then
        echo "if part"
elif [ $a == 5 ]
then
        echo "elif part"
else
        echo "else part"
fi
```

- `fi` means `if` statement ends here.
- Indents are not Compulsary but Spaces are.

**For Loop:**

```sh
#!/bin/bash

for i in 2 4 6 8 Aakash
do
        echo "$i"
done

for ((i=0;i<=10;i++))
do
        echo "$i"
done
```

- Output:

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ vim 08_forLoop.sh
student@dac-Veriton-M200-H310:~/Downloads/OS$ bash 08_forLoop.sh
2
4
6
8
Aakash
```

**Infinite Loop**

```sh
#!/bin/bash

while true
do
        echo "Akash"
        sleep 2s
done
```

- `sleep` waits for specified time

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ date +%H
20
student@dac-Veriton-M200-H310:~/Downloads/OS$ date +%h
Mar
student@dac-Veriton-M200-H310:~/Downloads/OS$
student@dac-Veriton-M200-H310:~/Downloads/OS$ date +%u
6
student@dac-Veriton-M200-H310:~/Downloads/OS$ date +%A
Saturday
```

- `date +%H` displays Hours
- `date +%h` displays month
- `date +%u` displays Day of week in integer
- `date +%A` displays Day of Week

```
%%     a literal %

       %a     locale's abbreviated weekday name (e.g., Sun)

       %A     locale's full weekday name (e.g., Sunday)

       %b     locale's abbreviated month name (e.g., Jan)

       %B     locale's full month name (e.g., January)

       %c     locale's date and time (e.g., Thu Mar  3 23:05:25 2005)

       %C     century; like %Y, except omit last two digits (e.g., 20)

       %d     day of month (e.g., 01)

       %D     date; same as %m/%d/%y

       %e     day of month, space padded; same as %_d

       %F     full date; like %+4Y-%m-%d

       %g     last two digits of year of ISO week number (see %G)

       %G     year of ISO week number (see %V); normally useful only with %V

       %h     same as %b

       %H     hour (00..23)

       %I     hour (01..12)

       %j     day of year (001..366)

       %k     hour, space padded ( 0..23); same as %_H

       %l     hour, space padded ( 1..12); same as %_I

       %m     month (01..12)

       %M     minute (00..59)

       %n     a newline

       %N     nanoseconds (000000000..999999999)

       %p     locale's equivalent of either AM or PM; blank if not known

       %P     like %p, but lower case

       %q     quarter of year (1..4)

       %r     locale's 12-hour clock time (e.g., 11:11:04 PM)

       %R     24-hour hour and minute; same as %H:%M

       %s     seconds since 1970-01-01 00:00:00 UTC

       %S     second (00..60)

       %t     a tab

       %T     time; same as %H:%M:%S

       %u     day of week (1..7); 1 is Monday

       %U     week number of year, with Sunday as first day of week (00..53)

       %V     ISO week number, with Monday as first day of week (01..53)

       %w     day of week (0..6); 0 is Sunday

       %W     week number of year, with Monday as first day of week (00..53)

       %x     locale's date representation (e.g., 12/31/99)

       %X     locale's time representation (e.g., 23:13:48)

       %y     last two digits of year (00..99)

       %Y     year

       %z     +hhmm numeric time zone (e.g., -0400)

       %:z    +hh:mm numeric time zone (e.g., -04:00)

       %::z   +hh:mm:ss numeric time zone (e.g., -04:00:00)

       %:::z  numeric time zone with : to necessary precision (e.g., -04, +05:30)

       %Z     alphabetic time zone abbreviation (e.g., EDT)
```

**grep command**

The `grep` command in Unix/Linux is a powerful tool used for searching and manipulating text patterns within files.

The basic syntax of the `grep` command is as follows:

```bash
grep [options] pattern [files]
```

Here,

- `[options]`: These are command-line flags that modify the behavior of grep.
- `pattern`: This is the regular expression you want to search for.
- `[file]`: This is the name of the file(s) you want to search within. You can specify multiple files for simultaneous searching¹.

Here are some commonly used options with the `grep` command¹:

- `-i`: Ignores case for matching
- `-v`: Inverts the match, i.e., it matches only those lines that do not match the pattern.
- `-c`: Prints only a count of the lines that match a pattern
- `-l`: Displays list of filenames only.
- `-n`: Display the matched lines and their line numbers.
- `-w`: Matches the whole word.
- `-A n`, `-B n`, `-C n`: Prints `n` lines of trailing or leading or both context.

For example, to search for the pattern 'hello' in a file named 'example.txt', you would use:

```bash
grep 'hello' example.txt
```

This will print all the lines in 'example.txt' that contain the string 'hello'.

Remember, `grep` is case sensitive. To ignore case, use the `-i` option.

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ grep Akash test_awk.txt
1 Akash 14
```

**Accessing Data From Files**

**awk command**

The `awk` command is a powerful tool in Unix/Linux for text processing. With `awk`, you can process text files, especially when they are structured as columns of data.

The basic syntax of `awk` is:

```bash
awk 'pattern {action}' file
```

Here,

- `pattern` is what you are searching for.
- `action` is what you want to do when a line matches the pattern.
- `file` is the file you want to search.

Here are some examples of what you can do with `awk`:

1. Print every line in a file:

```bash
awk '{print}' file
```

2. Print certain fields (columns) in a file. In this example, print the first and fourth field in each line:

```bash
awk '{print $1,$4}' file
```

3. Print lines that match a certain pattern. In this example, print lines that contain the word 'manager':

```bash
awk '/manager/ {print}' file
```

`awk` also has several built-in variables¹:

- `FS`: The field separator (default is any whitespace).
- `OFS`: The output field separator (default is a space).
- `NF`: The number of fields in the current record.
- `NR`: The number of the current record.
- `FILENAME`: The name of the current input file.

You can also use conditions and loops in `awk`, making it quite powerful for processing large amounts of text data.

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ vi test_awk.txt
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk '{print $0}' test_awk.txt
sr.no name marks
1 Akash 14
2 Abhijeet 4
3 Chinmay 56
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk '{print $1}' test_awk.txt
sr.no
1
2
3
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk '{print $2}' test_awk.txt
name
Akash
Abhijeet
Chinmay
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk '{print $3}' test_awk.txt
marks
14
4
56
```

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ ls -l | awk '{print $5, $9}' | sort -n

33 01_helloWorld.sh
50 05_arithmeticoperations.sh
54 test_awk.txt
56 09_while.sh
69 06_arithmeticOperations2.sh
85 02_comments.sh
95 03_variables.sh
97 Assi1.sh
103 08_forLoop.sh
110 04_readingVariables.sh
144 07_if_elif_else.sh
158 07_script.sh
171 Assi3.sh
245 Assi4.sh
312 Assi5.sh
335 Assi2.sh
370 Assi6.sh
9072 text.md
```

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk 'NR==1 {print $0}' test_awk.txt 
sr.no name marks
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk 'NR==2 {print $0}' test_awk.txt 
1 Akash 14
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk 'NR==3 {print $0}' test_awk.txt 
2 Abhijeet 4
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk 'NR==4 {print $0}' test_awk.txt 
3 Chinmay 56
student@dac-Veriton-M200-H310:~/Downloads/OS$ awk 'NR==4 {print $1, $2}' test_awk.txt 
3 Chinmay
```

## String Manipulation

```sh
#!/bin/bash

myvar="Hello"

length=${#myvar}

upper=${myvar^^}
lower=${myvar,,}


echo "$length"
echo "$myvar"
echo "$upper"
echo "$lower"
```

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ /bin/bash "/home/student/Downloads/OS/String.sh"
5
Hello
HELLO
hello
```

**Reverse a String**

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ rev <<< Akash
hsakA
```

## Functions

```sh
#!/bin/bash

myfun(){
    echo "Hello World"
}
myfun
```

- output:

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ /bin/bash "/home/student/Downloads/OS/Assi11.sh"
Hello World
```

**Passing Arguments**

```sh
#!/bin/bash

add(){ #$0 refers to function itself
    num1=$1 #$1 means first argument
    num2=$2 #$2 means first argument
    let sum=$num1+$num2
    echo "sum: $sum"
}
add 10 20
```

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ /bin/bash "/home/student/Downloads/OS/function.sh"
sum: 30
```

- `>`: Redirect Operator redirects/ overwrites data of a command, stdin, stdout, stderr in apecified file

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ ls > log.txt
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ cat log.txt 
another.txt
log.txt
```

- 0 for `stdin`
- 1 for `stdout`
- 2 for `stderr`

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ grep "for" another 2> log.txt 
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ cat log.txt 
grep: another: No such file or directory
```

- `>>`: Append Operator appends data after existing data

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ ls >> log.txt 
student@dac-Veriton-M200-H310:~/Downloads/OS/new$ cat log.txt 
another.txt
log.txt
another.txt
log.txt
```

```bash
student@dac-Veriton-M200-H310:~/Downloads/OS$ grep "^1 :" students.txt 
1 : Akash : 14 : 9.8
```
