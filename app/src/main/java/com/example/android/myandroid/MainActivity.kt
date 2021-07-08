package com.example.android.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.myandroid.MainPresenter
import com.example.android.myandroid.MainView
import com.example.android.myandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter by lazy { MainPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            when(it.id) {
                vb?.btnCounter1?.id -> presenter.counterClick1(it.id)
                vb?.btnCounter2?.id -> presenter.counterClick2(it.id)
                vb?.btnCounter3?.id -> presenter.counterClick3(it.id)
            }
        }

        vb?.btnCounter1?.setOnClickListener(listener)
        vb?.btnCounter2?.setOnClickListener(listener)
        vb?.btnCounter3?.setOnClickListener(listener)

    }

    override fun setButtonText1(index: Int, text: String) {
        vb?.btnCounter1?.text = text
        }
    override fun setButtonText2(index: Int, text: String) {
        vb?.btnCounter2?.text = text
    }
    override fun setButtonText3(index: Int, text: String) {
        vb?.btnCounter3?.text = text
    }

    }