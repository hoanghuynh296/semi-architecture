package vn.semicolon.base.architecture.mvp

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver

interface ISemiBaseMVPView<P> {
    var mPresenter: P

    fun addPresenter(p: P, lc: Lifecycle) {
        if (p != null) {
            if (p is LifecycleObserver) {
                lc.addObserver(p)
            } else throw Throwable("Your presenter must extend LifecycleObserver")
        }
    }

    fun removePresenter(p: P, lc: Lifecycle) {
        if (p != null && p is LifecycleObserver)
            lc.removeObserver(p as LifecycleObserver)
        else throw Throwable("Your presenter must extend LifecycleObserver")
    }
}
