package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public com.magnetadservices.facade.MagnetB4A_Facade _magnet = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _bannerpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _mrectpanel = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _nativescrollview = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Magnet.Initialize()";
mostCurrent._magnet.Initialize(mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Magnet.SetTestMode(True)";
mostCurrent._magnet.SetTestMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Activity.LoadLayout(\"tabhost\")";
mostCurrent._activity.LoadLayout("tabhost",mostCurrent.activityBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="TabHost1.AddTab(\"Banner\", \"banner\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Banner","banner");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="TabHost1.AddTab(\"MRect\", \"mrect\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"MRect","mrect");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="TabHost1.AddTab(\"Interstitial\", \"intertitial\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Interstitial","intertitial");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="TabHost1.AddTab(\"Native\", \"native\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Native","native");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _fillscrollview() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fillscrollview"))
	return (String) Debug.delegate(mostCurrent.activityBA, "fillscrollview", null);
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _adbitmap = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _samplebitmap = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _samplemainbitmap = null;
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _icon = null;
anywheresoftware.b4a.objects.ImageViewWrapper _image = null;
anywheresoftware.b4a.objects.ImageViewWrapper _indicative = null;
anywheresoftware.b4a.objects.LabelWrapper _title = null;
anywheresoftware.b4a.objects.LabelWrapper _description = null;
anywheresoftware.b4a.objects.ButtonWrapper _calltoaction = null;
anywheresoftware.b4a.objects.PanelWrapper _nativepanel = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _adindicative = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _sampledrawable = null;
anywheresoftware.b4a.objects.PanelWrapper _itempanel = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub FillScrollView";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim AdBitmap As Bitmap";
_adbitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim SampleBitmap As Bitmap";
_samplebitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim SampleMainBitmap As Bitmap";
_samplemainbitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="AdBitmap.Initialize(File.DirAssets, \"pic2.png\")";
_adbitmap.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pic2.png");
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="SampleBitmap.Initialize(File.DirAssets, \"sample.j";
_samplebitmap.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sample.jpg");
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="SampleMainBitmap.Initialize(File.DirAssets, \"samp";
_samplemainbitmap.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sample-main.jpg");
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="NativeScrollView.Panel.RemoveAllViews";
mostCurrent._nativescrollview.getPanel().RemoveAllViews();
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="NativeScrollView.Panel.Width = 100%x";
mostCurrent._nativescrollview.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="NativeScrollView.Panel.Height = 320dip * 6";
mostCurrent._nativescrollview.getPanel().setHeight((int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320))*6));
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="For i = 0 To 5";
{
final int step10 = 1;
final int limit10 = (int) (5);
for (_i = (int) (0) ; (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10)) ) {
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="Dim Icon As ImageView";
_icon = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="Dim Image As ImageView";
_image = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Dim Indicative As ImageView";
_indicative = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="Dim Title As Label";
_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Dim Description As Label";
_description = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="Dim CallToAction As Button";
_calltoaction = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Dim NativePanel As Panel";
_nativepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Dim AdIndicative As BitmapDrawable";
_adindicative = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Dim SampleDrawable As BitmapDrawable";
_sampledrawable = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="Dim ItemPanel As Panel";
_itempanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="Icon.Initialize(\"\")";
_icon.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Image.Initialize(\"\")";
_image.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="Indicative.Initialize(\"\")";
_indicative.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Title.Initialize(\"\")";
_title.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="Description.Initialize(\"\")";
_description.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="CallToAction.Initialize(\"\")";
_calltoaction.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="NativePanel.Initialize(\"\")";
_nativepanel.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="ItemPanel.Initialize(\"panel\")";
_itempanel.Initialize(mostCurrent.activityBA,"panel");
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="AdIndicative.Initialize(AdBitmap)";
_adindicative.Initialize((android.graphics.Bitmap)(_adbitmap.getObject()));
RDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="SampleDrawable.Initialize(SampleBitmap)";
_sampledrawable.Initialize((android.graphics.Bitmap)(_samplebitmap.getObject()));
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="Title.Gravity = Bit.Or(Gravity.NO_GRAVITY, Gravi";
_title.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.NO_GRAVITY,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="Indicative.Background = AdIndicative";
_indicative.setBackground((android.graphics.drawable.Drawable)(_adindicative.getObject()));
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="If i Mod 3 = 2 Then";
if (_i%3==2) { 
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="NativePanel.AddView(Icon, 100%x-90dip, 5dip, 60";
_nativepanel.AddView((android.view.View)(_icon.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="NativePanel.AddView(Title, 50dip, 5dip, 100%x-1";
_nativepanel.AddView((android.view.View)(_title.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="NativePanel.AddView(Indicative, 5dip, 0, 25dip,";
_nativepanel.AddView((android.view.View)(_indicative.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="NativePanel.AddView(Description, 10dip, 30dip,";
_nativepanel.AddView((android.view.View)(_description.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=720939;
 //BA.debugLineNum = 720939;BA.debugLine="NativePanel.AddView(Image, 5dip, 80dip, 100%x-3";
_nativepanel.AddView((android.view.View)(_image.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (180)));
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="NativePanel.AddView(CallToAction, 5dip, 265dip,";
_nativepanel.AddView((android.view.View)(_calltoaction.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (265)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=720942;
 //BA.debugLineNum = 720942;BA.debugLine="Magnet.BindView(Title, Description, CallToActio";
mostCurrent._magnet.BindView(mostCurrent.activityBA,(android.widget.TextView)(_title.getObject()),(android.widget.TextView)(_description.getObject()),(android.widget.Button)(_calltoaction.getObject()),(android.widget.ImageView)(_icon.getObject()),(android.widget.ImageView)(_image.getObject()),(android.widget.ImageView)(_indicative.getObject()),(android.view.ViewGroup)(_nativepanel.getObject()));
RDebugUtils.currentLine=720943;
 //BA.debugLineNum = 720943;BA.debugLine="Magnet.LoadNative(\"YourAdUnitid\", ItemPanel)";
mostCurrent._magnet.LoadNative(mostCurrent.activityBA,"YourAdUnitid",(android.view.ViewGroup)(_itempanel.getObject()));
 }else {
RDebugUtils.currentLine=720945;
 //BA.debugLineNum = 720945;BA.debugLine="Title.Text = \"عنوان\"";
_title.setText(BA.ObjectToCharSequence("عنوان"));
RDebugUtils.currentLine=720946;
 //BA.debugLineNum = 720946;BA.debugLine="Description.Text = \"توضیحات\"";
_description.setText(BA.ObjectToCharSequence("توضیحات"));
RDebugUtils.currentLine=720947;
 //BA.debugLineNum = 720947;BA.debugLine="CallToAction.Text = \"کلیک کنید\"";
_calltoaction.setText(BA.ObjectToCharSequence("کلیک کنید"));
RDebugUtils.currentLine=720949;
 //BA.debugLineNum = 720949;BA.debugLine="Icon.Background = SampleDrawable";
_icon.setBackground((android.graphics.drawable.Drawable)(_sampledrawable.getObject()));
RDebugUtils.currentLine=720950;
 //BA.debugLineNum = 720950;BA.debugLine="Image.Bitmap = SampleMainBitmap";
_image.setBitmap((android.graphics.Bitmap)(_samplemainbitmap.getObject()));
RDebugUtils.currentLine=720952;
 //BA.debugLineNum = 720952;BA.debugLine="ItemPanel.AddView(Icon, 100%x-90dip, 5dip, 60di";
_itempanel.AddView((android.view.View)(_icon.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=720953;
 //BA.debugLineNum = 720953;BA.debugLine="ItemPanel.AddView(Title, 10dip, 5dip, 100%x-110";
_itempanel.AddView((android.view.View)(_title.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=720954;
 //BA.debugLineNum = 720954;BA.debugLine="ItemPanel.AddView(Description, 10dip, 25dip, 10";
_itempanel.AddView((android.view.View)(_description.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=720955;
 //BA.debugLineNum = 720955;BA.debugLine="ItemPanel.AddView(Image, 5dip, 80dip, 100%x-30d";
_itempanel.AddView((android.view.View)(_image.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (180)));
RDebugUtils.currentLine=720956;
 //BA.debugLineNum = 720956;BA.debugLine="ItemPanel.AddView(CallToAction, 5dip, 265dip, 1";
_itempanel.AddView((android.view.View)(_calltoaction.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (265)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
 };
RDebugUtils.currentLine=720958;
 //BA.debugLineNum = 720958;BA.debugLine="NativeScrollView.Panel.AddView(ItemPanel, 0, i *";
mostCurrent._nativescrollview.getPanel().AddView((android.view.View)(_itempanel.getObject()),(int) (0),(int) (_i*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320))),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (315)));
 }
};
RDebugUtils.currentLine=720960;
 //BA.debugLineNum = 720960;BA.debugLine="End Sub";
return "";
}
public static String  _loadbanner_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadbanner_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loadbanner_click", null);
anywheresoftware.b4a.objects.PanelWrapper _panel = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub LoadBanner_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim panel As Panel";
_panel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="panel.Initialize(\"panel\")";
_panel.Initialize(mostCurrent.activityBA,"panel");
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="BannerPanel.AddView(panel, 0, 0, 100%x, 10%y)";
mostCurrent._bannerpanel.AddView((android.view.View)(_panel.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="panel.Visible = True";
_panel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="panel.BringToFront";
_panel.BringToFront();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Magnet.LoadMobileBanner(\"YourAdUnitid\", panel)";
mostCurrent._magnet.LoadMobileBanner(mostCurrent.activityBA,"YourAdUnitid",(android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return "";
}
public static String  _loadinterstitial_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadinterstitial_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loadinterstitial_click", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub LoadInterstitial_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Magnet.LoadInterstitial(\"YourAdUnitid\")";
mostCurrent._magnet.LoadInterstitial(mostCurrent.activityBA,"YourAdUnitid");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public static String  _loadmrect_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadmrect_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loadmrect_click", null);
anywheresoftware.b4a.objects.PanelWrapper _panel = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub LoadMRect_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim panel As Panel";
_panel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="panel.Initialize(\"panel\")";
_panel.Initialize(mostCurrent.activityBA,"panel");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="MRectPanel.AddView(panel, 50%x-150dip, 0, 300dip,";
mostCurrent._mrectpanel.AddView((android.view.View)(_panel.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="panel.Visible = True";
_panel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="panel.BringToFront";
_panel.BringToFront();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Magnet.LoadMRect(\"YourAdUnitid\", panel, Magnet.SI";
mostCurrent._magnet.LoadMRect(mostCurrent.activityBA,"YourAdUnitid",(android.view.ViewGroup)(_panel.getObject()),mostCurrent._magnet.SIZE_300_250);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
return "";
}
public static String  _on_ad_available() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "on_ad_available"))
	return (String) Debug.delegate(mostCurrent.activityBA, "on_ad_available", null);
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub on_ad_available";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Log(\"AdAvailable\")";
anywheresoftware.b4a.keywords.Common.Log("AdAvailable");
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Magnet.ShowInterstitial()";
mostCurrent._magnet.ShowInterstitial(mostCurrent.activityBA);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public static String  _on_ad_receive_fail() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "on_ad_receive_fail"))
	return (String) Debug.delegate(mostCurrent.activityBA, "on_ad_receive_fail", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub on_ad_receive_fail";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Log(\"AdReceiveFail\")";
anywheresoftware.b4a.keywords.Common.Log("AdReceiveFail");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _tabhost1_tabchanged() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabhost1_tabchanged"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tabhost1_tabchanged", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub TabHost1_TabChanged";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If TabHost1.CurrentTab = 3 Then";
if (mostCurrent._tabhost1.getCurrentTab()==3) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="FillScrollView";
_fillscrollview();
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
}