package com.example.pr4.Frame

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment


class FrameCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val frameLayout = FrameLayout(requireContext())
        val textView1 = TextView(context)
        textView1.text = "Текст по умолчанию"
        textView1.textSize = 26F
        frameLayout.addView(textView1)


        val scrollView = ScrollView(context)
        val layoutParams =
            FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 500, Gravity.CENTER)
        layoutParams.leftMargin = 50
        layoutParams.bottomMargin = 50
        layoutParams.gravity = Gravity.BOTTOM

        val linearLayout = LinearLayout(context)
        linearLayout.layoutParams =
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        linearLayout.orientation = LinearLayout.VERTICAL
        scrollView.layoutParams = layoutParams


        for (i in 1..20) {
            val textView = TextView(context)
            textView.text = "Текст №$i"
            textView.textSize = 26F
            linearLayout.addView(textView)
        }

        scrollView.addView(linearLayout)
        frameLayout.addView(scrollView)
        return frameLayout
    }
}