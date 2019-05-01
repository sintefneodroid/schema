// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FVector3s extends Table {
  public static FVector3s getRootAsFVector3s(ByteBuffer _bb) { return getRootAsFVector3s(_bb, new FVector3s()); }
  public static FVector3s getRootAsFVector3s(ByteBuffer _bb, FVector3s obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FVector3s __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FVector3 points(int j) { return points(new FVector3(), j); }
  public FVector3 points(FVector3 obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o) + j * 24, bb) : null; }
  public int pointsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createFVector3s(FlatBufferBuilder builder,
      int pointsOffset) {
    builder.startObject(1);
    FVector3s.addPoints(builder, pointsOffset);
    return FVector3s.endFVector3s(builder);
  }

  public static void startFVector3s(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPoints(FlatBufferBuilder builder, int pointsOffset) { builder.addOffset(0, pointsOffset, 0); }
  public static void startPointsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(24, numElems, 8); }
  public static int endFVector3s(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // points
    return o;
  }
}

