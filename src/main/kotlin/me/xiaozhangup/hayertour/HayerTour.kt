package me.xiaozhangup.hayertour

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object HayerTour : Plugin() {

    override fun onEnable() {
        info("Successfully running ExamplePlugin!")
    }
}