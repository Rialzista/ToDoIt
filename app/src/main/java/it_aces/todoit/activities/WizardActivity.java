package it_aces.todoit.activities;

import android.content.Intent;
import android.os.Bundle;

import it_aces.todoit.fragments.FirstSlide;
import it_aces.todoit.fragments.FourthSlide;
import it_aces.todoit.fragments.SecondSlide;
import it_aces.todoit.fragments.ThirdSlide;
import it_aces.todoit.wizard.AppIntro2;

public class WizardActivity extends AppIntro2 {

    @Override
    public void init(Bundle bundle) {
        addSlide(new FirstSlide());
        addSlide(new SecondSlide());
        addSlide(new ThirdSlide());
        addSlide(new FourthSlide());

        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onDonePressed() {
        finish();
        Intent signInIntent = new Intent(this, SignInActivity.class);
        startActivity(signInIntent);
    }

    @Override
    public void onSkipPressed() {

    }


}