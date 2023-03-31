package com.example.learnkotlin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learnkotlin.MainActivity
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.screennumber.text = ("Screen" + getCounter())
        binding.post.text = getQuote()

        binding.firstButtonNext.setOnClickListener {launch()}
        binding.firstButtonBack.setOnClickListener {back()}

        return binding.root


    }
    private fun launch() {
        var fragment : FirstFragment = FirstFragment.newInstance(counter = (requireActivity() as MainActivity).getScreensCount() + 1, quote = (requireActivity() as MainActivity).getQuote())
        parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.container, fragment)
            .commit()
    }

    private fun back() {
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
    override fun onStart() {
        super.onStart()
       // (activity as MainActivity).navController.navigate(R.id.action_firstFragment_to_secondFragment)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    private fun getCounter(): Int =  requireArguments().getInt("key")
    private fun getQuote(): String = requireArguments().getString("stringkey")!!

    companion object {
        @JvmStatic
        fun newInstance(counter: Int, quote : String) : FirstFragment{
            val args = Bundle().apply {
                putInt("key", counter)
                putString("stringkey",quote)
            }
            val fragment = FirstFragment();
            fragment.arguments = args
            return fragment
        }
    }



}