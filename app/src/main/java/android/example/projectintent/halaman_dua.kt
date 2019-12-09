package android.example.projectintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_dua.*
import kotlinx.android.synthetic.main.activity_main.*

class halaman_dua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)

        bt1.setOnClickListener{
            val intent = Intent(
                this, halaman_tiga::class.java
            )
            startActivity(intent)
        }

        bt2.setOnClickListener{
            val intent = Intent(
                this, halaman_empat::class.java
            )
            startActivity(intent)
        }

        bt3.setOnClickListener{
            val intent = Intent(
                this, halaman_lima::class.java
            )
            startActivity(intent)
        }
    }
}
