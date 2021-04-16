package turism.ru.Menu.ui.quest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kod_a.questtour.R


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
    val textView: TextView = root.findViewById(R.id.text_slideshow)
    questViewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })
    return root
  }
}