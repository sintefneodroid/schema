# automatically generated by the FlatBuffers compiler, do not modify

# namespace: State

import flatbuffers

class FEnvironmentDescription(object):
    __slots__ = ['_tab']

    @classmethod
    def GetRootAsFEnvironmentDescription(cls, buf, offset):
        n = flatbuffers.encode.Get(flatbuffers.packer.uoffset, buf, offset)
        x = FEnvironmentDescription()
        x.Init(buf, n + offset)
        return x

    # FEnvironmentDescription
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # FEnvironmentDescription
    def Objective(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(4))
        if o != 0:
            x = self._tab.Indirect(o + self._tab.Pos)
            from .FObjective import FObjective
            obj = FObjective()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FEnvironmentDescription
    def AvailableObjectives(self, j):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            x = self._tab.Vector(o)
            x += flatbuffers.number_types.UOffsetTFlags.py_type(j) * 4
            x = self._tab.Indirect(x)
            from .FObjective import FObjective
            obj = FObjective()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FEnvironmentDescription
    def AvailableObjectivesLength(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            return self._tab.VectorLen(o)
        return 0

    # FEnvironmentDescription
    def Actors(self, j):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            x = self._tab.Vector(o)
            x += flatbuffers.number_types.UOffsetTFlags.py_type(j) * 4
            x = self._tab.Indirect(x)
            from .FActor import FActor
            obj = FActor()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FEnvironmentDescription
    def ActorsLength(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            return self._tab.VectorLen(o)
        return 0

    # FEnvironmentDescription
    def Configurables(self, j):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(10))
        if o != 0:
            x = self._tab.Vector(o)
            x += flatbuffers.number_types.UOffsetTFlags.py_type(j) * 4
            x = self._tab.Indirect(x)
            from .FConfigurable import FConfigurable
            obj = FConfigurable()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FEnvironmentDescription
    def ConfigurablesLength(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(10))
        if o != 0:
            return self._tab.VectorLen(o)
        return 0

    # FEnvironmentDescription
    def Sensors(self, j):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(12))
        if o != 0:
            x = self._tab.Vector(o)
            x += flatbuffers.number_types.UOffsetTFlags.py_type(j) * 4
            x = self._tab.Indirect(x)
            from .FSensor import FSensor
            obj = FSensor()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # FEnvironmentDescription
    def SensorsLength(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(12))
        if o != 0:
            return self._tab.VectorLen(o)
        return 0

def FEnvironmentDescriptionStart(builder): builder.StartObject(5)
def FEnvironmentDescriptionAddObjective(builder, objective): builder.PrependUOffsetTRelativeSlot(0, flatbuffers.number_types.UOffsetTFlags.py_type(objective), 0)
def FEnvironmentDescriptionAddAvailableObjectives(builder, availableObjectives): builder.PrependUOffsetTRelativeSlot(1, flatbuffers.number_types.UOffsetTFlags.py_type(availableObjectives), 0)
def FEnvironmentDescriptionStartAvailableObjectivesVector(builder, numElems): return builder.StartVector(4, numElems, 4)
def FEnvironmentDescriptionAddActors(builder, actors): builder.PrependUOffsetTRelativeSlot(2, flatbuffers.number_types.UOffsetTFlags.py_type(actors), 0)
def FEnvironmentDescriptionStartActorsVector(builder, numElems): return builder.StartVector(4, numElems, 4)
def FEnvironmentDescriptionAddConfigurables(builder, configurables): builder.PrependUOffsetTRelativeSlot(3, flatbuffers.number_types.UOffsetTFlags.py_type(configurables), 0)
def FEnvironmentDescriptionStartConfigurablesVector(builder, numElems): return builder.StartVector(4, numElems, 4)
def FEnvironmentDescriptionAddSensors(builder, sensors): builder.PrependUOffsetTRelativeSlot(4, flatbuffers.number_types.UOffsetTFlags.py_type(sensors), 0)
def FEnvironmentDescriptionStartSensorsVector(builder, numElems): return builder.StartVector(4, numElems, 4)
def FEnvironmentDescriptionEnd(builder): return builder.EndObject()
