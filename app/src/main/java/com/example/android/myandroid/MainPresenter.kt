package com.example.android.myandroid

import android.view.View
import com.example.android.myandroid.R
import com.example.android.myandroid.CountersModel
import com.example.android.myandroid.MainView
import com.example.android.myandroid.databinding.ActivityMainBinding


class MainPresenter(val view: MainView) {

    val model = CountersModel()
    private var vb: ActivityMainBinding? = null

    fun counterClick(id: Int){
        when(id){
            vb?.btnCounter1?.id -> {
                val nextValue = model.next(0)
                view.setButtonText(0,nextValue.toString())
            }

            vb?.btnCounter2?.id -> {
                val nextValue = model.next(1)
                view.setButtonText(1,nextValue.toString())
            }

            vb?.btnCounter3?.id -> {
                val nextValue = model.next(2)
                view.setButtonText(2,nextValue.toString())
            }
        }
    }
}