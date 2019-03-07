package vn.semicolon.base.architecture.mvp

import android.os.Bundle
import vn.semicolon.base.architecture.normal.ASemiBaseActivity

abstract class ASemiMVPActivity<P> : ASemiBaseActivity(), ISemiBaseMVPView<P> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPresenter(mPresenter, lifecycle)
    }

    override fun onDestroy() {
        super.onDestroy()
        removePresenter(mPresenter, lifecycle)
    }
}
