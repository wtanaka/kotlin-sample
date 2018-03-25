package com.wtanaka.kotlinsample

/**
 * This is a sample file in the project.
 */
class SampleFile private constructor() {
    companion object {
        /**
         * This is the main function.
         */
        @Suppress("UnusedPrivateMember")
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")
        }
    }
}
