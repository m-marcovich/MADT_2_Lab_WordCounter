 package com.example.madt_2_lab_wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

 public class MainActivity extends AppCompatActivity {

    private EditText edTextInput;
    private TextView tvResult;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edTextInput=findViewById(R.id.edTextInput);
        this.tvResult=findViewById(R.id.tvResult);

        this.spinner = (Spinner) findViewById(R.id.spCountOption);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinner.setAdapter(adapter);
    }


     public void btnCountClick(View view) {
         String selectionChars = getResources().getString(R.string.selection_chars);

         String TextInput = this.edTextInput.getText().toString();
         Log.i("UserText", TextInput);
         if (TextInput.trim().isEmpty()) {
             Toast.makeText(this, "Error:Text is empty", Toast.LENGTH_SHORT).show();
         } else {
             if (this.spinner.getSelectedItem().toString().equalsIgnoreCase(selectionChars)) {

                 int count = CounterWord.getCharsCount(TextInput);
                 Log.i("UserTextCount", String.valueOf(count));

                 this.tvResult.setText(String.valueOf(count));
             } else {
                 int count = CounterWord.getWordsCount(TextInput);
                 Log.i("UserTextCount", String.valueOf(count));

                 this.tvResult.setText(String.valueOf(count));
             }
         }
     }
 }