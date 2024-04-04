@echo off
REM Get today's date
for /f "tokens=1,2,3 delims=/ " %%a in ('date /t') do (
    set "MONTH=%%b"
    set "DAY=%%c"
    set "YEAR=%%d"
)

REM Remove leading zeros from DAY if present
if %DAY:~0,1% == 0 set "DAY=%DAY:~1%"

REM Adjust month to have proper names instead of numbers
if "%MONTH%"=="1" set "MONTH=Jan"
if "%MONTH%"=="2" set "MONTH=Feb"
if "%MONTH%"=="3" set "MONTH=Mar"
if "%MONTH%"=="4" set "MONTH=Apr"
if "%MONTH%"=="5" set "MONTH=May"
if "%MONTH%"=="6" set "MONTH=Jun"
if "%MONTH%"=="7" set "MONTH=Jul"
if "%MONTH%"=="8" set "MONTH=Aug"
if "%MONTH%"=="9" set "MONTH=Sep"
if "%MONTH%"=="10" set "MONTH=Oct"
if "%MONTH%"=="11" set "MONTH=Nov"
if "%MONTH%"=="12" set "MONTH=Dec"

REM Concatenate day, month, and year in the desired format
set "TODAY=%DAY%-%MONTH%-24"

REM Add the formatted date to clipboard
echo 240340120014_Java_%TODAY%| clip
echo Text copied to clipboard!
