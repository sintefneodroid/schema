// <auto-generated>
//  automatically generated by the FlatBuffers compiler, do not modify
// </auto-generated>

namespace Neodroid.FBS.Reaction
{

using global::System;
using global::FlatBuffers;

public struct FReactions : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static FReactions GetRootAsFReactions(ByteBuffer _bb) { return GetRootAsFReactions(_bb, new FReactions()); }
  public static FReactions GetRootAsFReactions(ByteBuffer _bb, FReactions obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public static bool FReactionsBufferHasIdentifier(ByteBuffer _bb) { return Table.__has_identifier(_bb, "XREA"); }
  public void __init(int _i, ByteBuffer _bb) { __p.bb_pos = _i; __p.bb = _bb; }
  public FReactions __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FReaction? Reactions(int j) { int o = __p.__offset(4); return o != 0 ? (FReaction?)(new FReaction()).__assign(__p.__indirect(__p.__vector(o) + j * 4), __p.bb) : null; }
  public int ReactionsLength { get { int o = __p.__offset(4); return o != 0 ? __p.__vector_len(o) : 0; } }
  public FReaction? ReactionsByKey(string key) { int o = __p.__offset(4); return o != 0 ? FReaction.__lookup_by_key(__p.__vector(o), key, __p.bb) : null; }

  public static Offset<FReactions> CreateFReactions(FlatBufferBuilder builder,
      VectorOffset reactionsOffset = default(VectorOffset)) {
    builder.StartObject(1);
    FReactions.AddReactions(builder, reactionsOffset);
    return FReactions.EndFReactions(builder);
  }

  public static void StartFReactions(FlatBufferBuilder builder) { builder.StartObject(1); }
  public static void AddReactions(FlatBufferBuilder builder, VectorOffset reactionsOffset) { builder.AddOffset(0, reactionsOffset.Value, 0); }
  public static VectorOffset CreateReactionsVector(FlatBufferBuilder builder, Offset<FReaction>[] data) { builder.StartVector(4, data.Length, 4); for (int i = data.Length - 1; i >= 0; i--) builder.AddOffset(data[i].Value); return builder.EndVector(); }
  public static void StartReactionsVector(FlatBufferBuilder builder, int numElems) { builder.StartVector(4, numElems, 4); }
  public static Offset<FReactions> EndFReactions(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<FReactions>(o);
  }
  public static void FinishFReactionsBuffer(FlatBufferBuilder builder, Offset<FReactions> offset) { builder.Finish(offset.Value, "XREA"); }
};


}
