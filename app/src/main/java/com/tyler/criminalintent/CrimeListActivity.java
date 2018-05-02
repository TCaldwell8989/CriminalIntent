package com.tyler.criminalintent;

import android.support.v4.app.Fragment;

//CrimeListActivity is a Controller.
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}