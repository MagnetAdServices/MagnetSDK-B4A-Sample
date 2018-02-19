package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class newactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (newactivity) ","newactivity",2,newactivity.mostCurrent.activityBA,newactivity.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) return newactivity.remoteMe.runUserSub(false, "newactivity","activity_create", _firsttime);
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 21;BA.debugLine="Magnet.Initialize()";
Debug.ShouldStop(1048576);
newactivity.mostCurrent._magnet.runVoidMethod ("Initialize",newactivity.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="Magnet.SetTestMode(True)";
Debug.ShouldStop(2097152);
newactivity.mostCurrent._magnet.runVoidMethod ("SetTestMode",(Object)(newactivity.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 24;BA.debugLine="Dim panel As Panel";
Debug.ShouldStop(8388608);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel", _panel);
 BA.debugLineNum = 25;BA.debugLine="panel.Initialize(\"panel\")";
Debug.ShouldStop(16777216);
_panel.runVoidMethod ("Initialize",newactivity.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 26;BA.debugLine="Activity.AddView(panel, 0, 0, 100%x, 15%y)";
Debug.ShouldStop(33554432);
newactivity.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_panel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(newactivity.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),newactivity.mostCurrent.activityBA)),(Object)(newactivity.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),newactivity.mostCurrent.activityBA)));
 BA.debugLineNum = 27;BA.debugLine="panel.Visible = True";
Debug.ShouldStop(67108864);
_panel.runMethod(true,"setVisible",newactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 28;BA.debugLine="panel.BringToFront";
Debug.ShouldStop(134217728);
_panel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 29;BA.debugLine="Magnet.LoadMobileBanner(\"YourAdUnitId\", panel)";
Debug.ShouldStop(268435456);
newactivity.mostCurrent._magnet.runVoidMethod ("LoadMobileBanner",newactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("YourAdUnitId")),(Object)((_panel.getObject())));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (newactivity) ","newactivity",2,newactivity.mostCurrent.activityBA,newactivity.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) return newactivity.remoteMe.runUserSub(false, "newactivity","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (newactivity) ","newactivity",2,newactivity.mostCurrent.activityBA,newactivity.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) return newactivity.remoteMe.runUserSub(false, "newactivity","activity_resume");
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim Magnet As MagnetSDK";
newactivity.mostCurrent._magnet = RemoteObject.createNew ("com.magnetadservices.facade.MagnetB4A_Facade");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}