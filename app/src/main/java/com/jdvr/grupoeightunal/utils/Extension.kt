package com.jdvr.grupoeightunal

import android.util.Patterns

fun CharSequence?.isValidEmail() = !this.isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()