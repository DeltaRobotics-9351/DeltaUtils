/*
 * Copyright (c) 2020 FTC Delta Robotics #9351 - Sebastian Erives
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.deltarobotics9351.deltaevent.event.timer

import com.deltarobotics9351.deltaevent.timer.TimerDataPacket
import com.deltarobotics9351.deltaevent.event.Event
import java.util.*

class TimerEvent : Event {

    private var cancelled = false

    override fun execute(arg1: Any, arg2: Any) {
        throw UnsupportedOperationException("This method is not supported in TimerEvent")
    }

    override fun execute(arg1: Any) {
        throw UnsupportedOperationException("This method is not supported in TimerEvent")
    }

    override fun execute(args: ArrayList<Any>) {
        throw UnsupportedOperationException("This method is not supported in TimerEvent")
    }

    override fun execute(args: HashMap<Any, Any>) {
        throw UnsupportedOperationException("This method is not supported in TimerEvent")
    }

    open fun cancel() {
        cancelled = true
        cancelEvent()
    }

    open fun isCancelled(): Boolean {
        return cancelled
    }

    open fun startEvent() {}

    open fun timeoutEvent() {}

    open fun cancelEvent() {}

    open fun loopEvent(evtTime: TimerDataPacket) {}


}