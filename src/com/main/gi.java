package com.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

public final class gi
{

    private Context a;
    private SharedPreferences b;

    public gi(Context context)
    {
        a = context;
    }

    public gi(Context context, String s)
    {
        this(context);
        a(s);
    }

    public void a()
    {
        try
        {
            a = null;
            b = null;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void a(int i, long l)
    {
		android.content.SharedPreferences.Editor editor = null;
//label0:
       // {
            if (b != null)
            {
                editor = b.edit();
                editor.putLong((new StringBuilder()).append("").append(i).toString(), l);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                    
                }
                editor.apply();
            }
          
        //}
        editor.commit();
    }

    public void a(int i, String s)
    {
        android.content.SharedPreferences.Editor editor = null;
//label0:
        //{
            if (b != null)
            {
                editor = b.edit();
                editor.putString((new StringBuilder()).append("").append(i).toString(), s);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                    
                }
                editor.apply();
            }
            
        //}
        editor.commit();
    }

    public void a(int i, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = null;
//label0:
       // {
            if (b != null)
            {
                editor = b.edit();
                editor.putBoolean((new StringBuilder()).append("").append(i).toString(), flag);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                   
                }
                editor.apply();
            }
            
       //}
        editor.commit();
    }

    public void a(String s)
    {
        Context context;
        if (a == null)
        {
           // break MISSING_BLOCK_LABEL_32;
        }
        context = a;
        byte byte0;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        b = context.getSharedPreferences(s, byte0);
        
        
    }

    public void a(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = null;
//label0:
       // {
            if (b != null)
            {
                editor = b.edit();
                editor.putInt(s, i);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                   /// break label0;
                }
                editor.apply();
            }
           
        //}
        editor.commit();
    }

    public void a(String s, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = null;
//label0:
       // {
            if (b != null)
            {
                editor = b.edit();
                editor.putBoolean(s, flag);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                  //  break label0;
                }
                editor.apply();
            }
           
       // }
        editor.commit();
    }

    public boolean a(int i)
    {
        if (b == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = b.contains((new StringBuilder()).append("").append(i).toString());
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public int b(String s, int i)
    {
        int j = i;
        if (b != null)
        {
            j = i;
            try
            {
                if (b.contains(s))
                {
                    j = b.getInt(s, i);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
               // s.printStackTrace();
                return i;
            }
        }
        return j;
    }

    public long b(int i, long l)
    {
        long l1 = l;
        if (a(i))
        {
            try
            {
                l1 = b.getLong((new StringBuilder()).append("").append(i).toString(), 0L);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return l;
            }
        }
        return l1;
    }

    public String b(int i, String s)
    {
        String s1 = s;
        if (a(i))
        {
            try
            {
                s1 = b.getString((new StringBuilder()).append("").append(i).toString(), s);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return s;
            }
        }
        return s1;
    }

    public void b(String s)
    {
        if (b != null && b.contains(s))
        {
            b.edit().remove(s);
        }
    }

    public boolean b(int i, boolean flag)
    {
        boolean flag1 = flag;
        SharedPreferences sharedpreferences;
        if (!a(i))
        {
            //b/reak MISSING_BLOCK_LABEL_54;
        }
        sharedpreferences = b;
        flag1 = flag;
        if (sharedpreferences != null)
        {
            try
            {
                flag1 = b.getBoolean((new StringBuilder()).append("").append(i).toString(), flag);
            }
            catch (Exception exception)
            {
                try
                {
                    exception.printStackTrace();
                }
                catch (Exception exception1)
                {
                    exception1.printStackTrace();
                    return flag;
                }
                return flag;
            }
        }
        return flag1;
    }

    public boolean b(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (b != null)
        {
            flag1 = flag;
            try
            {
                if (b.contains(s))
                {
                    flag1 = b.getBoolean(s, flag);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
               // s.printStackTrace();
                return flag;
            }
        }
        return flag1;
    }
}
