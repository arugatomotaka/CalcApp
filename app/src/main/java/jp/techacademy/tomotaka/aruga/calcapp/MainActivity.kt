package jp.techacademy.tomotaka.aruga.calcapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jp.techacademy.tomotaka.aruga.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //ボタン１＝＋,2=-,3=×,4=÷
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var kotae = 0

        var firsttab = binding.editText1.text.toString()
        var secondtab = binding.editText2.text.toString()

        var tab1 = firsttab.toInt()
        var tab2 = secondtab.toInt()

        if (v?.id == binding.button1.id) {
            kotae = tab1 + tab2
        }
        if (v?.id == binding.button2.id) {
            kotae = tab1 - tab2
        }
        if (v?.id == binding.button3.id) {
            kotae = tab1 * tab2
        }
        if (v?.id == binding.button4.id) {
            kotae = tab1 / tab2
        }

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("KEISANKEKKA", kotae)
        startActivity(intent)
    }
}


