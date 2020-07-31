package com.example.forecast.databinding;
import com.example.forecast.R;
import com.example.forecast.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.degreeImageView, 6);
        sViewsWithIds.put(R.id.locationValue, 7);
        sViewsWithIds.put(R.id.iconImageView, 8);
        sViewsWithIds.put(R.id.guideline2, 9);
        sViewsWithIds.put(R.id.guideline3, 10);
        sViewsWithIds.put(R.id.humidityLabel, 11);
        sViewsWithIds.put(R.id.precipLabel, 12);
        sViewsWithIds.put(R.id.weatherAPIAttribution, 13);
        sViewsWithIds.put(R.id.imageView3, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[13]
            );
        this.humidityValue.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.precipValue.setTag(null);
        this.summaryValue.setTag(null);
        this.temperatureValue.setTag(null);
        this.timeValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.weather == variableId) {
            setWeather((com.example.forecast.CurrentWeather) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWeather(@Nullable com.example.forecast.CurrentWeather Weather) {
        this.mWeather = Weather;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.weather);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfWeatherFormattedTime = null;
        java.lang.String stringValueOfMathRoundWeatherPrecipChanceJavaLangString = null;
        java.lang.String javaLangStringAtStringValueOfWeatherFormattedTime = null;
        java.lang.String javaLangStringAtStringValueOfWeatherFormattedTimeJavaLangStringItWas = null;
        com.example.forecast.CurrentWeather weather = mWeather;
        double weatherPrecipChance = 0.0;
        java.lang.String weatherSummary = null;
        long mathRoundWeatherTemperature = 0;
        double weatherTemperature = 0.0;
        long mathRoundWeatherPrecipChance = 0;
        java.lang.String weatherFormattedTime = null;
        java.lang.String stringValueOfMathRoundWeatherTemperature = null;
        double weatherHumidity = 0.0;
        java.lang.String stringValueOfMathRoundWeatherPrecipChance = null;
        java.lang.String stringValueOfWeatherHumidity = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (weather != null) {
                    // read weather.precipChance
                    weatherPrecipChance = weather.getPrecipChance();
                    // read weather.summary
                    weatherSummary = weather.getSummary();
                    // read weather.temperature
                    weatherTemperature = weather.getTemperature();
                    // read weather.formattedTime
                    weatherFormattedTime = weather.getFormattedTime();
                    // read weather.humidity
                    weatherHumidity = weather.getHumidity();
                }


                // read Math.round(weather.precipChance)
                mathRoundWeatherPrecipChance = java.lang.Math.round(weatherPrecipChance);
                // read Math.round(weather.temperature)
                mathRoundWeatherTemperature = java.lang.Math.round(weatherTemperature);
                // read String.valueOf(weather.formattedTime)
                stringValueOfWeatherFormattedTime = java.lang.String.valueOf(weatherFormattedTime);
                // read String.valueOf(weather.humidity)
                stringValueOfWeatherHumidity = java.lang.String.valueOf(weatherHumidity);


                // read String.valueOf(Math.round(weather.precipChance))
                stringValueOfMathRoundWeatherPrecipChance = java.lang.String.valueOf(mathRoundWeatherPrecipChance);
                // read String.valueOf(Math.round(weather.temperature))
                stringValueOfMathRoundWeatherTemperature = java.lang.String.valueOf(mathRoundWeatherTemperature);
                // read ("At ") + (String.valueOf(weather.formattedTime))
                javaLangStringAtStringValueOfWeatherFormattedTime = ("At ") + (stringValueOfWeatherFormattedTime);


                // read (String.valueOf(Math.round(weather.precipChance))) + (" %")
                stringValueOfMathRoundWeatherPrecipChanceJavaLangString = (stringValueOfMathRoundWeatherPrecipChance) + (" %");
                // read (("At ") + (String.valueOf(weather.formattedTime))) + (" it was")
                javaLangStringAtStringValueOfWeatherFormattedTimeJavaLangStringItWas = (javaLangStringAtStringValueOfWeatherFormattedTime) + (" it was");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.humidityValue, stringValueOfWeatherHumidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.precipValue, stringValueOfMathRoundWeatherPrecipChanceJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.summaryValue, weatherSummary);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.temperatureValue, stringValueOfMathRoundWeatherTemperature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeValue, javaLangStringAtStringValueOfWeatherFormattedTimeJavaLangStringItWas);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): weather
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}