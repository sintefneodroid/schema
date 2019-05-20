#!/usr/bin/env bash
rm build/java/ -rf
mkdir -p build/java
bin/flatc -j -o build/java/ src/NeodroidFBSShared.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSTypes.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSReaction.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSObservation.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSState.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSStates.fbs
bin/flatc -j -o build/java/ src/NeodroidFBSReactions.fbs
