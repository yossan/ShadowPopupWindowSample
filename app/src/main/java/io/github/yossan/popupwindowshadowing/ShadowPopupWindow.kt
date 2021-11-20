package io.github.yossan.popupwindowshadowing

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.PopupWindow

class ShadowPopupWindow(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {
    companion object {
        fun newInstance(context: Context, contentView: View): ShadowPopupWindow {
            return (inflate(context, R.layout.shadow_popup_window2, null) as ShadowPopupWindow).apply {
                findViewById<FrameLayout>(R.id.shadow_popup_window_content).addView(contentView)
            }
        }
    }

    private val popupWindow: PopupWindow by lazy {
        PopupWindow(context).apply {
            contentView = this@ShadowPopupWindow
           setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
    }

    fun show(anchor: View) {
        popupWindow.showAsDropDown(anchor)
    }

    fun dismiss() {
        popupWindow.dismiss()
    }
}