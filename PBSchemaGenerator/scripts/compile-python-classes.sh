#!/usr/bin/env bash
rm build/python/ -rf
mkdir -p build/python
bin/flatc -p -o build/python/ src/NeodroidFBSShared.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSTypes.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSReaction.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSObservation.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSState.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSStates.fbs --gen-onefile
bin/flatc -p -o build/python/ src/NeodroidFBSReactions.fbs --gen-onefile
