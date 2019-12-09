package android.example.projectintent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_halaman_empat.*

class halaman_empat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_empat)

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.trap));
        videoView.setMediaController(MediaController(this))


        play.setOnClickListener {
            videoView.start()
        }
    }
}
