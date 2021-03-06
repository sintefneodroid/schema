# automatically generated by the FlatBuffers compiler, do not modify

# namespace: Reaction

import flatbuffers

class FReactionParameters(object):
    __slots__ = ['_tab']

    # FReactionParameters
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # FReactionParameters
    def Terminable(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(0))
    # FReactionParameters
    def Step(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(1))
    # FReactionParameters
    def Reset(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(2))
    # FReactionParameters
    def Configure(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(3))
    # FReactionParameters
    def Describe(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(4))
    # FReactionParameters
    def EpisodeCount(self): return self._tab.Get(flatbuffers.number_types.BoolFlags, self._tab.Pos + flatbuffers.number_types.UOffsetTFlags.py_type(5))

def CreateFReactionParameters(builder, terminable, step, reset, configure, describe, episodeCount):
    builder.Prep(1, 6)
    builder.PrependBool(episodeCount)
    builder.PrependBool(describe)
    builder.PrependBool(configure)
    builder.PrependBool(reset)
    builder.PrependBool(step)
    builder.PrependBool(terminable)
    return builder.Offset()
