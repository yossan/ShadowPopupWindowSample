    package io.github.yossan.popupwindowshadowing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show(v: View) {
        val helloView = layoutInflater.inflate(R.layout.hello_popup_view, null)

        val popupWindow = ShadowPopupWindow.newInstance(this, helloView)
        helloView.setOnClickListener { v ->
            popupWindow.dismiss()
        }
        popupWindow.show(v)
    }
}