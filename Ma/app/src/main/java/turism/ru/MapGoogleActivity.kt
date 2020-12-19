package turism.ru

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MapGoogleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_google)

            val sSource: String = "Ярославль, Павлика Морозова, 3Б"
            val sDestination: String = "Ярославль, Которосльная наб., 53,"
            if (sSource == "" && sDestination == "") {
                Toast.makeText(
                    applicationContext, "Enter both location", Toast.LENGTH_LONG
                ).show()
            } else {
                DisplayTrack(sSource, sDestination)
            }

    }

    private fun DisplayTrack(sSource: String, sDestination: String) {
        try {
            val uri = Uri.parse("https://www.google.co.in/maps/dir/$sSource/$sDestination")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val uri =
                Uri.parse("http://play.google.com/store/apps/details?id=com.google.andriod.apps.maps")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}