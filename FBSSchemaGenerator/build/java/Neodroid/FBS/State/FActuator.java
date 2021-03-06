// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS.State;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FActuator extends Table {
  public static FActuator getRootAsFActuator(ByteBuffer _bb) { return getRootAsFActuator(_bb, new FActuator()); }
  public static FActuator getRootAsFActuator(ByteBuffer _bb, FActuator obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FActuator __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String actuatorName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer actuatorNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer actuatorNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public Neodroid.FBS.FRange actuatorRange() { return actuatorRange(new Neodroid.FBS.FRange()); }
  public Neodroid.FBS.FRange actuatorRange(Neodroid.FBS.FRange obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startFActuator(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addActuatorName(FlatBufferBuilder builder, int actuatorNameOffset) { builder.addOffset(0, actuatorNameOffset, 0); }
  public static void addActuatorRange(FlatBufferBuilder builder, int actuatorRangeOffset) { builder.addStruct(1, actuatorRangeOffset, 0); }
  public static int endFActuator(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // actuator_name
    builder.required(o, 6);  // actuator_range
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static FActuator __lookup_by_key(FActuator obj, int vectorLocation, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(Table.UTF8_CHARSET.get());
    int span = bb.getInt(vectorLocation - 4);
    int start = 0;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.capacity() - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return (obj == null ? new FActuator() : obj).__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

