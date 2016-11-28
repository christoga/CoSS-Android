package id.codingsmartschool.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClickedAbout(View view) {

        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);

    }

    public void onButtonClickedSelection(View view) {

        Intent intent = new Intent(this, SelectionActivity.class);
        startActivity(intent);

    }

    public void onButtonClickedCurriculum(View view) {

        Intent intent = new Intent(this, CurriculumActivity.class);
        startActivity(intent);

    }
    public void onButtonClickedPlace(View view) {

        Intent intent = new Intent(this, PlaceActivity.class);
        startActivity(intent);

    }
}