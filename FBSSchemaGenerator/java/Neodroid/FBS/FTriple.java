// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FTriple extends Table {
  public static FTriple getRootAsFTriple(ByteBuffer _bb) { return getRootAsFTriple(_bb, new FTriple()); }
  public static FTriple getRootAsFTriple(ByteBuffer _bb, FTriple obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FTriple __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FVector3 vec3() { return vec3(new FVector3()); }
  public FVector3 vec3(FVector3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public FRange xRange() { return xRange(new FRange()); }
  public FRange xRange(FRange obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public FRange yRange() { return yRange(new FRange()); }
  public FRange yRange(FRange obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public FRange zRange() { return zRange(new FRange()); }
  public FRange zRange(FRange obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startFTriple(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addVec3(FlatBufferBuilder builder, int vec3Offset) { builder.addStruct(0, vec3Offset, 0); }
  public static void addXRange(FlatBufferBuilder builder, int xRangeOffset) { builder.addStruct(1, xRangeOffset, 0); }
  public static void addYRange(FlatBufferBuilder builder, int yRangeOffset) { builder.addStruct(2, yRangeOffset, 0); }
  public static void addZRange(FlatBufferBuilder builder, int zRangeOffset) { builder.addStruct(3, zRangeOffset, 0); }
  public static int endFTriple(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // vec3
    return o;
  }
}

