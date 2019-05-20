#!/usr/bin/env bash
rm build/csharp -rf
mkdir -p build/csharp
bin/flatc -n -o build/csharp/ src/NeodroidFBSShared.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSTypes.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSReaction.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSObservation.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSState.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSStates.fbs --gen-onefile
bin/flatc -n -o build/csharp/ src/NeodroidFBSReactions.fbs --gen-onefile
