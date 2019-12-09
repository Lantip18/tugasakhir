package android.example.projectintent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_halaman_tiga.*

class halaman_tiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_tiga)

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.futurebass));
        videoView.setMediaController(MediaController(this))


        play.setOnClickListener {
            videoView.start()
        }
    }
}
