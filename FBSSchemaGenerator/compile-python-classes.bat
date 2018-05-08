rd /s /q python\
flatc -p -o python\ NeodroidFBSShared.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSTypes.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSReaction.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSObservation.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSState.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSStates.fbs --gen-onefile
flatc -p -o python\ NeodroidFBSReactions.fbs --gen-onefile
::@pause
