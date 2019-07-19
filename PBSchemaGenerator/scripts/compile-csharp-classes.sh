#!/usr/bin/env bash
rm build/csharp -rf
mkdir -p build/csharp
bin/protoc -n -o build/csharp/ src/NeodroidFBSShared.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSTypes.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSReaction.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSObservation.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSState.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSStates.proto --gen-onefile
bin/protoc -n -o build/csharp/ src/NeodroidFBSReactions.proto --gen-onefile
