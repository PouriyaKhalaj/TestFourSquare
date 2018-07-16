package ir.pooriettaw.testfoursquare.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;

import ir.pooriettaw.testfoursquare.R;


public class CustomEditText extends android.support.v7.widget.AppCompatEditText {


    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomFont(context, attrs);
    }


    private void setCustomFont(Context ctx, AttributeSet attrs) {
//        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
//        String customFont = a.getString(R.styleable.CustomTextView_font_type_face);
        setCustomFont(ctx, "");
//        a.recycle();

//        setupWatcher();
    }


    public boolean setCustomFont(Context ctx, String asset) {
        Typeface tf = null;
        try {
            if (asset != null)
                tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + asset);
            else
                tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/IRANSans-Light.ttf");
        } catch (Exception e) {
            Log.e("CustomControls", "Could not get typeface: " + e.getMessage());
            return false;
        }

        setTypeface(tf);
        return true;
    }


}
