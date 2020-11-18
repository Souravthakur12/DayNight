package abvgiet.library.daynight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    View daysky,nightsky,boyday,boynight;
    ImageView day,night;
    DayNightSwitch dayNightSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        day = findViewById(R.id.day_landscape);
        night = findViewById(R.id.night_landscape);
        daysky = findViewById(R.id.day_bg);
        nightsky = findViewById(R.id.night_bg);
        boyday = findViewById(R.id.boy_day);
        boynight = findViewById(R.id.boy_night);
        dayNightSwitch = findViewById(R.id.day_night_button);


      dayNightSwitch.setListener(new DayNightSwitchListener() {
          @Override
          public void onSwitch(boolean is_night) {
              if (is_night){
                  day.animate().alpha(0).setDuration(1300);
                  boyday.animate().alpha(0).setDuration(1300);
                  daysky.animate().alpha(0).setDuration(1300);

              }
              else {
                  day.animate().alpha(1).setDuration(1300);
                  boyday.animate().alpha(1).setDuration(1300);
                  daysky.animate().alpha(1).setDuration(1300);

              }
          }
      });


    }
}