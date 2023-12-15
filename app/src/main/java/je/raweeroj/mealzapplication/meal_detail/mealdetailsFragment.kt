package je.raweeroj.mealzapplication.meal_detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import je.raweeroj.mealzapplication.R

class mealdetailsFragment : Fragment() {

    companion object {
        fun newInstance() = mealdetailsFragment()
    }

    private lateinit var viewModel: MealdetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mealdetails, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MealdetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}