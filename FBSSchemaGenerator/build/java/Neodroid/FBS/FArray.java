// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FArray extends Table {
  public static FArray getRootAsFArray(ByteBuffer _bb) { return getRootAsFArray(_bb, new FArray()); }
  public static FArray getRootAsFArray(ByteBuffer _bb, FArray obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FArray __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float array(int j) { int o = __offset(4); return o != 0 ? bb.getFloat(__vector(o) + j * 4) : 0; }
  public int arrayLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer arrayAsByteBuffer() { return __vector_as_bytebuffer(4, 4); }
  public ByteBuffer arrayInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 4); }
  public FRange ranges(int j) { return ranges(new FRange(), j); }
  public FRange ranges(FRange obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o) + j * 16, bb) : null; }
  public int rangesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createFArray(FlatBufferBuilder builder,
      int arrayOffset,
      int rangesOffset) {
    builder.startObject(2);
    FArray.addRanges(builder, rangesOffset);
    FArray.addArray(builder, arrayOffset);
    return FArray.endFArray(builder);
  }

  public static void startFArray(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addArray(FlatBufferBuilder builder, int arrayOffset) { builder.addOffset(0, arrayOffset, 0); }
  public static int createArrayVector(FlatBufferBuilder builder, float[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addFloat(data[i]); return builder.endVector(); }
  public static void startArrayVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addRanges(FlatBufferBuilder builder, int rangesOffset) { builder.addOffset(1, rangesOffset, 0); }
  public static void startRangesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(16, numElems, 4); }
  public static int endFArray(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // array
    return o;
  }
}

