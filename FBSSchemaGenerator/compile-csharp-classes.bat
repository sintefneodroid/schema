rd /s /q csharp\
flatc -n -o csharp\ NeodroidFBSShared.fbs --gen-onefile
flatc -n -o csharp\ NeodroidFBSReaction.fbs --gen-onefile
flatc -n -o csharp\ NeodroidFBSObservation.fbs --gen-onefile
flatc -n -o csharp\ NeodroidFBSState.fbs --gen-onefile
::@pause
