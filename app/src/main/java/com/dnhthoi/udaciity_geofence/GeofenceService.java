package com.dnhthoi.udaciity_geofence;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by ant on 26/11/2015.
 */
public class GeofenceService extends IntentService {
    private static final String TAG = GeofenceService.class.getName();

    public  GeofenceService(){
        super(TAG);
    }
    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
