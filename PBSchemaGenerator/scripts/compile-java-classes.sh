#!/usr/bin/env bash
rm build/java/ -rf
mkdir -p build/java
bin/protoc -j -o build/java/ src/NeodroidFBSShared.proto
bin/protoc -j -o build/java/ src/NeodroidFBSTypes.proto
bin/protoc -j -o build/java/ src/NeodroidFBSReaction.proto
bin/protoc -j -o build/java/ src/NeodroidFBSObservation.proto
bin/protoc -j -o build/java/ src/NeodroidFBSState.proto
bin/protoc -j -o build/java/ src/NeodroidFBSStates.proto
bin/protoc -j -o build/java/ src/NeodroidFBSReactions.proto
