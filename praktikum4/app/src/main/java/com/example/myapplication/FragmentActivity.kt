package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val fragment1 = Blank1Fragment()


        val fragment = mFragmentManager.findFragmentByTag(Blank1Fragment::class.java.simpleName)
        if(fragment !is Blank1Fragment) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment1, Blank1Fragment::class.java.simpleName)
                .commit()
        }

    }
}