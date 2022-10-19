package id.ac.atmaluhur.hellofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFragment = findViewById<Button>(R.id.btnFragment)

        btnFragment.setOnClickListener {
            val myFragment = MyFragment()
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.fragment, myFragment)
            ft.commit()
        }
    }
}