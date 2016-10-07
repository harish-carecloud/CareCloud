package chgeurifirstprogram.texttospeak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button spkbtn;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spkbtn=(Button)findViewById(R.id.button_speak);
        input=(EditText)findViewById(R.id.text_name);


    }
}
