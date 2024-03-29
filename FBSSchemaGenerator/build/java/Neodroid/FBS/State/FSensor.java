// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS.State;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FSensor extends Table {
  public static FSensor getRootAsFSensor(ByteBuffer _bb) { return getRootAsFSensor(_bb, new FSensor()); }
  public static FSensor getRootAsFSensor(ByteBuffer _bb, FSensor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public FSensor __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String sensorName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sensorNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer sensorNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public byte sensorValueType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table sensorValue(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o) : null; }

  public static int createFSensor(FlatBufferBuilder builder,
      int sensor_nameOffset,
      byte sensor_value_type,
      int sensor_valueOffset) {
    builder.startObject(3);
    FSensor.addSensorValue(builder, sensor_valueOffset);
    FSensor.addSensorName(builder, sensor_nameOffset);
    FSensor.addSensorValueType(builder, sensor_value_type);
    return FSensor.endFSensor(builder);
  }

  public static void startFSensor(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSensorName(FlatBufferBuilder builder, int sensorNameOffset) { builder.addOffset(0, sensorNameOffset, 0); }
  public static void addSensorValueType(FlatBufferBuilder builder, byte sensorValueType) { builder.addByte(1, sensorValueType, 0); }
  public static void addSensorValue(FlatBufferBuilder builder, int sensorValueOffset) { builder.addOffset(2, sensorValueOffset, 0); }
  public static int endFSensor(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // sensor_name
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static FSensor __lookup_by_key(FSensor obj, int vectorLocation, String key, ByteBuffer bb) {
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
        return (obj == null ? new FSensor() : obj).__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

