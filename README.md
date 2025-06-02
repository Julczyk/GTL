# GreenTextLang

## 📦 Installation guide
### Requirements
- **Java 1.4** (must be available in your system's `PATH`)
- Windows, Linux, or macOS terminal access

#### 1. Install Java 1.4

Check if Java 1.4 is already installed:
```sh
java -version
```

If not installed:\
Download Java 1.4 from the Oracle Java Archive or another trusted source.\
Add Java's bin directory to your system's PATH.

#### 2. Download the App
Go to the Releases section of this repository.\
Download the latest release.\
Unzip it to desired folder.\
Interpreter is GTL.exe file in bin folder.

#### 3. (Optional) Associate .gtl File Extension (Windows Only)
To make .gtl files open widows Settings/Apps/Default Apps\
Search for .gtl.\
Click Choose default and navigate to GTL.exe file.

## Run Tutorial

Navigate to bin folder and fun command line. From command line run:
```sh
gtl path/to/file
```
Options:
 - -h - help
 - -d - turn on debug mode
 - -v - show version of GTL

## 🐞 Debugger Tutorial
When the debugger is running, the following commands are available:

Command	Description
- *ENTER*	          - to the next step (step forward)
- **number**	      - Go forward number of lines
- line **number**	  - Equivalent to entering the number directly
- resize then *ENTER* - Recalculates display size (use if output looks misaligned)
- clear	              - Clears the program output window