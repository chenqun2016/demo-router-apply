package com.example.demo_router_use

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chenchen.router.annotations.Destination

@Destination(
    url = "router://test-page",
    destination = "测试页面"
)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}