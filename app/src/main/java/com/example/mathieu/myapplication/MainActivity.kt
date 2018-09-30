package com.example.mathieu.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables declaration
        private TextView mGreetingText;
        private button mPlayButton;
        private EditText mNameInput;

        mGreetingText = (TextView) findViewById(R.id.welcome_text_name_chosen);
        mPlayButton = (Button) findViewById(R.id.welcome_play_btn);
        mNameInput = (EditText) findViewById(R.id.welcome_name_chosen_input);


        mPlayButton.setEnabled(false);

       mNameInput.addTextChangedListener(new TextWatcher(){


       });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
