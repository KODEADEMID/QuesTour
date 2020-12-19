package turism.ru.rest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_museum.*
import kotlinx.android.synthetic.main.activity_wheel.*
import kotlinx.android.synthetic.main.activity_wheel.road
import turism.ru.MapGoogleActivity
import turism.ru.QR.QRActivity
import turism.ru.R

class RestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest)

        road.setOnClickListener(){
            val intent = Intent(this, MapGoogleActivity::class.java)
            startActivity(intent)
        }

        task_qr.setOnClickListener(){
            val intent = Intent(this, QRActivity::class.java)
            startActivity(intent)
        }
    }
}