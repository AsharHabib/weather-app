package com.example.forecast;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentWeather {
    private String locationLabel;
    private String icon;
    private long time;
    private double temperature;
    private double humidity;
    private double precipChance;
    private String summary;
    private String timeZone;
    private int isDay;

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLocationLabel() {
        return locationLabel;
    }

    public void setLocationLabel(String locationLabel) {
        this.locationLabel = locationLabel;
    }

    public String getIcon() {
        return icon;
    }

    public int getIconId() {
        int iconId = R.drawable.blizzard;
        if (isDay == 1) {
            switch (summary) {
                case "Sunny":
                    iconId = R.drawable.clear;
                    break;
                case "Partly Cloudy":
                    iconId = R.drawable.partlycloudy;
                    break;
                case "Cloudy":
                    iconId = R.drawable.cloudy;
                    break;
                case "Overcast":
                    iconId = R.drawable.overcast;
                    break;
                case "Mist":
                    iconId = R.drawable.mist;
                    break;
                case "Patchy rain possible":
                    iconId = R.drawable.patchyrainpossible;
                    break;
                case "Patchy snow possible":
                    iconId = R.drawable.patchysnowpossible;
                    break;
                case "Patchy sleet possible":
                    iconId = R.drawable.patchysleetpossible;
                    break;
                case "Patchy freezing drizzle possible":
                    iconId = R.drawable.patchyfreezingdrizzlepossible;
                    break;
                case "Thundery outbreaks possible":
                    iconId = R.drawable.thunderyoutbreakspossible;
                    break;
                case "Blowing snow":
                    iconId = R.drawable.blowingsnow;
                    break;
                case "Blizzard":
                    iconId = R.drawable.blizzard;
                    break;
                case "Fog":
                    iconId = R.drawable.fog;
                    break;
                case "Freezing fog":
                    iconId = R.drawable.freezingfog;
                    break;
                case "Patchy light drizzle":
                    iconId = R.drawable.patchylightdrizzle;
                    break;
                case "Light drizzle":
                    iconId = R.drawable.lightdrizzle;
                    break;
                case "Freezing drizzle":
                    iconId = R.drawable.freezingdrizzle;
                    break;
                case "Heavy freezing drizzle":
                    iconId = R.drawable.heavyfreezingdrizzle;
                    break;
                case "Patchy light rain":
                    iconId = R.drawable.patchylightrain;
                    break;
                case "Light rain":
                    iconId = R.drawable.lightrain;
                    break;
                case "Moderate rain at times":
                    iconId = R.drawable.moderaterainattimes;
                    break;
                case "Moderate rain":
                    iconId = R.drawable.moderaterain;
                    break;
                case "Heavy rain at times":
                    iconId = R.drawable.heavyrainattimes;
                    break;
                case "Heavy rain":
                    iconId = R.drawable.heavyrain;
                    break;
                case "Light freezing rain":
                    iconId = R.drawable.lightfreezingrain;
                    break;
                case "Moderate or heavy freezing rain":
                    iconId = R.drawable.moderateorheavyfreezingrain;
                    break;
                case "Light sleet":
                    iconId = R.drawable.lightsleet;
                    break;
                case "Moderate or heavy sleet":
                    iconId = R.drawable.moderateorheavysleet;
                    break;
                case "Patchy light snow":
                    iconId = R.drawable.patchylightsnow;
                    break;
                case "Light snow":
                    iconId = R.drawable.lightsnow;
                    break;
                case "Patchy moderate snow":
                    iconId = R.drawable.patchymoderatesnow;
                    break;
                case "Moderate snow":
                    iconId = R.drawable.moderatesnow;
                    break;
                case "Patchy heavy snow":
                    iconId = R.drawable.patchyheavysnow;
                    break;
                case "Heavy snow":
                    iconId = R.drawable.heavysnow;
                    break;
                case "Ice pellets":
                    iconId = R.drawable.icepellets;
                    break;
                case "Light rain shower":
                    iconId = R.drawable.lightrainshower;
                    break;
                case "Moderate or heavy rain shower":
                    iconId = R.drawable.moderateorheavyrainshower;
                    break;
                case "Torrential rain shower":
                    iconId = R.drawable.torrentialrainshower;
                    break;
                case "Light sleet showers":
                    iconId = R.drawable.lightsleetshowers;
                    break;
                case "Moderate or heavy sleet showers":
                    iconId = R.drawable.moderateorheavysleetshowers;
                    break;
                case "Light snow showers":
                    iconId = R.drawable.lightsnowshowers;
                    break;
                case "Moderate or heavy snow showers":
                    iconId = R.drawable.moderateorheavysnowshowers;
                    break;
                case "Light showers of ice pellets":
                    iconId = R.drawable.lightshowersoficepellets;
                    break;
                case "Moderate or heavy showers of ice pellets":
                    iconId = R.drawable.moderateorheavyshowersoficepellets;
                    break;
                case "Patchy light rain with thunder":
                    iconId = R.drawable.patchylightrainwiththunder;
                    break;
                case "Moderate or heavy rain with thunder":
                    iconId = R.drawable.moderateorheavyrainwiththunder;
                    break;
                case "Patchy light snow with thunder":
                    iconId = R.drawable.patchylightsnowwiththunder;
                    break;
                case "Moderate or heavy snow with thunder":
                    iconId = R.drawable.moderateorheavysnowwiththunder;
                    break;
            }
        } else {
            switch (summary) {
                case "Clear":
                    iconId = R.drawable.clearnight;
                    break;
                case "Partly Cloudy":
                    iconId = R.drawable.partlycloudynight;
                    break;
                case "Cloudy":
                    iconId = R.drawable.cloudynight;
                    break;
                case "Overcast":
                    iconId = R.drawable.overcastnight;
                    break;
                case "Mist":
                    iconId = R.drawable.mistnight;
                    break;
                case "Patchy rain possible":
                    iconId = R.drawable.patchyrainpossiblenight;
                    break;
                case "Patchy snow possible":
                    iconId = R.drawable.patchysnowpossiblenight;
                    break;
                case "Patchy sleet possible":
                    iconId = R.drawable.patchysleetpossiblenight;
                    break;
                case "Patchy freezing drizzle possible":
                    iconId = R.drawable.patchyfreezingdrizzlepossiblenight;
                    break;
                case "Thundery outbreaks possible":
                    iconId = R.drawable.thunderyoutbreakspossiblenight;
                    break;
                case "Blowing snow":
                    iconId = R.drawable.blowingsnownight;
                    break;
                case "Blizzard":
                    iconId = R.drawable.blizzardnight;
                    break;
                case "Fog":
                    iconId = R.drawable.fognight;
                    break;
                case "Freezing fog":
                    iconId = R.drawable.freezingfognight;
                    break;
                case "Patchy light drizzle":
                    iconId = R.drawable.patchylightdrizzlenight;
                    break;
                case "Light drizzle":
                    iconId = R.drawable.lightdrizzlenight;
                    break;
                case "Freezing drizzle":
                    iconId = R.drawable.freezingdrizzlenight;
                    break;
                case "Heavy freezing drizzle":
                    iconId = R.drawable.heavyfreezingdrizzlenight;
                    break;
                case "Patchy light rain":
                    iconId = R.drawable.patchylightrainnight;
                    break;
                case "Light rain":
                    iconId = R.drawable.lightrainnight;
                    break;
                case "Moderate rain at times":
                    iconId = R.drawable.moderaterainattimesnight;
                    break;
                case "Moderate rain":
                    iconId = R.drawable.moderaterainnight;
                    break;
                case "Heavy rain at times":
                    iconId = R.drawable.heavyrainattimesnight;
                    break;
                case "Heavy rain":
                    iconId = R.drawable.heavyrainnight;
                    break;
                case "Light freezing rain":
                    iconId = R.drawable.lightfreezingrainnight;
                    break;
                case "Moderate or heavy freezing rain":
                    iconId = R.drawable.moderateorheavyfreezingrainnight;
                    break;
                case "Light sleet":
                    iconId = R.drawable.lightsleetnight;
                    break;
                case "Moderate or heavy sleet":
                    iconId = R.drawable.moderateorheavysleetnight;
                    break;
                case "Patchy light snow":
                    iconId = R.drawable.patchylightsnownight;
                    break;
                case "Light snow":
                    iconId = R.drawable.lightsnownight;
                    break;
                case "Patchy moderate snow":
                    iconId = R.drawable.patchymoderatesnownight;
                    break;
                case "Moderate snow":
                    iconId = R.drawable.moderatesnownight;
                    break;
                case "Patchy heavy snow":
                    iconId = R.drawable.patchyheavysnownight;
                    break;
                case "Heavy snow":
                    iconId = R.drawable.heavysnownight;
                    break;
                case "Ice pellets":
                    iconId = R.drawable.icepelletsnight;
                    break;
                case "Light rain shower":
                    iconId = R.drawable.lightrainshowernight;
                    break;
                case "Moderate or heavy rain shower":
                    iconId = R.drawable.moderateorheavyrainshowernight;
                    break;
                case "Torrential rain shower":
                    iconId = R.drawable.torrentialrainshowernight;
                    break;
                case "Light sleet showers":
                    iconId = R.drawable.lightsleetshowersnight;
                    break;
                case "Moderate or heavy sleet showers":
                    iconId = R.drawable.moderateorheavysleetshowersnight;
                    break;
                case "Light snow showers":
                    iconId = R.drawable.lightsnowshowersnight;
                    break;
                case "Moderate or heavy snow showers":
                    iconId = R.drawable.moderateorheavysnowshowersnight;
                    break;
                case "Light showers of ice pellets":
                    iconId = R.drawable.lightshowersoficepelletsnight;
                    break;
                case "Moderate or heavy showers of ice pellets":
                    iconId = R.drawable.moderateorheavyshowersoficepelletsnight;
                    break;
                case "Patchy light rain with thunder":
                    iconId = R.drawable.patchylightrainwiththundernight;
                    break;
                case "Moderate or heavy rain with thunder":
                    iconId = R.drawable.moderateorheavyrainwiththundernight;
                    break;
                case "Patchy light snow with thunder":
                    iconId = R.drawable.patchylightsnowwiththundernight;
                    break;
                case "Moderate or heavy snow with thunder":
                    iconId = R.drawable.moderateorheavysnowwiththundernight;
                    break;
            }
        }
        return iconId;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public CurrentWeather() {

    }

    public CurrentWeather(String locationLabel, String icon, long time, double temperature,
                          double humidity, double precipChance, String summary, String timeZone, int isDay) {
        this.locationLabel = locationLabel;
        this.icon = icon;
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipChance = precipChance;
        this.summary = summary;
        this.timeZone = timeZone;
        this.isDay = isDay;
    }

    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("weathersummary.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public long getTime() {
        return time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(timeZone));
        Date dateTime = new Date(time*1000);
        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipChance() {
        return precipChance;
    }

    public void setPrecipChance(double precipChance) {
        this.precipChance = precipChance;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
