package com.deltarobotics9351.deltadrive.utils

import org.firstinspires.ftc.robotcore.internal.opmode.OpModeManagerImpl
import org.firstinspires.ftc.robotcore.internal.system.AppUtil

object Robot {

    fun getOpModeManager() = OpModeManagerImpl.getOpModeManagerOfActivity(AppUtil.getInstance().rootActivity)

    fun getCurrentOpMode() = getOpModeManager().activeOpMode

    fun getCurrentOpModeName() = getOpModeManager().activeOpModeName

    fun getHardwareMap() = getOpModeManager().hardwareMap

}