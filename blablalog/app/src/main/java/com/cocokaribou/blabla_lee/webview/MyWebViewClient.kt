package com.cocokaribou.blabla_lee.webview

import android.content.Context
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient(
    private val mContext: Context, private val mWebView: WebView
) :
    WebViewClient() {
}