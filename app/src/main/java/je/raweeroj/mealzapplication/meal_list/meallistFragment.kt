package je.raweeroj.mealzapplication.meal_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import je.raweeroj.mealzapplication.R

class meallistFragment : Fragment() {

    companion object {
        fun newInstance() = meallistFragment()
    }

    private lateinit var viewModel: MeallistViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_meallist, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MeallistViewModel::class.java)
        // TODO: Use the ViewModel
    }

}