package myactivity.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.llw.demo_neihangdzi.MainActivity;
import com.example.llw.demo_neihangdzi.R;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backOne;

    private void assignViews() {
        backOne = (Button) findViewById(R.id.back_one);
        backOne.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        assignViews();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_one:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
