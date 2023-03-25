package com.example.pr4.Relative

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment


class RelativeCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val relativeLayout = RelativeLayout(context)
        relativeLayout.setPadding(20, 20, 20, 20)
        val textView1 = TextView(context)
        textView1.text = "Левый верх"
        textView1.textSize = 20f
        val textView2 = TextView(context)
        textView2.text = "Правый верх"
        textView2.textSize = 20f
        val textView3 = TextView(context)
        textView3.text = "Левый низ"
        textView3.textSize = 20f
        val textView4 = TextView(context)
        textView4.text = "Правый низ"
        textView4.textSize = 20f

        val layoutParams1 = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams1.addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        layoutParams1.addRule(RelativeLayout.ALIGN_PARENT_TOP)
        relativeLayout.addView(textView1, layoutParams1)

        val layoutParams2 = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
        layoutParams2.addRule(RelativeLayout.ALIGN_PARENT_TOP)
        relativeLayout.addView(textView2, layoutParams2)

        val layoutParams3 = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams3.addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        layoutParams3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        relativeLayout.addView(textView3, layoutParams3)

        val layoutParams4 = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams4.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
        layoutParams4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        relativeLayout.addView(textView4, layoutParams4)

        return relativeLayout
    }
}