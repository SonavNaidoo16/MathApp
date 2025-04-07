package vcmsa.sonav.mathapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.sonav.mathapp.R.id
import vcmsa.sonav.mathapp.R.layout

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //code start here
        // declarations 
        val editText1 = findViewById<EditText>(R.id.edtNumber)
        val editText2 = findViewById<EditText>(R.id.edtNumber2)
        val answerText = findViewById<TextView>(R.id.tvAnswer)
        val addBtn = findViewById<Button>(R.id.btnAdd)
        val sign = findViewById<TextView>(R.id.textView4)
        val radioAdd = findViewById<RadioButton>(R.id.radioAdd)
        val radioSubtract = findViewById<RadioButton>(R.id.radioSubtract)
        val radioMultiply = findViewById<RadioButton>(R.id.radioMultiply)
        val radioDivide = findViewById<RadioButton>(R.id.radioDivide)

        // Set a click listener on the Calculate button
        addBtn.setOnClickListener {
            try {
                // Get userInput
                val num1 = editText1.text.toString().toDoubleOrNull()
                val num2 = editText2.text.toString().toDoubleOrNull()

                // Check userInput
                if (num1 == null || num2 == null) {
                    throw NumberFormatException("Incorrect input")
                }

                // Operation of the equation
                val result: Double
                val operation: String
                when {
                    radioAdd.isChecked -> {
                        result = num1 + num2
                        operation = "Addition"
                        sign.text = "+"
                    }
                    radioSubtract.isChecked -> {
                        result = num1 - num2
                        operation = "Subtraction"
                        sign.text = "-"
                    }
                    radioMultiply.isChecked -> {
                        result = num1 * num2
                        operation = "Multiplication"
                        sign.text = "x"
                    }
                    //AI assisted by chatGpt
                    /* prompt "create a code for kotlin which will allow you to connect the radio button to a given function.
                     such as a radio button being clicked allows numbers to be added" "and allow it multiply, divide and subtract" */
                    radioDivide.isChecked -> {
                        if (num2 == 0.0) {
                            answerText.text = "Can't divide by zero!"
                            return@setOnClickListener
                        }
                        result = num1 / num2
                        operation = "Division"
                        sign.text = "÷"
                    }
                    else -> {
                        answerText.text = "Please select an operation!"
                        return@setOnClickListener
                        //End of prompt
                    }
                }

                // Display the result
                answerText.text = "Result ($operation): $result"

            } catch (e: NumberFormatException) {
                answerText.text = "Please enter valid numbers!"
            } catch (e: Exception) {
                answerText.text = "Please try again."
            }
        }
    }
} //End of the code









