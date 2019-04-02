package xyz.mlumeau.kosmos.kore

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import platform.UIKit.UIDevice

actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}

fun showHelloCoroutine() {
    MainScope().launch {
        helloCoroutine()
    }
}

actual fun getNetworkScope() = MainScope() as CoroutineScope
