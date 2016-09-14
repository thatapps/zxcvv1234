/*
 * FileName:	PhoneUtil.java
 * Copyright:	ç‚«å½©äº’åŠ¨ç½‘ç»œç§‘æŠ€æœ‰é™�å…¬å�¸
 * Author: 		Kyson
 * Description:	<æ–‡ä»¶æ��è¿°>
 * History:		2014-8-18 1.00 åˆ�å§‹ç‰ˆæœ¬
 */
package com.lazyswipe.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build;

/**
 * æ‰‹æœºç›¸å…³å·¥å…·<åŠŸèƒ½ç®€è¿°> <Br>
 * <åŠŸèƒ½è¯¦ç»†æ��è¿°> <Br>
 * 
 * @author Kyson
 */
public class PhoneMemoryUtil {
    /**
     * é‡Šæ”¾æ‰‹æœºå†…å­˜ï¼Œæ¸…ç�†ç¼“å­˜ <åŠŸèƒ½ç®€è¿°>
     * 
     * @param context
     */
    public static void releaseMemory(Context context) {
        ActivityManager activityManger = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> list = activityManger
                .getRunningAppProcesses();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ActivityManager.RunningAppProcessInfo apinfo = list.get(i);
                String[] pkgList = apinfo.pkgList;
                if (apinfo.importance > ActivityManager.RunningAppProcessInfo.IMPORTANCE_SERVICE
                        /*&& !apinfo.processName.equals("com.tt.realeasememory")*/) {
                    for (int j = 0; j < pkgList.length; j++) {
                        if (Build.VERSION.SDK_INT >= 8) {
                            activityManger.killBackgroundProcesses(pkgList[j]);
                        } else {
                            activityManger.restartPackage(pkgList[j]);
                        }
                    }
                }
            }
        }
    }

    /**
     * èŽ·å�–å·²ç»�ä½¿ç”¨å†…å­˜çš„ç™¾åˆ†æ¯” <åŠŸèƒ½ç®€è¿°>
     * 
     * @return
     */
    public static int getMemoryRatio(Context context) {
        long availMemory = getAvailMemory(context);
        long totalMemory = getTotalMemory(context);
        int momeryProgress = (int) ((totalMemory - availMemory) * 100 / totalMemory);
        if (momeryProgress < 0) {
            momeryProgress = 0;
        } else if (momeryProgress > 100) {
            momeryProgress = 100;
        }
        return momeryProgress;
    }

    /**
     * å¾—åˆ°å½“å‰�å�¯ç”¨å†…å­˜å¤§å°�
     * 
     * @param context
     * @return
     */
    public static long getAvailMemory(Context context) {// èŽ·å�–androidå½“å‰�å�¯ç”¨å†…å­˜å¤§å°�
        ActivityManager am = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        MemoryInfo mi = new MemoryInfo();
        am.getMemoryInfo(mi);
        return mi.availMem;// å°†èŽ·å�–çš„å†…å­˜å¤§å°�è§„æ ¼åŒ–
    }

    /**
     * å¾—åˆ°æ‰‹æœºç³»ç»Ÿå†…å­˜å¤§å°�
     * 
     * @param context
     * @return
     */
    public static long getTotalMemory(Context context) {
        String str1 = "/proc/meminfo";// ç³»ç»Ÿå†…å­˜ä¿¡æ�¯æ–‡ä»¶
        String str2;
        String[] arrayOfString;
        long initial_memory = 0;
        try {
            FileReader localFileReader = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(
                    localFileReader, 8192);
            str2 = localBufferedReader.readLine();// è¯»å�–meminfoç¬¬ä¸€è¡Œï¼Œç³»ç»Ÿæ€»å†…å­˜å¤§å°�
            arrayOfString = str2.split("\\s+");
            initial_memory = Integer.valueOf(arrayOfString[1]).intValue() * 1024;// èŽ·å¾—ç³»ç»Ÿæ€»å†…å­˜ï¼Œå�•ä½�æ˜¯KBï¼Œä¹˜ä»¥1024è½¬æ�¢ä¸ºByte
            localBufferedReader.close();
        } catch (IOException e) {
        }
        return initial_memory;// Byteè½¬æ�¢ä¸ºKBæˆ–è€…MBï¼Œå†…å­˜å¤§å°�è§„æ ¼åŒ–
    }

}
