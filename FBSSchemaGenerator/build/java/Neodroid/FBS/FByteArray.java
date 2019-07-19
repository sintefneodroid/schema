// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FByteArray extends Table {
  public static FByteArray getRootAsFByteArray(ByteBuffer _bb) { return getRootAsFByteArray(_bb, new FByteArray()); }
  public static FByteArray getRootAsFByteArray(ByteBuffer _bb, FByteArray obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FByteArray __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int bytes(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int bytesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer bytesAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer bytesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int type() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int shape(int j) { int o = __offset(8); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int shapeLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer shapeAsByteBuffer() { return __vector_as_bytebuffer(8, 4); }
  public ByteBuffer shapeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 4); }

  public static int createFByteArray(FlatBufferBuilder builder,
      int bytesOffset,
      int type,
      int shapeOffset) {
    builder.startObject(3);
    FByteArray.addShape(builder, shapeOffset);
    FByteArray.addBytes(builder, bytesOffset);
    FByteArray.addType(builder, type);
    return FByteArray.endFByteArray(builder);
  }

  public static void startFByteArray(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addBytes(FlatBufferBuilder builder, int bytesOffset) { builder.addOffset(0, bytesOffset, 0); }
  public static int createBytesVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startBytesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addByte(1, (byte)type, (byte)0); }
  public static void addShape(FlatBufferBuilder builder, int shapeOffset) { builder.addOffset(2, shapeOffset, 0); }
  public static int createShapeVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startShapeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFByteArray(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // bytes
    return o;
  }
}

