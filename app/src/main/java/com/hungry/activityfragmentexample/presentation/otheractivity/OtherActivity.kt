package com.hungry.activityfragmentexample.presentation.otheractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hungry.activityfragmentexample.R
import com.hungry.activityfragmentexample.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    private val binding : ActivityOtherBinding by lazy {
        ActivityOtherBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val name = intent?.getStringExtra(ARGS_NAME).orEmpty()
        val age = intent?.getIntExtra(ARGS_AGE, 0) ?: 0
        //val age = intent?.getParcelableExtra(ARGS_AGE, 0) ?: 0
        Toast.makeText(this, "$name : $age", Toast.LENGTH_SHORT).show()
    }

    companion object{
        const val ARGS_NAME = "ARGS_NAME"
        const val ARGS_AGE = "ARGS_AGE"
    }
}