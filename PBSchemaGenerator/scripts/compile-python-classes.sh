#!/usr/bin/env bash
rm build/python/ -rf
mkdir -p build/python
bin/protoc -I=. --python_out=build/python/ src/test.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSShared.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSTypes.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSReaction.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSObservation.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSState.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSStates.proto
bin/protoc -I=. --python_out=build/python/ src/NeodroidFBSReactions.proto
