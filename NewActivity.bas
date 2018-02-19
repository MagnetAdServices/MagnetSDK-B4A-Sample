Type=Activity
Version=6.8
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim Magnet As MagnetSDK
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Magnet.Initialize()
	Magnet.SetTestMode(True)
	
	Dim panel As Panel
	panel.Initialize("panel")
	Activity.AddView(panel, 0, 0, 100%x, 15%y)
	panel.Visible = True
	panel.BringToFront
	Magnet.LoadMobileBanner("YourAdUnitId", panel)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
