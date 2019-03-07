package vn.semicolon.base.architecture.normal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class ASemiBaseFragment : Fragment(), ISemiBaseView {

    /**
     * Don't override this method if you want set view for your fragment. Use [getLayoutResId] instead
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    override fun showLoadingView(message: String?, cancelable: Boolean) {
        if (activity is ISemiBaseView) {
            (activity as ISemiBaseView).showLoadingView(message, cancelable)
        } else {
            // handle loading here
        }
    }

    override fun hideLoadingView() {
        if (activity is ISemiBaseView) {
            (activity as ISemiBaseView).hideLoadingView()
        } else {
            // handle loading here
        }
    }
}