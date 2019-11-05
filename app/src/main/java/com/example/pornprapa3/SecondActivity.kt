package com.example.pornprapa3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("หน้าสองล้าน")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var nname = intent.extras?.getString(MainActivity().TAG_NNAME)
        var sex = intent.extras?.getString(MainActivity().TAG_SEX)
        var address = intent.extras?.getString(MainActivity().TAG_ADDRESS)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_nname.setText(nname)
        tv_res_sex.setText(sex)
        tv_res_address.setText(address)

        btn_back.setOnClickListener {
            finish()
        }
    }
}