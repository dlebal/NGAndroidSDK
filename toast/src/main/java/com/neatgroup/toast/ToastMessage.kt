package com.neatgroup.toast

import android.content.Context
import android.widget.Toast



class ToastMessage {

    fun s(context: Context, message: String) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    }

}