MathApp
Package: vcmsa. sonav. mathapp
Language: Kotlin
Platform: Android

Description
MathApp is a straightforward Android application created to execute basic arithmetic functions — Addition, Subtraction, Multiplication, and Division — between two numbers provided by the user. The user chooses the desired operation by utilizing radio buttons and presses the calculate button to view the result.

Features
Accepts two number entries

Supports:
Addition (+)
Subtraction (-)
Multiplication (×)
Division (÷)
Displays the outcome and type of operation

Manages errors such as:
Missing input
Division by zero
No operation selected

How It Works
The user inputs two numbers into EditText fields.

Chooses an operation using the radio buttons:
radioAdd
radioSubtract
radioMultiply
radioDivide
Clicks the Add button (utilized as "Calculate").
The app verifies the inputs and the chosen operation, executes the calculation, and presents the answer in tvAnswer.

Code Overview
The primary logic resides in MainActivity. kt.
Here are the significant components:

UI Component Purpose
EditText Input fields for numbers (edtNumber, edtNumber2)
RadioButton Operation selectors (radioAdd, etc. )
Button Calculate button (btnAdd)
TextView Displays operation symbol and outcome
Error Handling:

Shows error notifications for:
Non-numeric or empty input
Division by zero
No operation selected

Project Structure
markdown
Copy
Edit
vcmsa/
└── sonav/
└── mathapp/
└── MainActivity. kt
Notes
The development of radio button functionality and arithmetic operations was facilitated by ChatGPT, using prompts to link radio buttons to defined functions like addition, subtraction, etc.

Example Output
makefile
Copy
Edit
Input: 5 and 2
Selected: Multiplication
Output: Result (Multiplication): 10. 0
Future Suggestions
Incorporate input validation feedback on the UI
Change the "Add" button label to "Calculate"
Add more operations (e. g. , modulo, exponent)
Enhance UI layout and integrate icons

