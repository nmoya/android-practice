package com.example.nmoya.changeactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nmoya on 7/13/15.
 */
public class SecondActivity extends Activity {

    private TextView name_label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        name_label = (TextView) findViewById(R.id.given_name_label);


        Intent activityThatCalled = getIntent();

        String enteredName = activityThatCalled.getExtras().getString("name");
        name_label.setText(enteredName);

    }
    public void handleReturn(View view) {

        Intent goBack = new Intent();

        goBack.putExtra("previous", "SecondActivity");

        setResult(RESULT_OK, goBack);
        finish();

    }

}
