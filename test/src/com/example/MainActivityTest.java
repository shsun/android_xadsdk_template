package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.AdSDKTestRunner;

import android.widget.TextView;

// Use our custom TestRunner!
@RunWith(com.AdSDKTestRunner.class)
public class MainActivityTest {

    /*
    @Test
    public void friendlyMessageTest() {

        // Create a new MainActivity.
        MainActivity activity = new MainActivity();

        // Invoke the Activity's onCreate(Bundle).
        activity.onCreate(null);

        // Get the TextViewproject from the Activity.
        TextView textView = (TextView) activity.findViewById(R.id.id_txt);

        // Get the message from the TextView.
        String message = textView.getText().toString();

        // Make sure it starts with "Hello".
        assertTrue(message.startsWith("Hello"));
    }*/
    
    
    @Test
    public void test_equal() {
        assertTrue(true);
    }
}