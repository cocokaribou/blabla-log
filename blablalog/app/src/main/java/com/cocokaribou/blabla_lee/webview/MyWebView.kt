package com.cocokaribou.blabla_lee.webview

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebView : WebView {

    lateinit var mWebViewClient: WebViewClient
    lateinit var mWebChromeClient: WebChromeClient

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context)
    }

    private fun initView(mContext: Context) {
        settings.apply {
            javaScriptEnabled = true
            javaScriptCanOpenWindowsAutomatically = true

            setSupportZoom(true)
            builtInZoomControls = true
            displayZoomControls = false
            textZoom = 100
        }
        mWebViewClient = MyWebViewClient(context, this)
        mWebChromeClient = MyWebChromeClient(context, this)

        webViewClient = mWebViewClient
        webChromeClient = mWebChromeClient
    }
}