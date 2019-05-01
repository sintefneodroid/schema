#!/usr/bin/env bash
rm java/ -r
mkdir java
flatc -j -o java/ NeodroidFBSShared.fbs
flatc -j -o java/ NeodroidFBSTypes.fbs
flatc -j -o java/ NeodroidFBSReaction.fbs
flatc -j -o java/ NeodroidFBSObservation.fbs
flatc -j -o java/ NeodroidFBSState.fbs
flatc -j -o java/ NeodroidFBSStates.fbs
flatc -j -o java/ NeodroidFBSReactions.fbs
