package it_aces.todoit.activities;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro2;

import it_aces.todoit.fragments.FirstSlide;
import it_aces.todoit.fragments.FourthSlide;
import it_aces.todoit.fragments.SecondSlide;
import it_aces.todoit.fragments.ThirdSlide;

public class WizardActivity extends AppIntro2 {

    @Override
    public void init(Bundle bundle) {
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new SecondSlide(), getApplicationContext());
        addSlide(new ThirdSlide(), getApplicationContext());
        addSlide(new FourthSlide(), getApplicationContext());

        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onDonePressed() {
        finish();
        Intent signInIntent = new Intent(this, SignInActivity.class);
        startActivity(signInIntent);
    }


}
