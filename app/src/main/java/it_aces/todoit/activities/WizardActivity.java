package it_aces.todoit.activities;

import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro2;

import it_aces.todoit.fragments.FirstSlide;

public class WizardActivity extends AppIntro2 {

    @Override
    public void init(Bundle bundle) {
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new FirstSlide(), getApplicationContext());

        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onDonePressed() {
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }


}
