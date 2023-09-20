package com.hungry.activityfragmentexample.presentation.fragmentthree

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hungry.activityfragmentexample.R
import com.hungry.activityfragmentexample.databinding.FragmentThreeBinding
import com.hungry.activityfragmentexample.presentation.otheractivity.OtherActivity

class FragmentThree : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigateOther.setOnClickListener {
            navigateToOtherActivity()
        }
    }

    private fun navigateToOtherActivity() {
        val intent = Intent(this.requireContext(),OtherActivity::class.java )
        //intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(OtherActivity.ARGS_NAME,"Dian Aja")
        intent.putExtra(OtherActivity.ARGS_AGE,21)
        startActivity(intent)
    }

}