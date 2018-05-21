package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_7 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Magnet.Initialize()";
Debug.ShouldStop(268435456);
main.mostCurrent._magnet.runVoidMethod ("Initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="Magnet.SetTestMode(True)";
Debug.ShouldStop(536870912);
main.mostCurrent._magnet.runVoidMethod ("SetTestMode",(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"tabhost\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("tabhost")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="TabHost1.AddTab(\"Banner\", \"banner\")";
Debug.ShouldStop(1);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Banner")),(Object)(RemoteObject.createImmutable("banner")));
 BA.debugLineNum = 34;BA.debugLine="TabHost1.AddTab(\"MRect\", \"mrect\")";
Debug.ShouldStop(2);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("MRect")),(Object)(RemoteObject.createImmutable("mrect")));
 BA.debugLineNum = 35;BA.debugLine="TabHost1.AddTab(\"Interstitial\", \"intertitial\")";
Debug.ShouldStop(4);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Interstitial")),(Object)(RemoteObject.createImmutable("intertitial")));
 BA.debugLineNum = 36;BA.debugLine="TabHost1.AddTab(\"Native\", \"native\")";
Debug.ShouldStop(8);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Native")),(Object)(RemoteObject.createImmutable("native")));
 BA.debugLineNum = 37;BA.debugLine="TabHost1.AddTab(\"Native Express\", \"express\")";
Debug.ShouldStop(16);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Native Express")),(Object)(RemoteObject.createImmutable("express")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillscrollview() throws Exception{
try {
		Debug.PushSubsStack("FillScrollView (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("fillscrollview")) return main.remoteMe.runUserSub(false, "main","fillscrollview");
RemoteObject _adbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _samplebitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _samplemainbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _indicative = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _title = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _description = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _calltoaction = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _nativepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _adindicative = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _sampledrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _itempanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 48;BA.debugLine="Sub FillScrollView";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim AdBitmap As Bitmap";
Debug.ShouldStop(65536);
_adbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("AdBitmap", _adbitmap);
 BA.debugLineNum = 50;BA.debugLine="Dim SampleBitmap As Bitmap";
Debug.ShouldStop(131072);
_samplebitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("SampleBitmap", _samplebitmap);
 BA.debugLineNum = 51;BA.debugLine="Dim SampleMainBitmap As Bitmap";
Debug.ShouldStop(262144);
_samplemainbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("SampleMainBitmap", _samplemainbitmap);
 BA.debugLineNum = 53;BA.debugLine="AdBitmap.Initialize(File.DirAssets, \"pic2.png\")";
Debug.ShouldStop(1048576);
_adbitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pic2.png")));
 BA.debugLineNum = 54;BA.debugLine="SampleBitmap.Initialize(File.DirAssets, \"sample.j";
Debug.ShouldStop(2097152);
_samplebitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sample.jpg")));
 BA.debugLineNum = 55;BA.debugLine="SampleMainBitmap.Initialize(File.DirAssets, \"samp";
Debug.ShouldStop(4194304);
_samplemainbitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sample-main.jpg")));
 BA.debugLineNum = 57;BA.debugLine="NativeScrollView.Panel.RemoveAllViews";
Debug.ShouldStop(16777216);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 58;BA.debugLine="NativeScrollView.Panel.Width = 100%x";
Debug.ShouldStop(33554432);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA));
 BA.debugLineNum = 59;BA.debugLine="NativeScrollView.Panel.Height = 320dip * 6";
Debug.ShouldStop(67108864);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))),RemoteObject.createImmutable(6)}, "*",0, 1));
 BA.debugLineNum = 60;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(134217728);
{
final int step10 = 1;
final int limit10 = 5;
for (_i = 0 ; (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="Dim Icon As ImageView";
Debug.ShouldStop(268435456);
_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 62;BA.debugLine="Dim Image As ImageView";
Debug.ShouldStop(536870912);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Image", _image);
 BA.debugLineNum = 63;BA.debugLine="Dim Indicative As ImageView";
Debug.ShouldStop(1073741824);
_indicative = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Indicative", _indicative);
 BA.debugLineNum = 64;BA.debugLine="Dim Title As Label";
Debug.ShouldStop(-2147483648);
_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Title", _title);
 BA.debugLineNum = 65;BA.debugLine="Dim Description As Label";
Debug.ShouldStop(1);
_description = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Description", _description);
 BA.debugLineNum = 66;BA.debugLine="Dim CallToAction As Button";
Debug.ShouldStop(2);
_calltoaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("CallToAction", _calltoaction);
 BA.debugLineNum = 67;BA.debugLine="Dim NativePanel As Panel";
Debug.ShouldStop(4);
_nativepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("NativePanel", _nativepanel);
 BA.debugLineNum = 68;BA.debugLine="Dim AdIndicative As BitmapDrawable";
Debug.ShouldStop(8);
_adindicative = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("AdIndicative", _adindicative);
 BA.debugLineNum = 69;BA.debugLine="Dim SampleDrawable As BitmapDrawable";
Debug.ShouldStop(16);
_sampledrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("SampleDrawable", _sampledrawable);
 BA.debugLineNum = 70;BA.debugLine="Dim ItemPanel As Panel";
Debug.ShouldStop(32);
_itempanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("ItemPanel", _itempanel);
 BA.debugLineNum = 72;BA.debugLine="Icon.Initialize(\"\")";
Debug.ShouldStop(128);
_icon.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="Image.Initialize(\"\")";
Debug.ShouldStop(256);
_image.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 74;BA.debugLine="Indicative.Initialize(\"\")";
Debug.ShouldStop(512);
_indicative.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="Title.Initialize(\"\")";
Debug.ShouldStop(1024);
_title.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 76;BA.debugLine="Description.Initialize(\"\")";
Debug.ShouldStop(2048);
_description.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 77;BA.debugLine="CallToAction.Initialize(\"\")";
Debug.ShouldStop(4096);
_calltoaction.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 78;BA.debugLine="NativePanel.Initialize(\"\")";
Debug.ShouldStop(8192);
_nativepanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 79;BA.debugLine="ItemPanel.Initialize(\"panel\")";
Debug.ShouldStop(16384);
_itempanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 80;BA.debugLine="AdIndicative.Initialize(AdBitmap)";
Debug.ShouldStop(32768);
_adindicative.runVoidMethod ("Initialize",(Object)((_adbitmap.getObject())));
 BA.debugLineNum = 81;BA.debugLine="SampleDrawable.Initialize(SampleBitmap)";
Debug.ShouldStop(65536);
_sampledrawable.runVoidMethod ("Initialize",(Object)((_samplebitmap.getObject())));
 BA.debugLineNum = 83;BA.debugLine="Title.Gravity = Bit.Or(Gravity.NO_GRAVITY, Gravi";
Debug.ShouldStop(262144);
_title.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"NO_GRAVITY")),(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 84;BA.debugLine="Indicative.Background = AdIndicative";
Debug.ShouldStop(524288);
_indicative.runMethod(false,"setBackground",(_adindicative.getObject()));
 BA.debugLineNum = 86;BA.debugLine="If i Mod 3 = 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "%",0, 1),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 87;BA.debugLine="NativePanel.AddView(Icon, 100%x-90dip, 5dip, 60";
Debug.ShouldStop(4194304);
_nativepanel.runVoidMethod ("AddView",(Object)((_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 88;BA.debugLine="NativePanel.AddView(Title, 50dip, 5dip, 100%x-1";
Debug.ShouldStop(8388608);
_nativepanel.runVoidMethod ("AddView",(Object)((_title.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 89;BA.debugLine="NativePanel.AddView(Indicative, 5dip, 0, 25dip,";
Debug.ShouldStop(16777216);
_nativepanel.runVoidMethod ("AddView",(Object)((_indicative.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 90;BA.debugLine="NativePanel.AddView(Description, 10dip, 30dip,";
Debug.ShouldStop(33554432);
_nativepanel.runVoidMethod ("AddView",(Object)((_description.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 91;BA.debugLine="NativePanel.AddView(Image, 5dip, 80dip, 100%x-3";
Debug.ShouldStop(67108864);
_nativepanel.runVoidMethod ("AddView",(Object)((_image.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180)))));
 BA.debugLineNum = 92;BA.debugLine="NativePanel.AddView(CallToAction, 5dip, 265dip,";
Debug.ShouldStop(134217728);
_nativepanel.runVoidMethod ("AddView",(Object)((_calltoaction.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 94;BA.debugLine="Magnet.BindView(Title, Description, CallToActio";
Debug.ShouldStop(536870912);
main.mostCurrent._magnet.runVoidMethod ("BindView",main.mostCurrent.activityBA,(Object)((_title.getObject())),(Object)((_description.getObject())),(Object)((_calltoaction.getObject())),(Object)((_icon.getObject())),(Object)((_image.getObject())),(Object)((_indicative.getObject())),(Object)((_nativepanel.getObject())));
 BA.debugLineNum = 95;BA.debugLine="Magnet.LoadNative(\"YourAdUnitId\", ItemPanel)";
Debug.ShouldStop(1073741824);
main.mostCurrent._magnet.runVoidMethod ("LoadNative",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitId")),(Object)((_itempanel.getObject())));
 }else {
 BA.debugLineNum = 97;BA.debugLine="Title.Text = \"عنوان\"";
Debug.ShouldStop(1);
_title.runMethod(true,"setText",BA.ObjectToCharSequence("عنوان"));
 BA.debugLineNum = 98;BA.debugLine="Description.Text = \"توضیحات\"";
Debug.ShouldStop(2);
_description.runMethod(true,"setText",BA.ObjectToCharSequence("توضیحات"));
 BA.debugLineNum = 99;BA.debugLine="CallToAction.Text = \"کلیک کنید\"";
Debug.ShouldStop(4);
_calltoaction.runMethod(true,"setText",BA.ObjectToCharSequence("کلیک کنید"));
 BA.debugLineNum = 101;BA.debugLine="Icon.Background = SampleDrawable";
Debug.ShouldStop(16);
_icon.runMethod(false,"setBackground",(_sampledrawable.getObject()));
 BA.debugLineNum = 102;BA.debugLine="Image.Bitmap = SampleMainBitmap";
Debug.ShouldStop(32);
_image.runMethod(false,"setBitmap",(_samplemainbitmap.getObject()));
 BA.debugLineNum = 104;BA.debugLine="ItemPanel.AddView(Icon, 100%x-90dip, 5dip, 60di";
Debug.ShouldStop(128);
_itempanel.runVoidMethod ("AddView",(Object)((_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 105;BA.debugLine="ItemPanel.AddView(Title, 10dip, 5dip, 100%x-110";
Debug.ShouldStop(256);
_itempanel.runVoidMethod ("AddView",(Object)((_title.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 106;BA.debugLine="ItemPanel.AddView(Description, 10dip, 25dip, 10";
Debug.ShouldStop(512);
_itempanel.runVoidMethod ("AddView",(Object)((_description.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 107;BA.debugLine="ItemPanel.AddView(Image, 5dip, 80dip, 100%x-30d";
Debug.ShouldStop(1024);
_itempanel.runVoidMethod ("AddView",(Object)((_image.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180)))));
 BA.debugLineNum = 108;BA.debugLine="ItemPanel.AddView(CallToAction, 5dip, 265dip, 1";
Debug.ShouldStop(2048);
_itempanel.runVoidMethod ("AddView",(Object)((_calltoaction.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 };
 BA.debugLineNum = 110;BA.debugLine="NativeScrollView.Panel.AddView(ItemPanel, 0, i *";
Debug.ShouldStop(8192);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_itempanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))}, "*",0, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 315)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim Magnet As MagnetSDK";
main.mostCurrent._magnet = RemoteObject.createNew ("com.magnetadservices.facade.MagnetB4A_Facade");
 //BA.debugLineNum = 21;BA.debugLine="Dim TabHost1 As TabHost";
main.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim BannerPanel As Panel";
main.mostCurrent._bannerpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim MRectPanel As Panel";
main.mostCurrent._mrectpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim ExpressPanel As Panel";
main.mostCurrent._expresspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim NativeScrollView As ScrollView";
main.mostCurrent._nativescrollview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadbanner_click() throws Exception{
try {
		Debug.PushSubsStack("LoadBanner_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,118);
if (RapidSub.canDelegate("loadbanner_click")) return main.remoteMe.runUserSub(false, "main","loadbanner_click");
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 118;BA.debugLine="Sub LoadBanner_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(4194304);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 120;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(8388608);
_panel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 121;BA.debugLine="BannerPanel.AddView(panel, 0, 0, 100%x, 10%y)";
Debug.ShouldStop(16777216);
main.mostCurrent._bannerpanel.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 122;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(33554432);
_panel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 123;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(67108864);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 124;BA.debugLine="Magnet.LoadMobileBanner(\"YourAdUnitId\", panel)";
Debug.ShouldStop(134217728);
main.mostCurrent._magnet.runVoidMethod ("LoadMobileBanner",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitId")),(Object)((_panel.getObject())));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadexpress_click() throws Exception{
try {
		Debug.PushSubsStack("LoadExpress_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,136);
if (RapidSub.canDelegate("loadexpress_click")) return main.remoteMe.runUserSub(false, "main","loadexpress_click");
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 136;BA.debugLine="Sub LoadExpress_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(256);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 138;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(512);
_panel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 139;BA.debugLine="ExpressPanel.AddView(panel, 50%x-150dip, 0, 300di";
Debug.ShouldStop(1024);
main.mostCurrent._expresspanel.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 140;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(2048);
_panel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 141;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(4096);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 142;BA.debugLine="Magnet.LoadNativeExpressWithCustomSize(\"YourAdUni";
Debug.ShouldStop(8192);
main.mostCurrent._magnet.runVoidMethod ("LoadNativeExpressWithCustomSize",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitId")),(Object)((_panel.getObject())),(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(int.class, 200)));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadinactivity_click() throws Exception{
try {
		Debug.PushSubsStack("LoadInActivity_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,114);
if (RapidSub.canDelegate("loadinactivity_click")) return main.remoteMe.runUserSub(false, "main","loadinactivity_click");
 BA.debugLineNum = 114;BA.debugLine="Sub LoadInActivity_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="StartActivity(NewActivity)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._newactivity.getObject())));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadinterstitial_click() throws Exception{
try {
		Debug.PushSubsStack("LoadInterstitial_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,145);
if (RapidSub.canDelegate("loadinterstitial_click")) return main.remoteMe.runUserSub(false, "main","loadinterstitial_click");
 BA.debugLineNum = 145;BA.debugLine="Sub LoadInterstitial_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Magnet.LoadInterstitial(\"YourInterstitialAdUnitId";
Debug.ShouldStop(131072);
main.mostCurrent._magnet.runVoidMethod ("LoadInterstitial",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("YourInterstitialAdUnitId")));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadmrect_click() throws Exception{
try {
		Debug.PushSubsStack("LoadMRect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,127);
if (RapidSub.canDelegate("loadmrect_click")) return main.remoteMe.runUserSub(false, "main","loadmrect_click");
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 127;BA.debugLine="Sub LoadMRect_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(-2147483648);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 129;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(1);
_panel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 130;BA.debugLine="MRectPanel.AddView(panel, 50%x-150dip, 0, 300dip,";
Debug.ShouldStop(2);
main.mostCurrent._mrectpanel.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 131;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(4);
_panel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(8);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 133;BA.debugLine="Magnet.LoadMRect(\"YourAdUnitId\", panel, Magnet.SI";
Debug.ShouldStop(16);
main.mostCurrent._magnet.runVoidMethod ("LoadMRect",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitId")),(Object)((_panel.getObject())),(Object)(main.mostCurrent._magnet.getField(false,"SIZE_MEDIUM_RECTANGLE")));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadrewarded_click() throws Exception{
try {
		Debug.PushSubsStack("LoadRewarded_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,149);
if (RapidSub.canDelegate("loadrewarded_click")) return main.remoteMe.runUserSub(false, "main","loadrewarded_click");
 BA.debugLineNum = 149;BA.debugLine="Sub LoadRewarded_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Magnet.LoadRewardAd(\"YourRewardedAdUnitId\")";
Debug.ShouldStop(2097152);
main.mostCurrent._magnet.runVoidMethod ("LoadRewardAd",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("YourRewardedAdUnitId")));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_ad_available(RemoteObject _adunitid) throws Exception{
try {
		Debug.PushSubsStack("on_ad_available (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,159);
if (RapidSub.canDelegate("on_ad_available")) return main.remoteMe.runUserSub(false, "main","on_ad_available", _adunitid);
Debug.locals.put("AdUnitId", _adunitid);
 BA.debugLineNum = 159;BA.debugLine="Sub on_ad_available(AdUnitId As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Log(\"AdAvailable\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AdAvailable")));
 BA.debugLineNum = 161;BA.debugLine="If AdUnitId == \"YourInterstitialAdUnitId\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_adunitid,BA.ObjectToString("YourInterstitialAdUnitId"))) { 
 BA.debugLineNum = 162;BA.debugLine="Magnet.ShowInterstitial()";
Debug.ShouldStop(2);
main.mostCurrent._magnet.runVoidMethod ("ShowInterstitial",main.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 163;BA.debugLine="Else If AdUnitId == \"YourRewardedAdUnitId\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_adunitid,BA.ObjectToString("YourRewardedAdUnitId"))) { 
 BA.debugLineNum = 164;BA.debugLine="Magnet.ShowRewardAd()";
Debug.ShouldStop(8);
main.mostCurrent._magnet.runVoidMethod ("ShowRewardAd",main.mostCurrent.activityBA);
 }};
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_ad_receive_fail(RemoteObject _adunitid) throws Exception{
try {
		Debug.PushSubsStack("on_ad_receive_fail (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,169);
if (RapidSub.canDelegate("on_ad_receive_fail")) return main.remoteMe.runUserSub(false, "main","on_ad_receive_fail", _adunitid);
Debug.locals.put("AdUnitId", _adunitid);
 BA.debugLineNum = 169;BA.debugLine="Sub on_ad_receive_fail(AdUnitId As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Log(\"AdReceiveFail\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AdReceiveFail")));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_reward_failed() throws Exception{
try {
		Debug.PushSubsStack("on_reward_failed (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,177);
if (RapidSub.canDelegate("on_reward_failed")) return main.remoteMe.runUserSub(false, "main","on_reward_failed");
 BA.debugLineNum = 177;BA.debugLine="Sub on_reward_failed";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Log(\"RewardFailed\")";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("RewardFailed")));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_reward_successful() throws Exception{
try {
		Debug.PushSubsStack("on_reward_successful (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,173);
if (RapidSub.canDelegate("on_reward_successful")) return main.remoteMe.runUserSub(false, "main","on_reward_successful");
 BA.debugLineNum = 173;BA.debugLine="Sub on_reward_successful";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Log(\"You can give reward to your user here\")";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("You can give reward to your user here")));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
newactivity_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
newactivity.myClass = BA.getDeviceClass ("b4a.example.newactivity");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _stopbanner_click() throws Exception{
try {
		Debug.PushSubsStack("StopBanner_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,181);
if (RapidSub.canDelegate("stopbanner_click")) return main.remoteMe.runUserSub(false, "main","stopbanner_click");
 BA.debugLineNum = 181;BA.debugLine="Sub StopBanner_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Magnet.StopMobileBanner()";
Debug.ShouldStop(2097152);
main.mostCurrent._magnet.runVoidMethod ("StopMobileBanner",main.mostCurrent.activityBA);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopmrect_click() throws Exception{
try {
		Debug.PushSubsStack("StopMRect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,185);
if (RapidSub.canDelegate("stopmrect_click")) return main.remoteMe.runUserSub(false, "main","stopmrect_click");
 BA.debugLineNum = 185;BA.debugLine="Sub StopMRect_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Magnet.StopMRect()";
Debug.ShouldStop(33554432);
main.mostCurrent._magnet.runVoidMethod ("StopMRect",main.mostCurrent.activityBA);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return main.remoteMe.runUserSub(false, "main","tabhost1_tabchanged");
 BA.debugLineNum = 153;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="If TabHost1.CurrentTab = 3 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 155;BA.debugLine="FillScrollView";
Debug.ShouldStop(67108864);
_fillscrollview();
 };
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}