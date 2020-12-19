package turism.ru.Wheel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_wheel.*
import turism.ru.MapGoogleActivity
import turism.ru.Menu.NavigationMenuActivity
import turism.ru.R
import turism.ru.VkAndInst.VkAndInstURL

class WheelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wheel)
        road.setOnClickListener(){
            val intent = Intent(this, MapGoogleActivity::class.java)
            startActivity(intent)
        }

        task.setOnClickListener(){
            val intent = Intent(this, VkAndInstURL::class.java)
            startActivity(intent)
        }
    }
}