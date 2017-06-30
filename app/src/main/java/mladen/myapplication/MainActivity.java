package mladen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOutputText;
    private EditText etInputText;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutputText = (TextView) findViewById(R.id.textView);
        etInputText = (EditText) findViewById(R.id.editText);
        btnOK = (Button) findViewById(R.id.button);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutputText.setText(etInputText.getText().toString());
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
