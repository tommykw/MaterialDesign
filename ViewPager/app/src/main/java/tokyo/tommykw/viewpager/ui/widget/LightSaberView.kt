package tokyo.tommykw.viewpager.ui.widget

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import tokyo.tommykw.viewpager.R

/**
 * This view is custom view extend View
 */
class LightSaberView : View {
    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setup(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    private fun setup(context: Context, attrs: AttributeSet) {
        var ta = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.LightSaberView,
                0,
                0
        )

        try {
            val isMaceWindou = ta.getBoolean(R.styleable.LightSaberView_isMaceWindu, false)
            val force = ta.getInteger(R.styleable.LightSaberView_force, 0);
        } finally {
            ta.recycle()
        }

        setBackgroundColor(R.color.colorPrimary)
    }
}