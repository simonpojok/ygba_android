package org.ygba.youthgobudget.dialogs

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.ygba.youthgobudget.R

class SuccessActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)


    }

    override fun onDestroy() {
        val intent = Intent()
        intent.putExtra("saved", "saved")
        setResult(RESULT_OK, intent)
        super.onDestroy()
    }
}