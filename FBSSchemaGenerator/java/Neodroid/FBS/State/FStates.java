// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS.State;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FStates extends Table {
  public static FStates getRootAsFStates(ByteBuffer _bb) { return getRootAsFStates(_bb, new FStates()); }
  public static FStates getRootAsFStates(ByteBuffer _bb, FStates obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean FStatesBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "XSTA"); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FStates __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FState states(int j) { return states(new FState(), j); }
  public FState states(FState obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int statesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public FState statesByKey(String key) { int o = __offset(4); return o != 0 ? FState.__lookup_by_key(__vector(o), key, bb) : null; }
  public String apiVersion() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer apiVersionAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public Neodroid.FBS.FSimulatorConfiguration simulatorConfiguration() { return simulatorConfiguration(new Neodroid.FBS.FSimulatorConfiguration()); }
  public Neodroid.FBS.FSimulatorConfiguration simulatorConfiguration(Neodroid.FBS.FSimulatorConfiguration obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startFStates(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addStates(FlatBufferBuilder builder, int statesOffset) { builder.addOffset(0, statesOffset, 0); }
  public static int createStatesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startStatesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addApiVersion(FlatBufferBuilder builder, int apiVersionOffset) { builder.addOffset(1, apiVersionOffset, 0); }
  public static void addSimulatorConfiguration(FlatBufferBuilder builder, int simulatorConfigurationOffset) { builder.addStruct(2, simulatorConfigurationOffset, 0); }
  public static int endFStates(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFStatesBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "XSTA"); }
}

