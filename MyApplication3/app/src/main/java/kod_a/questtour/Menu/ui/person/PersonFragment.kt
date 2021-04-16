package turism.ru.Menu.ui.person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kod_a.questtour.R



class PersonFragment : Fragment() {

  private lateinit var personViewModel: PersonViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    personViewModel =
    ViewModelProviders.of(this).get(PersonViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_person, container, false)
    val textView: TextView = root.findViewById(R.id.text_name)
    /*personViewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })*/
    return root
  }
}