package com.chestnut.zhuanlan.util

import android.util.Log
import com.chestnut.zhuanlan.model.StorySet
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

object ApiUtils {

    private val latestMsgUrl = "https://news-at.zhihu.com/api/4/news/latest"
    private val getMsgUrl = "https://news-at.zhihu.com/api/4/news/"

    fun getLatestMsg() {
        val client = OkHttpClient()
        val request = Request.Builder().url(latestMsgUrl).build()
        val call = client.newCall(request)
        call.enqueue(object : Callback{
            override fun onFailure(call: Call?, e: IOException?) {
                Log.e(this.javaClass.toString(),"网络错误,获取最近消息失败")
            }

            override fun onResponse(call: Call?, response: Response?) {
                val jsonStr = response!!.body()?.string()
                // TODO 这里由于images字段是数组，所以需要对数据类进行修改，明天再做
                val storySet = Gson().fromJson(jsonStr, StorySet::class.java)
                Log.d(this.javaClass.toString(),storySet.toString())
            }
        })
    }

}