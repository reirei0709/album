package app.itakura.reirei.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this,PreviewActivity::class.java)

        imageView.setOnClickListener {
            preview.putExtra("image",R.drawable.sea_image)
            preview.putExtra("title","海")
            startActivity(preview)

        }

        imageView2.setOnClickListener {
            preview.putExtra("image",R.drawable.cat_image)
            preview.putExtra("title","猫")
            startActivity(preview)

        }

        imageView3.setOnClickListener {
            preview.putExtra("image",R.drawable.dog_image)
            preview.putExtra("title","仔犬")
            startActivity(preview)

        }

        imageView4.setOnClickListener {
            preview.putExtra("image",R.drawable.cake_image)
            preview.putExtra("title","ケーキ")
            startActivity(preview)

        }

        imageView5.setOnClickListener {
            preview.putExtra("image",R.drawable.night_image)
            preview.putExtra("title","夜景")
            startActivity(preview)

        }

        imageView6.setOnClickListener {
            preview.putExtra("image",R.drawable.flower_image)
            preview.putExtra("title","花")
            startActivity(preview)

        }



    }
}