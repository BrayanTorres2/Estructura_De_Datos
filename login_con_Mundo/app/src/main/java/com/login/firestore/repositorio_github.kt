package com.login.firestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class repositorio_github : AppCompatActivity() {
    // https://developer.android.com/guide/webapps/webview
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositorio_github)
        val myWebView: WebView = findViewById(R.id.webview_arg)
        myWebView.loadUrl("https://github.com/BrayanTorres2/Estructura_De_Datos")

    }

}