#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00004009)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00004009' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00004009->' & $aResult[1] & ')')
EndIf

EndFunc

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-start
_WinWaitActivate("Focus-Barcode Voucher - Google Chrome","")
#comments-end
MouseClick("left",1098,457,1)
Sleep(2000)
MouseMove(1102,457)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(258,383)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1097,478,1)
Sleep(2000)
MouseMove(1104,477)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(264,429)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1077,440,1)
Sleep(2000)
MouseClick("left",1074,271,1)
Sleep(2000)
MouseClick("left",1077,317,1)
Sleep(2000)
MouseClick("left",1102,461,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(263,510)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1097,545,1)
Sleep(2000)
MouseMove(1106,544)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(267,582)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1102,503,1)
Sleep(2000)
MouseMove(1107,501)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(270,671)
Sleep(2000)
MouseUp("left")
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
