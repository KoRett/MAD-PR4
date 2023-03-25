package com.example.pr4.Table

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment


class TableCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tableLayout = TableLayout(context)

        val tableRow1 = TableRow(context)

        val emailText = TextView(context)
        emailText.text = "Почта: "
        emailText.textSize = 22f
        tableRow1.addView(
            emailText,
            TableRow.LayoutParams(
                TableLayout.LayoutParams.WRAP_CONTENT,
                TableLayout.LayoutParams.WRAP_CONTENT
            )
        )

        val emailEdit = EditText(context)
        emailEdit.textSize = 22f
        emailEdit.hint = EditText.AUTOFILL_HINT_EMAIL_ADDRESS
        emailEdit.inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        tableRow1.addView(
            emailEdit,
            TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT
            )
        )

        tableLayout.addView(tableRow1)

        val tableRow2 = TableRow(context)
        val button = Button(context)
        button.setText("кнопка")

        val layoutParams = TableRow.LayoutParams(
            TableLayout.LayoutParams.WRAP_CONTENT,
            TableLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.span = 2
        tableRow2.addView(button, layoutParams)
        tableLayout.addView(tableRow2)

        return tableLayout
    }

}