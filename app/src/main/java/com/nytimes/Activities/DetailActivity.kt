package com.nytimes.Activities



import Results
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nytimes.R
import com.nytimes.databinding.ActivityDetailBinding
import com.nytimes.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {
    private lateinit var dataObj: Results
    private lateinit var mBinding: ActivityDetailBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        initView()
    }

    //Initialization
    private fun initView() {
        dataObj = intent.getParcelableExtra("detail")!!
        setdata()
    }


    private fun setdata() {
        Picasso.get().load(dataObj.media?.get(0)?.mediametadata?.get(2)?.url).into(mBinding.image)
        mBinding.desc.text = dataObj.media?.get(0)?.caption
        mBinding.copyright.text = dataObj.media?.get(0)?.copyright



    }
}
