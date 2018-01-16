package com.chestnut.zhuanlan.model

import com.google.gson.annotations.SerializedName

data class Story(@SerializedName("images") val images:String,
                    @SerializedName("type") val type:Int,
                    @SerializedName("id") val id:Long,
                    @SerializedName("ga_prefix") val ga_prefix:String,
                    @SerializedName("title") val title: String)

data class StorySet(@SerializedName("stories") val forecast: List<Story>)