package de.syntax_institut.form

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val vornameTE = findViewById<EditText>(R.id.vornameTE)
        val nachnameTE = findViewById<EditText>(R.id.nachnameTE)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup1)
        val diversRB = findViewById<RadioButton>(R.id.diversRB)
        val mannRB = findViewById<RadioButton>(R.id.mannRB)
        val frauRB = findViewById<RadioButton>(R.id.frauRB)

        val hundeCB = findViewById<CheckBox>(R.id.hundeCB)
        val katzenCB = findViewById<CheckBox>(R.id.katzenCB)

        val einreichenBTN = findViewById<Button>(R.id.einreichenBTN)
        val resetBTN = findViewById<Button>(R.id.resetBTN)
        val ausgabeTV = findViewById<TextView>(R.id.ausgabeTV)

        resetBTN.setOnClickListener {
            vornameTE.text.clear()
            nachnameTE.text.clear()
            radioGroup.clearCheck()

        }

        einreichenBTN.setOnClickListener {
            val vorname = vornameTE.text
            val nachname = nachnameTE.text
            val divers = diversRB.isChecked
            val mann = mannRB.isChecked
            val frau = frauRB.isChecked
            val hunde = hundeCB.isChecked
            val katze = katzenCB.isChecked

            if (divers) {
                ausgabeTV.text = "Hallo $vorname $nachname"
            }
            else if (mann) {
                ausgabeTV.text = "Herr $vorname $nachname"
            }
            else if (frau) {
                ausgabeTV.text = "Frau $vorname $nachname"
            } else {
                ausgabeTV.text = "Bitte etwas angeben"
            }
            if (katze){
                ausgabeTV.text = "Hallo $vorname $nachname du magst Katzen"
            }
            if (hunde){
                ausgabeTV.text = "Hallo $vorname $nachname du magst Hunde"
            }
            if (hunde && katze){
                ausgabeTV.text = "Hallo $vorname $nachname du magst Hunde und Katzen"
            }


        }



    }
}