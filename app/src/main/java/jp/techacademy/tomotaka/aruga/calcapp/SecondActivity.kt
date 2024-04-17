package jp.techacademy.tomotaka.aruga.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.tomotaka.aruga.calcapp.databinding.ActivityMainBinding
import jp.techacademy.tomotaka.aruga.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val ans = intent.getIntExtra("KEISANKEKKA",0)



        binding.textView.text = ans.toString()
    }
}