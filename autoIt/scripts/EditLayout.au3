#comments-start
#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00000409)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00000409' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00000409->' & $aResult[1] & ')')
EndIf

EndFunc

#comments-end

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

#comments-start
_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-end

#comments-start


_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1074,305,1)
Sleep(2000)
MouseClick("left",1099,493,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(302,523)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1102,534,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(598,511)
Sleep(2000)
MouseUp("left")
Sleep(2000)

#comments-start


_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1074,306,1)
Sleep(2000)
MouseClick("left",1075,325,1)
Sleep(2000)
MouseClick("left",1096,597,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(904,578)
Sleep(2000)
MouseUp("left")
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
