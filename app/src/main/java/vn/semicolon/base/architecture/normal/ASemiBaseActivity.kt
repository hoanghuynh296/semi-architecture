package vn.semicolon.base.architecture.normal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


abstract class ASemiBaseActivity : AppCompatActivity(), ISemiBaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())

    }

}
