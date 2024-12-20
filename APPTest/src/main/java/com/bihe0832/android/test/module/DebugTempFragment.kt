package com.bihe0832.android.test.module

import com.bihe0832.android.common.debug.base.BaseDebugListFragment
import com.bihe0832.android.common.debug.item.getDebugItem
import com.bihe0832.android.lib.adapter.CardBaseModule
import com.bihe0832.android.lib.utils.intent.IntentUtils

class DebugTempFragment : BaseDebugListFragment() {
    val LOG_TAG = "DebugTempFragment"

    override fun getDataList(): ArrayList<CardBaseModule> {
        return ArrayList<CardBaseModule>().apply {
            add(getDebugItem("简单测试函数") { testFunc() })
            add(getDebugItem("通用测试预处理") { preTest() })
            add(getDebugItem("APP设置") { IntentUtils.startAppDetailSettings(context) })
        }
    }


    private fun preTest() {

    }

    private fun testFunc() {
    }


}