package vn.semicolon.base.architecture.mvp

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

abstract class ASemiMVPPresenter<V>(view: V) : LifecycleObserver {
    private val TAG = "ASemiMVPPresenter"

    protected var view: V? = view
        get() {
            if (field == null) Log.w(
                TAG, "View reference in your presenter is null. Review your code if you call" +
                        "view function when it has been release by GC"
            )
            return field
        }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    open fun onViewPaused() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    open fun onViewResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    open fun onViewCreated() {

    }

    /**
     * Release reference of view to GC collect it ASAP
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    open fun onViewDestroyed() {
        view = null
    }

}
