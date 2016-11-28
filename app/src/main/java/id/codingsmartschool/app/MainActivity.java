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

    public void onButtonClickedMeetup(View view) {

        Intent intent = new Intent(this, MeetupActivity.class);
        startActivity(intent);

    }

    public void onButtonClickedWorkshop(View view) {

        Intent intent = new Intent(this, WorkshopActivity.class);
        startActivity(intent);
    }

    public void onButtonClickedParttime(View view) {

        Intent intent = new Intent(this, PartTimeActivity.class);
        startActivity(intent);

    }

    public void onButtonClickedFulltime(View view) {

        Intent intent = new Intent(this, FullTimeActivity.class);
        startActivity(intent);
    }
}