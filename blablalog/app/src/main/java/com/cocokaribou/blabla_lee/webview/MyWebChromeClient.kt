package com.cocokaribou.blabla_lee.webview

import android.content.Context
import android.webkit.WebChromeClient
import android.webkit.WebView

class MyWebChromeClient(private val mContext: Context, private val mWebView: WebView) :
    WebChromeClient() {
}