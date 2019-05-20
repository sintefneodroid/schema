rd /s /q java\
flatc -j -o java\ NeodroidFBSShared.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSTypes.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSReaction.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSObservation.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSState.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSStates.fbs --gen-onefile
flatc -j -o java\ NeodroidFBSReactions.fbs --gen-onefile
::@pause
