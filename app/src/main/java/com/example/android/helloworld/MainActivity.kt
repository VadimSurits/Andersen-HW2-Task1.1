package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Main Activity", "Hello World")
    }

    //Ответы на вопросы из задания 13:

    //Question 1
    //What is the name of the layout file for the main activity?
    //Answer: activity_main.xml

    //Question 2
    //What is the name of the string resource that specifies the application's name?
    //Answer: app_name

    //Question 3
    //Which tool do you use to create a new emulator?
    //Answer: AVD Manager

    //Question 4
    //Assume that your app includes this logging statement:
    //Log.i("MainActivity", "MainActivity layout is complete");
    //You see the statement "MainActivity layout is complete" in the Logcat pane
    // if the Log level menu is set to which of the following? (Hint: multiple answers are OK.)
    //Answer: Verbose, Debug, Info.
}