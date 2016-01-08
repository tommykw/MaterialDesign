package tokyo.tommykw.viewpager.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tokyo.tommykw.viewpager.R

/**
 * Created by tommy on 15/12/20.
 */
class ScreenSlidePageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_screen_slide, container, false) as ViewGroup
        return rootView
    }
}
