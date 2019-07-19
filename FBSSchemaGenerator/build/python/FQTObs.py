# automatically generated by the FlatBuffers compiler, do not modify

# namespace: FBS

import flatbuffers

class FQTObs(object):
    __slots__ = ['_tab']

    @classmethod
    def GetRootAsFQTObs(cls, buf, offset):
        n = flatbuffers.encode.Get(flatbuffers.packer.uoffset, buf, offset)
        x = FQTObs()
        x.Init(buf, n + offset)
        return x

    # FQTObs
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # FQTObs
    def Transform(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(4))
        if o != 0:
            x = o + self._tab.Pos
            from .FQuaternionTransform import FQuaternionTransform
            obj = FQuaternionTransform()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FQTObs
    def PosRange(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            x = o + self._tab.Pos
            from .FRange import FRange
            obj = FRange()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FQTObs
    def RotRange(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            x = o + self._tab.Pos
            from .FRange import FRange
            obj = FRange()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

def FQTObsStart(builder): builder.StartObject(3)
def FQTObsAddTransform(builder, transform): builder.PrependStructSlot(0, flatbuffers.number_types.UOffsetTFlags.py_type(transform), 0)
def FQTObsAddPosRange(builder, posRange): builder.PrependStructSlot(1, flatbuffers.number_types.UOffsetTFlags.py_type(posRange), 0)
def FQTObsAddRotRange(builder, rotRange): builder.PrependStructSlot(2, flatbuffers.number_types.UOffsetTFlags.py_type(rotRange), 0)
def FQTObsEnd(builder): return builder.EndObject()