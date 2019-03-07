package vn.semicolon.base.architecture.normal

import androidx.annotation.LayoutRes

/**
 * Interface for base fragment and activity
 */
interface ISemiBaseView {

    fun showLoadingView(message: String? = null, cancelable: Boolean = false)
    fun hideLoadingView()
    @LayoutRes
    fun getLayoutResId(): Int
}

