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

- `date +%H` displays Date
- `date +%h` displays month
- `date +%u` displays Day of week in integer
- `date +%A` displays Day of Week

