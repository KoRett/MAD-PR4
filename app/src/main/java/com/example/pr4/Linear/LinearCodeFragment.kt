package com.example.pr4.Linear

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment


class LinearCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val linearLayout = LinearLayout(context)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.setPadding(10, 10, 10, 10)
        linearLayout.weightSum = 4f


        val layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 0, 2F)
        layoutParams.gravity = Gravity.CENTER

        val editText = EditText(context)
        editText.layoutParams = layoutParams
        editText.hint = "Что-то напишите"
        editText.gravity = Gravity.BOTTOM
        linearLayout.addView(editText)

        val textView = TextView(context)
        textView.text = "Какой-то текст"
        textView.textSize = 18f
        layoutParams.weight = 2f
        layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT
        textView.layoutParams = layoutParams
        linearLayout.addView(textView)

        return linearLayout
    }
}