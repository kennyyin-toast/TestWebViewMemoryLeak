package com.example.testmemoryleak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import com.example.testwmemoryleak.R

class Activity2 : AppCompatActivity() {
    companion object {
        private const val TAG = "Activity2"
        private const val DESTROY_WEBVIEW = false
    }
    private var mWebView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        
        val buttonMain = findViewById<Button>(R.id.button2)
        buttonMain.setOnClickListener {
            finish()
        }
        mWebView = findViewById<WebView>(R.id.myWebView)
    }

    override fun onDestroy() {
        if (DESTROY_WEBVIEW) {
            Log.v(TAG, "onDestroy: destroy WebView = $mWebView")
            mWebView?.apply {
                (parent as ViewGroup).removeView(mWebView)
                stopLoading()
                webChromeClient = null
                clearHistory()
                clearCache(true)
                destroy()
            }
            mWebView = null
        }
        super.onDestroy()
    }


}