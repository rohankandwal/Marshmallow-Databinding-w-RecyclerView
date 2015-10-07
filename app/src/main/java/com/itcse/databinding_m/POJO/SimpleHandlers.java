package com.itcse.databinding_m.POJO;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Class used for processing view clicks. For now, the isAgeEven function will be called when user clicks on Age.
 */
public class SimpleHandlers {

    /**
     * Function to determine whether an age is odd or even.
     * @param view View which performed the click event
     */
    public boolean isAgeEven( @NonNull final View view) {
        if (view instanceof TextView) {
            final TextView tvAge = (TextView) view;
            final boolean isEven = Integer.parseInt(tvAge.getText().toString()) % 2 == 0;
            if (isEven) {
                Toast.makeText(view.getContext(), "Age is even", Toast.LENGTH_SHORT).show();
                return true;
            } else {
                Toast.makeText(view.getContext(), "Age is odd", Toast.LENGTH_SHORT).show();
            }
        }
        return false;
    }
}
