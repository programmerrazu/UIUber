package com.rider.rider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Locale;

public class RiderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_main);

        getI18N();
    }

    private void getI18N() {

        Locale locale = Locale.getDefault();

        Log.i("TAG", "locale country " + locale.getCountry());
        Log.i("TAG", "locale displayCountry " + locale.getDisplayCountry());
        Log.i("TAG", "locale displayLanguage " + locale.getDisplayLanguage());
        Log.i("TAG", "locale language " + locale.getLanguage());
        Log.i("TAG", "locale ISO3Language " + locale.getISO3Language());
        Log.i("TAG", "locale ISO3Country " + locale.getISO3Country());
        Log.i("TAG", "locale displayName " + locale.getDisplayName());

        Locale locales = new Locale("bn", "BAN");
        Log.i("TAG", "locales country " + locales.getCountry());
        Log.i("TAG", "locales displayCountry " + locales.getDisplayCountry());
        Log.i("TAG", "locales displayLanguage " + locales.getDisplayLanguage());
        Log.i("TAG", "locales language " + locales.getLanguage());
        Log.i("TAG", "locales ISO3Language " + locales.getISO3Language());
        // Log.i("TAG", "locales ISO3Country " + locales.getISO3Country());
        Log.i("TAG", "locales displayName " + locales.getDisplayName());

    }
}