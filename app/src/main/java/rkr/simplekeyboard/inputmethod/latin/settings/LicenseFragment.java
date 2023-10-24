/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rkr.simplekeyboard.inputmethod.latin.settings;

import android.content.Context;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.PreferenceFragment;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import rkr.simplekeyboard.inputmethod.R;
import rkr.simplekeyboard.inputmethod.compat.PreferenceManagerCompat;

/**
 * This is a helper class for an IME's settings preference fragment. It's recommended for every
 * IME to have its own settings preference fragment which inherits this class.
 */
public class LicenseFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context = getActivity();
        setPreferenceScreen(getPreferenceManager().createPreferenceScreen(
                PreferenceManagerCompat.getDeviceContext(context)));

        addPreferencesFromResource(R.xml.license_info);

//        try (InputStream inputStream = context.getAssets().open("LICENSE.txt")) {
//            String license = convertStreamToString(inputStream);
//            //getPreferenceScreen().getPreference(0).setSummary(license);
//            //((EditTextPreference)getPreferenceScreen().getPreference(0)).setText(license);
//            //getPreferenceScreen().getPreference(0).getView()
//            //((TextView)getView().findViewById(R.id.prefs_textview)).setText(license);
//        } catch (IOException e) {
//
//        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onResume() {
        super.onResume();
    }
}
