package com.example.android.myandroid

import android.view.View
import com.example.android.myandroid.R
import com.example.android.myandroid.CountersModel
import com.example.android.myandroid.MainView


class MainPresenter(val view: MainView) {

    val model = CountersModel()

    fun counterClick1(id: Int){
                val nextValue = model.next(0)
                view.setButtonText1(0,nextValue.toString())
            }

    fun counterClick2(id: Int){
                val nextValue = model.next(1)
                view.setButtonText2(1,nextValue.toString())
            }

    fun counterClick3(id: Int){
                val nextValue = model.next(2)
                view.setButtonText3(2,nextValue.toString())
            }
        }