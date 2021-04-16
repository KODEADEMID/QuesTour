package turism.ru.authorization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kod_a.questtour.R
import kotlinx.android.synthetic.main.activity_loginn.*
import turism.ru.Menu.MenuActivity
import turism.ru.Menu.NavigationMenuActivity


class LoginnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginn)
        login.setOnClickListener(){
            val intent = Intent(this, NavigationMenuActivity::class.java)
            startActivity(intent)
        }
    }
}