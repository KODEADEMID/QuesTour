package turism.ru.Menu.ui.quest

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_quest.*
import turism.ru.MapGoogleActivity
import turism.ru.QR.QRActivity
import turism.ru.R
import turism.ru.Wheel.WheelActivity
import turism.ru.museum.museum
import turism.ru.rest.RestActivity


class QuestFragment : Fragment() {

  private lateinit var questViewModel: QuestViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    questViewModel =
    ViewModelProviders.of(this).get(QuestViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_quest, container, false)

    val b: Button = root.findViewById(R.id.btn_task1) as Button
    b.setOnClickListener(object : View.OnClickListener {
      override fun onClick(v: View?) {
        val intent = Intent(activity, QRActivity::class.java)
        startActivity(intent)
      }
    })

    val bt: Button = root.findViewById(R.id.btn_task2) as Button
    bt.setOnClickListener(object : View.OnClickListener {
      override fun onClick(v: View?) {
        val intent = Intent(activity, WheelActivity::class.java)
        startActivity(intent)
      }
    })
    val btr: Button = root.findViewById(R.id.btn_task3) as Button
    btr.setOnClickListener(object : View.OnClickListener {
      override fun onClick(v: View?) {
        val intent = Intent(activity, museum::class.java)
        startActivity(intent)
      }
    })
    val btr2: Button = root.findViewById(R.id.btn_task4) as Button
    btr2.setOnClickListener(object : View.OnClickListener {
      override fun onClick(v: View?) {
        val intent = Intent(activity, RestActivity::class.java)
        startActivity(intent)
      }
    })
    /*val textView: TextView = root.findViewById(R.id.text_slideshow)
    questViewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })*/
    return root


  }
}
