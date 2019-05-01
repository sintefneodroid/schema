// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FBody extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FBody __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FVector3 velocity() { return velocity(new FVector3()); }
  public FVector3 velocity(FVector3 obj) { return obj.__assign(bb_pos + 0, bb); }
  public FVector3 angularVelocity() { return angularVelocity(new FVector3()); }
  public FVector3 angularVelocity(FVector3 obj) { return obj.__assign(bb_pos + 24, bb); }

  public static int createFBody(FlatBufferBuilder builder, double velocity_x, double velocity_y, double velocity_z, double angular_velocity_x, double angular_velocity_y, double angular_velocity_z) {
    builder.prep(8, 48);
    builder.prep(8, 24);
    builder.putDouble(angular_velocity_z);
    builder.putDouble(angular_velocity_y);
    builder.putDouble(angular_velocity_x);
    builder.prep(8, 24);
    builder.putDouble(velocity_z);
    builder.putDouble(velocity_y);
    builder.putDouble(velocity_x);
    return builder.offset();
  }
}
