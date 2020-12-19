package turism.ru.VkAndInst

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import turism.ru.R

class VkAndInstURL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vk_and_inst_u_r_l)

        val inst = findViewById<ImageButton>(R.id.ins)
        inst.setOnClickListener(View.OnClickListener { gotoUrl("https://www.instagram.com/") })

        val vkont = findViewById<ImageButton>(R.id.vkk)
        vkont.setOnClickListener(View.OnClickListener { gotoUrl("https://vk.com/") })

    }

    private fun gotoUrl(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}