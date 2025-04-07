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

Pictures and screenshots from the app 
![image](https://github.com/user-attachments/assets/af7aaa89-373e-4dde-92ed-68a163bbe5cc)
![image](https://github.com/user-attachments/assets/fd307182-4e50-4209-b08f-e16db35c172e)
![image](https://github.com/user-attachments/assets/31e99a69-a48d-4eb4-883f-a1e700e1dfbf)
![image](https://github.com/user-attachments/assets/11ff6206-b788-484e-9528-a32ebb1645e2)
![image](https://github.com/user-attachments/assets/23502fa0-ace9-4edb-bc86-29aa32eb4ae7)
![image](https://github.com/user-attachments/assets/5cec1584-8d10-4dc6-8ac6-69a71889764e)
![image](https://github.com/user-attachments/assets/4027caa8-6e66-4e58-91b9-4f771501780a)

Screenshots of the apps code
![image](https://github.com/user-attachments/assets/d6a4d440-0b5e-4e3c-8e5f-e9f79a34f3ff)
![image](https://github.com/user-attachments/assets/ec1d0294-f1fe-4f52-977e-e06690476be5)
![image](https://github.com/user-attachments/assets/9bea0fdf-bbdc-4565-bd0b-a9cd40d3fd70)
![image](https://github.com/user-attachments/assets/58df7aa1-9160-46ef-aa2f-1250b408c8d5)

