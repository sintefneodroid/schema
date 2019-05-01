// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS.State;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FMotor extends Table {
  public static FMotor getRootAsFMotor(ByteBuffer _bb) { return getRootAsFMotor(_bb, new FMotor()); }
  public static FMotor getRootAsFMotor(ByteBuffer _bb, FMotor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FMotor __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String motorName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer motorNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public Neodroid.FBS.FRange validInput() { return validInput(new Neodroid.FBS.FRange()); }
  public Neodroid.FBS.FRange validInput(Neodroid.FBS.FRange obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float energySpentSinceReset() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static void startFMotor(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addMotorName(FlatBufferBuilder builder, int motorNameOffset) { builder.addOffset(0, motorNameOffset, 0); }
  public static void addValidInput(FlatBufferBuilder builder, int validInputOffset) { builder.addStruct(1, validInputOffset, 0); }
  public static void addEnergySpentSinceReset(FlatBufferBuilder builder, float energySpentSinceReset) { builder.addFloat(2, energySpentSinceReset, 0.0f); }
  public static int endFMotor(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // motor_name
    builder.required(o, 6);  // valid_input
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static FMotor __lookup_by_key(int vectorLocation, String key, ByteBuffer bb) {
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
        return new FMotor().__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

