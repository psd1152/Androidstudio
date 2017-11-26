package com.example.android.miwok;
import android.view.View;
import android.widget.Toast;

/**
 * Created by 11527 on 2017/11/26.
 */

public class NumbersClickListenner implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"open the list of numbers ",Toast.LENGTH_SHORT).show();
    }
}
