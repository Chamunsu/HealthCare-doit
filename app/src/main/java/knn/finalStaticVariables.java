package knn;

import android.os.Environment;

/**
 * Created by JWY on 2014-09-14.
 * Modified by HJH on 2014-09-17.
 *
 * this comment written by HJH.
 * 각종 필수적인 상수들이 정의되어 있는 클래스이다.
 */

public class finalStaticVariables {

	public static final boolean DEBUG = false;
	//DEBUG MODE
	
	public final static int WIN_AREA_MS = 1500;	//area for window (ms)
	public final static int DUP_AREA_MS = 500;	//area for duplicated (ms)
	
//	public final static String DIR_FOLDER = "C:/Users/JoWooyeon/Documents/PushUp/";
    public final static String DIR_FOLDER = Environment.getExternalStorageDirectory() + "/Health Care/";
    public final static String ACTIVITY = "PUSH_UP";

	//for reading csv files.
	public final static int NAME_POSITION_FROM_BACK = 13; //string size + .csv
	public final static int NAME_LENTH = 9; //string size
	public final static String NAME_GYRO_9 = "gyroscope";
	public final static String NAME_ACCE_9 = "ccelation";
	
	public final static int X_DIRECTION = 1;
	public final static int Y_DIRECTION = 2;
	public final static int Z_DIRECTION = 3;
	public final static int T_DIRECTION = 4;
	
	public final static int ALL_DATA_TYPE = 100;
	public final static int ACCELERATE_DATA_TYPE = 101;
	public final static int GYROSCOPE_DATA_TYPE = 102;
	
	//for labeling
    public final static int ACTIVITY_RUNNING = 1;
    public final static int ACTIVITY_WALKING = 2;
    public final static int ACTIVITY_PUSHUP = 3;
    public final static int ACTIVITY_SITUP = 4;
    public final static int ACTIVITY_STAY_1 = 5;
    public final static int ACTIVITY_STAY_2 = 6;
    public final static int ACTIVITY_STAY_3 = 7;

	public static void debugPrintln(String printMsg){
		if(DEBUG)
			System.out.println(printMsg);
	}
}
