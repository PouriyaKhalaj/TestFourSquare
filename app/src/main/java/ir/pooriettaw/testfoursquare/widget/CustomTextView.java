package ir.pooriettaw.testfoursquare.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;

import ir.pooriettaw.testfoursquare.R;


/**
 * Created by user on 6/13/15 AD.
 */
public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    private TextWatcher watcher;

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomFont(context, attrs);
    }

    private void setCustomFont(Context ctx, AttributeSet attrs) {
//        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
//        String customFont = a.getString(R.styleable.CustomTextView_font_type_face);
        setCustomFont(ctx, "");
//        a.recycle();
    }

//    public boolean setCustomFont(Context ctx, String asset) {
//
//
//        Typeface tf = null;
//        try {
//            if (asset != null)
//                tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + asset);
//            else
//                tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + BasicConstants.CURRENT_FONT_NAME.getValue());
//        } catch (Exception e) {
//            Log.e("CustomControls", "Could not get typeface: " + e.getMessage());
//            return false;
//        }
//
//        setTypeface(tf);
//        return true;
//    }

    private static LruCache<String, Typeface> sTypefaceCache = new LruCache<String, Typeface>(12);
    private static String NAME = "MaterialIcons-Regular.ttf";

    public boolean setCustomFont(Context ctx, String asset) {
        if (!TextUtils.isEmpty(asset)) {
            NAME = asset;
        }
        Typeface typeface = sTypefaceCache.get(NAME);
        try {
            if (typeface == null) {
                if (asset != null)
                    typeface = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + asset);
                else
                    typeface = Typeface.createFromAsset(ctx.getAssets(), "fonts/IRANSans-Light.ttf");
                sTypefaceCache.put(NAME, typeface);
            }
        } catch (Exception e) {
            return false;
        }
        setTypeface(typeface);
        return true;
    }


    private void setupWatcher() {
        watcher = new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                CustomTextView.this.removeTextChangedListener(watcher);
                //do somthings.
                CustomTextView.this.setText(s.toString()
                        .replace("0", "۰")
                        .replace("1", "۱")
                        .replace("2", "۲")
                        .replace("3", "۳")
                        .replace("4", "۴")
                        .replace("5", "۵")
                        .replace("6", "۶")
                        .replace("7", "۷")
                        .replace("8", "۸")
                        .replace("9", "۹")
                );
                //
                CustomTextView.this.addTextChangedListener(watcher);

            }
        };
        CustomTextView.this.addTextChangedListener(watcher);
    }


}