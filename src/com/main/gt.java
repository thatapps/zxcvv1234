package com.main;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class gt implements SensorEventListener {
	public void onAccuracyChanged(Sensor paramSensor, int paramInt) {
	}

	public void onSensorChanged(SensorEvent sensorEvent) {
		if (sensorEvent.sensor == gs.b()) {
			gs.a(gt.this);
		} else if (sensorEvent.sensor == gs.c()) {
			gs.b(null);
		}
		gs.a(this);
	}
}
