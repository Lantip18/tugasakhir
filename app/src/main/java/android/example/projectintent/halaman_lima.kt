package android.example.projectintent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_halaman_lima.*

class halaman_lima : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_lima)

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lofi));
        videoView.setMediaController(MediaController(this))


        play.setOnClickListener {
            videoView.start()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        videoView.stopPlayback()
        finish()
    }
}
