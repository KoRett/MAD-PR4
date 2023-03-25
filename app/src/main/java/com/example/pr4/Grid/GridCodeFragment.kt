package com.example.pr4.Grid

import android.R
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridLayout
import androidx.fragment.app.Fragment


class GridCodeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val gridLayout = GridLayout(context)

        gridLayout.rowCount = 3
        gridLayout.columnCount = 3

        for (i in 1..gridLayout.columnCount) {
            val button = Button(context)
            button.textSize = 26f
            button.text = (3 - i + 1).toString()
            val layoutParams =
                GridLayout.LayoutParams(GridLayout.spec(0), GridLayout.spec(3 - i))
            button.layoutParams = layoutParams
            gridLayout.addView(button)
        }

        val button4 = Button(context)
        val layoutParams =
            GridLayout.LayoutParams(GridLayout.spec(1), GridLayout.spec(0, 2))
        layoutParams.width = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 180f, resources.displayMetrics
        ).toInt()
        button4.textSize = 26f
        button4.text = "4"
        gridLayout.addView(button4, layoutParams)

        val button5 = Button(context)
        val layoutParams0 =
            GridLayout.LayoutParams(GridLayout.spec(1, 2), GridLayout.spec(2))
        layoutParams0.height = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 100f, resources.displayMetrics
        ).toInt()
        layoutParams0.leftMargin = 100
        layoutParams0.topMargin = 100
        button5.textSize = 26f
        button5.text = "5"
        gridLayout.addView(button5, layoutParams0)

        val button6 = Button(context)
        val layoutParams1: GridLayout.LayoutParams =
            GridLayout.LayoutParams(GridLayout.spec(2), GridLayout.spec(0))
        button6.textSize = 26f
        button6.text = "6"
        gridLayout.addView(button6, layoutParams1)

        val button7 = Button(context)
        button7.textSize = 26f
        button7.text = "7"
        gridLayout.addView(button7)

        return gridLayout
    }
}