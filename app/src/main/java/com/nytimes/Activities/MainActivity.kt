package com.nytimes.Activities

import Base
import Results
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.nytimes.Adapter.ListAdapter
import com.nytimes.Interface.CommonResponseListener
import com.nytimes.Network.NetworkAccessor
import com.nytimes.Network.WebUrls
import com.nytimes.R
import com.nytimes.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity(), CommonResponseListener {
    private lateinit var arrList: Array<Results>
    private lateinit var dataObj: Base
    private lateinit var mBinding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initView()
    }


    private fun initView() {
        callApi()
    }

    //calling API to get data
    private fun callApi() {
        mBinding.progressBar.visibility = View.VISIBLE
        var networkAccessor = NetworkAccessor()
        var jsoPayload = JSONObject()
        networkAccessor.commonNetworkCall(this@MainActivity, jsoPayload, this@MainActivity, WebUrls.BASE_URL, WebUrls.GET_MOVIES)
    }

    //on Success
    override fun onSuccessResponse(result: String, from: String, code: Int) {
        mBinding.progressBar.visibility = View.GONE
        var gson = Gson()
        dataObj = Base()
        val base = gson.fromJson(result, dataObj::class.java)
        arrList = base.results!!.toTypedArray()
        if (arrList.isNotEmpty()) {
            setDataToAdapter()
        }

    }

    //on Error
    override fun onError(msg: String, fromUrl: String) {
        println("Error Message:-$msg")
        mBinding.progressBar.visibility = View.GONE
    }

    //set Adapter for fetch data
    private fun setDataToAdapter() {
        var linearLayoutManager = LinearLayoutManager(this)
        var adapter = ListAdapter(arrList)
        mBinding.recyclerView.layoutManager = linearLayoutManager
        mBinding.recyclerView.adapter = adapter
    }
}
