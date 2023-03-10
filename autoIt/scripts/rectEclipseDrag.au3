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
_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1054,193,1)
Sleep(2000)
MouseClick("left",1051,301,1)
Sleep(2000)
MouseClick("left",411,562,1)
Sleep(2000)
MouseClick("left",1099,289,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(557,568)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1054,195,1)
Sleep(2000)
MouseClick("left",1048,320,1)
Sleep(2000)
MouseClick("left",435,685,1)
Sleep(2000)
MouseClick("left",1100,437,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(589,676)
Sleep(2000)
MouseUp("left")
Sleep(2000)

#comments-start
_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1030,331,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(1032,467)
Sleep(2000)
MouseUp("left")



#comments-start
_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1063,206,1)
Sleep(2000)
MouseClick("left",1052,381,1)
Sleep(2000)
MouseClick("left",550,428,1)
Sleep(2000)
MouseClick("left",1054,199,1)
Sleep(2000)
MouseClick("left",1044,404,1)
Sleep(2000)
MouseClick("left",323,676,1)
Sleep(2000)
MouseClick("left",1054,195,1)
Sleep(2000)
MouseClick("left",1051,425,1)
Sleep(2000)
MouseClick("left",704,692,1)
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end

