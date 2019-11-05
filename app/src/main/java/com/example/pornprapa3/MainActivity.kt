package com.example.pornprapa3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final var TAG_FNAME = "FNAME";
    public final var TAG_LNAME ="LNAME";
    public final var TAG_NNAME = "NNAME";
    public final var TAG_SEX = "SEX";
    public final var TAG_ADDRESS = "ADDRESS";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("gg")

        btn_sender.setOnClickListener {
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var nname = et_nname.text.toString()
            var sex = et_sex.text.toString()
            var address = et_address.text.toString()
            senderFun(fname,lname,nname,sex,address)
        }
        btn_clear.setOnClickListener {
            et_fname.setText("")
            et_lname.setText("")
            et_nname.setText("")
            et_sex.setText("")
            et_address.setText("")
        }
        btn_closs.setOnClickListener {
            finish()
        }
    }
    fun senderFun(str1: String,str2:String,str3:String,str4:String,str5:String){

        var goPageSecond = Intent(this,SecondActivity ::class.java)

        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_NNAME,str3)
        goPageSecond.putExtra(TAG_SEX,str4)
        goPageSecond.putExtra(TAG_ADDRESS,str5)

        startActivity(goPageSecond)
    }
}
