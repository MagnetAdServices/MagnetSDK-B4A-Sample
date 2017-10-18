package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("FillScrollView (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
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
 BA.debugLineNum = 47;BA.debugLine="Sub FillScrollView";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim AdBitmap As Bitmap";
Debug.ShouldStop(32768);
_adbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("AdBitmap", _adbitmap);
 BA.debugLineNum = 49;BA.debugLine="Dim SampleBitmap As Bitmap";
Debug.ShouldStop(65536);
_samplebitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("SampleBitmap", _samplebitmap);
 BA.debugLineNum = 50;BA.debugLine="Dim SampleMainBitmap As Bitmap";
Debug.ShouldStop(131072);
_samplemainbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("SampleMainBitmap", _samplemainbitmap);
 BA.debugLineNum = 52;BA.debugLine="AdBitmap.Initialize(File.DirAssets, \"pic2.png\")";
Debug.ShouldStop(524288);
_adbitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pic2.png")));
 BA.debugLineNum = 53;BA.debugLine="SampleBitmap.Initialize(File.DirAssets, \"sample.j";
Debug.ShouldStop(1048576);
_samplebitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sample.jpg")));
 BA.debugLineNum = 54;BA.debugLine="SampleMainBitmap.Initialize(File.DirAssets, \"samp";
Debug.ShouldStop(2097152);
_samplemainbitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sample-main.jpg")));
 BA.debugLineNum = 56;BA.debugLine="NativeScrollView.Panel.RemoveAllViews";
Debug.ShouldStop(8388608);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 57;BA.debugLine="NativeScrollView.Panel.Width = 100%x";
Debug.ShouldStop(16777216);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runMethod(true,"setWidth",main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA));
 BA.debugLineNum = 58;BA.debugLine="NativeScrollView.Panel.Height = 320dip * 6";
Debug.ShouldStop(33554432);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))),RemoteObject.createImmutable(6)}, "*",0, 1));
 BA.debugLineNum = 59;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(67108864);
{
final int step10 = 1;
final int limit10 = 5;
for (_i = 0 ; (step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10); _i = ((int)(0 + _i + step10)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="Dim Icon As ImageView";
Debug.ShouldStop(134217728);
_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 61;BA.debugLine="Dim Image As ImageView";
Debug.ShouldStop(268435456);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Image", _image);
 BA.debugLineNum = 62;BA.debugLine="Dim Indicative As ImageView";
Debug.ShouldStop(536870912);
_indicative = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Indicative", _indicative);
 BA.debugLineNum = 63;BA.debugLine="Dim Title As Label";
Debug.ShouldStop(1073741824);
_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Title", _title);
 BA.debugLineNum = 64;BA.debugLine="Dim Description As Label";
Debug.ShouldStop(-2147483648);
_description = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Description", _description);
 BA.debugLineNum = 65;BA.debugLine="Dim CallToAction As Button";
Debug.ShouldStop(1);
_calltoaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("CallToAction", _calltoaction);
 BA.debugLineNum = 66;BA.debugLine="Dim NativePanel As Panel";
Debug.ShouldStop(2);
_nativepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("NativePanel", _nativepanel);
 BA.debugLineNum = 67;BA.debugLine="Dim AdIndicative As BitmapDrawable";
Debug.ShouldStop(4);
_adindicative = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("AdIndicative", _adindicative);
 BA.debugLineNum = 68;BA.debugLine="Dim SampleDrawable As BitmapDrawable";
Debug.ShouldStop(8);
_sampledrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("SampleDrawable", _sampledrawable);
 BA.debugLineNum = 69;BA.debugLine="Dim ItemPanel As Panel";
Debug.ShouldStop(16);
_itempanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("ItemPanel", _itempanel);
 BA.debugLineNum = 71;BA.debugLine="Icon.Initialize(\"\")";
Debug.ShouldStop(64);
_icon.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 72;BA.debugLine="Image.Initialize(\"\")";
Debug.ShouldStop(128);
_image.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 73;BA.debugLine="Indicative.Initialize(\"\")";
Debug.ShouldStop(256);
_indicative.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 74;BA.debugLine="Title.Initialize(\"\")";
Debug.ShouldStop(512);
_title.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="Description.Initialize(\"\")";
Debug.ShouldStop(1024);
_description.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 76;BA.debugLine="CallToAction.Initialize(\"\")";
Debug.ShouldStop(2048);
_calltoaction.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 77;BA.debugLine="NativePanel.Initialize(\"\")";
Debug.ShouldStop(4096);
_nativepanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 78;BA.debugLine="ItemPanel.Initialize(\"panel\")";
Debug.ShouldStop(8192);
_itempanel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 79;BA.debugLine="AdIndicative.Initialize(AdBitmap)";
Debug.ShouldStop(16384);
_adindicative.runVoidMethod ("Initialize",(Object)((_adbitmap.getObject())));
 BA.debugLineNum = 80;BA.debugLine="SampleDrawable.Initialize(SampleBitmap)";
Debug.ShouldStop(32768);
_sampledrawable.runVoidMethod ("Initialize",(Object)((_samplebitmap.getObject())));
 BA.debugLineNum = 82;BA.debugLine="Title.Gravity = Bit.Or(Gravity.NO_GRAVITY, Gravi";
Debug.ShouldStop(131072);
_title.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"NO_GRAVITY")),(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 83;BA.debugLine="Indicative.Background = AdIndicative";
Debug.ShouldStop(262144);
_indicative.runMethod(false,"setBackground",(_adindicative.getObject()));
 BA.debugLineNum = 85;BA.debugLine="If i Mod 3 = 2 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "%",0, 1),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 86;BA.debugLine="NativePanel.AddView(Icon, 100%x-90dip, 5dip, 60";
Debug.ShouldStop(2097152);
_nativepanel.runVoidMethod ("AddView",(Object)((_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 87;BA.debugLine="NativePanel.AddView(Title, 50dip, 5dip, 100%x-1";
Debug.ShouldStop(4194304);
_nativepanel.runVoidMethod ("AddView",(Object)((_title.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 88;BA.debugLine="NativePanel.AddView(Indicative, 5dip, 0, 25dip,";
Debug.ShouldStop(8388608);
_nativepanel.runVoidMethod ("AddView",(Object)((_indicative.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 89;BA.debugLine="NativePanel.AddView(Description, 10dip, 30dip,";
Debug.ShouldStop(16777216);
_nativepanel.runVoidMethod ("AddView",(Object)((_description.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 90;BA.debugLine="NativePanel.AddView(Image, 5dip, 80dip, 100%x-3";
Debug.ShouldStop(33554432);
_nativepanel.runVoidMethod ("AddView",(Object)((_image.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180)))));
 BA.debugLineNum = 91;BA.debugLine="NativePanel.AddView(CallToAction, 5dip, 265dip,";
Debug.ShouldStop(67108864);
_nativepanel.runVoidMethod ("AddView",(Object)((_calltoaction.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 93;BA.debugLine="Magnet.BindView(Title, Description, CallToActio";
Debug.ShouldStop(268435456);
main.mostCurrent._magnet.runVoidMethod ("BindView",main.mostCurrent.activityBA,(Object)((_title.getObject())),(Object)((_description.getObject())),(Object)((_calltoaction.getObject())),(Object)((_icon.getObject())),(Object)((_image.getObject())),(Object)((_indicative.getObject())),(Object)((_nativepanel.getObject())));
 BA.debugLineNum = 94;BA.debugLine="Magnet.LoadNative(\"YourAdUnitid\", ItemPanel)";
Debug.ShouldStop(536870912);
main.mostCurrent._magnet.runVoidMethod ("LoadNative",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitid")),(Object)((_itempanel.getObject())));
 }else {
 BA.debugLineNum = 96;BA.debugLine="Title.Text = \"عنوان\"";
Debug.ShouldStop(-2147483648);
_title.runMethod(true,"setText",BA.ObjectToCharSequence("عنوان"));
 BA.debugLineNum = 97;BA.debugLine="Description.Text = \"توضیحات\"";
Debug.ShouldStop(1);
_description.runMethod(true,"setText",BA.ObjectToCharSequence("توضیحات"));
 BA.debugLineNum = 98;BA.debugLine="CallToAction.Text = \"کلیک کنید\"";
Debug.ShouldStop(2);
_calltoaction.runMethod(true,"setText",BA.ObjectToCharSequence("کلیک کنید"));
 BA.debugLineNum = 100;BA.debugLine="Icon.Background = SampleDrawable";
Debug.ShouldStop(8);
_icon.runMethod(false,"setBackground",(_sampledrawable.getObject()));
 BA.debugLineNum = 101;BA.debugLine="Image.Bitmap = SampleMainBitmap";
Debug.ShouldStop(16);
_image.runMethod(false,"setBitmap",(_samplemainbitmap.getObject()));
 BA.debugLineNum = 103;BA.debugLine="ItemPanel.AddView(Icon, 100%x-90dip, 5dip, 60di";
Debug.ShouldStop(64);
_itempanel.runVoidMethod ("AddView",(Object)((_icon.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 104;BA.debugLine="ItemPanel.AddView(Title, 10dip, 5dip, 100%x-110";
Debug.ShouldStop(128);
_itempanel.runVoidMethod ("AddView",(Object)((_title.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 105;BA.debugLine="ItemPanel.AddView(Description, 10dip, 25dip, 10";
Debug.ShouldStop(256);
_itempanel.runVoidMethod ("AddView",(Object)((_description.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 106;BA.debugLine="ItemPanel.AddView(Image, 5dip, 80dip, 100%x-30d";
Debug.ShouldStop(512);
_itempanel.runVoidMethod ("AddView",(Object)((_image.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180)))));
 BA.debugLineNum = 107;BA.debugLine="ItemPanel.AddView(CallToAction, 5dip, 265dip, 1";
Debug.ShouldStop(1024);
_itempanel.runVoidMethod ("AddView",(Object)((_calltoaction.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 };
 BA.debugLineNum = 109;BA.debugLine="NativeScrollView.Panel.AddView(ItemPanel, 0, i *";
Debug.ShouldStop(4096);
main.mostCurrent._nativescrollview.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_itempanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))}, "*",0, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 315)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 24;BA.debugLine="Dim NativeScrollView As ScrollView";
main.mostCurrent._nativescrollview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _loadbanner_click() throws Exception{
try {
		Debug.PushSubsStack("LoadBanner_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,113);
if (RapidSub.canDelegate("loadbanner_click")) return main.remoteMe.runUserSub(false, "main","loadbanner_click");
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub LoadBanner_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(131072);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 115;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(262144);
_panel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 116;BA.debugLine="BannerPanel.AddView(panel, 0, 0, 100%x, 10%y)";
Debug.ShouldStop(524288);
main.mostCurrent._bannerpanel.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 117;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(1048576);
_panel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 118;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(2097152);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 119;BA.debugLine="Magnet.LoadMobileBanner(\"YourAdUnitid\", panel)";
Debug.ShouldStop(4194304);
main.mostCurrent._magnet.runVoidMethod ("LoadMobileBanner",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitid")),(Object)((_panel.getObject())));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("LoadInterstitial_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,131);
if (RapidSub.canDelegate("loadinterstitial_click")) return main.remoteMe.runUserSub(false, "main","loadinterstitial_click");
 BA.debugLineNum = 131;BA.debugLine="Sub LoadInterstitial_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Magnet.LoadInterstitial(\"YourAdUnitid\")";
Debug.ShouldStop(8);
main.mostCurrent._magnet.runVoidMethod ("LoadInterstitial",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("YourAdUnitid")));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("LoadMRect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,122);
if (RapidSub.canDelegate("loadmrect_click")) return main.remoteMe.runUserSub(false, "main","loadmrect_click");
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 122;BA.debugLine="Sub LoadMRect_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(67108864);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 124;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(134217728);
_panel.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 125;BA.debugLine="MRectPanel.AddView(panel, 50%x-150dip, 0, 300dip,";
Debug.ShouldStop(268435456);
main.mostCurrent._mrectpanel.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 126;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(536870912);
_panel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(1073741824);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 128;BA.debugLine="Magnet.LoadMRect(\"YourAdUnitid\", panel, Magnet.SI";
Debug.ShouldStop(-2147483648);
main.mostCurrent._magnet.runVoidMethod ("LoadMRect",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitid")),(Object)((_panel.getObject())),(Object)(main.mostCurrent._magnet.getField(false,"SIZE_300_250")));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _on_ad_available() throws Exception{
try {
		Debug.PushSubsStack("on_ad_available (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,135);
if (RapidSub.canDelegate("on_ad_available")) return main.remoteMe.runUserSub(false, "main","on_ad_available");
 BA.debugLineNum = 135;BA.debugLine="Sub on_ad_available";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Log(\"AdAvailable\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AdAvailable")));
 BA.debugLineNum = 137;BA.debugLine="Magnet.ShowInterstitial()";
Debug.ShouldStop(256);
main.mostCurrent._magnet.runVoidMethod ("ShowInterstitial",main.mostCurrent.activityBA);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public static RemoteObject  _on_ad_receive_fail() throws Exception{
try {
		Debug.PushSubsStack("on_ad_receive_fail (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,140);
if (RapidSub.canDelegate("on_ad_receive_fail")) return main.remoteMe.runUserSub(false, "main","on_ad_receive_fail");
 BA.debugLineNum = 140;BA.debugLine="Sub on_ad_receive_fail";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Log(\"AdReceiveFail\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AdReceiveFail")));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,144);
if (RapidSub.canDelegate("tabhost1_tabchanged")) return main.remoteMe.runUserSub(false, "main","tabhost1_tabchanged");
 BA.debugLineNum = 144;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If TabHost1.CurrentTab = 3 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 146;BA.debugLine="FillScrollView";
Debug.ShouldStop(131072);
_fillscrollview();
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
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
}