package edu.cnm.deepdive.justanotherandroidproject;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }
  public void desplayMessage(View view){ // View object that gets passed to xml
    Intent passData=new Intent(this,DisplayMessageActivity.class);
    //create (intent) object (passData is the new intents name , variable for object)
    //new packageconext (points to display message) this (where we are) DisplayMessageActivity
    // is where it is going - a new activity)
    EditText EditableText = (EditText)findViewById(R.id.Editabletext); //EditText (bind statement)
    // EditableText (placeholder name) {EditText) (casing to a new object) findviewbyID(R.id)
    // (push to R.id) Editabletext is the name we just have it)
    String message =  EditableText.getText().toString();
    passData.putExtra(EXTRA_MESSAGE,message);
    startActivity(passData);


  }
}
