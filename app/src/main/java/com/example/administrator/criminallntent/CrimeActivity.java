package com.example.administrator.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/1/26.
 */
public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}
