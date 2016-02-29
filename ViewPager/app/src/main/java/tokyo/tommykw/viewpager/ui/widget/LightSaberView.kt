package tokyo.tommykw.viewpager.ui.widget

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.Color.BLUE
import android.util.AttributeSet
import android.view.View
import tokyo.tommykw.viewpager.R

/**
 * This view is light saber view extend View
 */
class LightSaberView : View {
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setup(context, attrs)
    }

    private fun setup(context: Context, attrs: AttributeSet) {
        val ta = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.LightSaberView,
                0,
                0
        )

        try {
            val isMaceWindou = ta.getBoolean(R.styleable.LightSaberView_isMaceWindu, false)
            val force = ta.getInteger(R.styleable.LightSaberView_force, 0);
            setBackgroundColor(isMaceWindou, force)
        } finally {
            ta.recycle()
        }
    }

    private fun setBackgroundColor(isMaceWindou: Boolean, force: Int) {
        var color = Color.WHITE

        when (isMaceWindou) {
            true -> color = Color.MAGENTA
            false -> if (force == 0) color = BLUE else color = Color.RED
        }

        setBackgroundColor(color)
    }
}