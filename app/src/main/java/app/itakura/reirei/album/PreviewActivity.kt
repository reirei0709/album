package app.itakura.reirei.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageid = intent.getIntExtra("image",0)
        val displayTitle = intent.getStringExtra("title")

        previewImage.setImageResource(imageid)
        titletext.text = displayTitle

        backButton.setOnClickListener {
            finish()
        }

    }
}