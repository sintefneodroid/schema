// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS.Reaction;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FReactionParameters extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FReactionParameters __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean terminable() { return 0!=bb.get(bb_pos + 0); }
  public boolean step() { return 0!=bb.get(bb_pos + 1); }
  public boolean reset() { return 0!=bb.get(bb_pos + 2); }
  public boolean configure() { return 0!=bb.get(bb_pos + 3); }
  public boolean describe() { return 0!=bb.get(bb_pos + 4); }
  public boolean episodeCount() { return 0!=bb.get(bb_pos + 5); }

  public static int createFReactionParameters(FlatBufferBuilder builder, boolean terminable, boolean step, boolean reset, boolean configure, boolean describe, boolean episodeCount) {
    builder.prep(1, 6);
    builder.putBoolean(episodeCount);
    builder.putBoolean(describe);
    builder.putBoolean(configure);
    builder.putBoolean(reset);
    builder.putBoolean(step);
    builder.putBoolean(terminable);
    return builder.offset();
  }
}

