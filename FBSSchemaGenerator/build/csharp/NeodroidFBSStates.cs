// <auto-generated>
//  automatically generated by the FlatBuffers compiler, do not modify
// </auto-generated>

namespace Neodroid.FBS.State
{

using global::System;
using global::FlatBuffers;

public struct FStates : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static FStates GetRootAsFStates(ByteBuffer _bb) { return GetRootAsFStates(_bb, new FStates()); }
  public static FStates GetRootAsFStates(ByteBuffer _bb, FStates obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public static bool FStatesBufferHasIdentifier(ByteBuffer _bb) { return Table.__has_identifier(_bb, "XSTA"); }
  public void __init(int _i, ByteBuffer _bb) { __p.bb_pos = _i; __p.bb = _bb; }
  public FStates __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FState? States(int j) { int o = __p.__offset(4); return o != 0 ? (FState?)(new FState()).__assign(__p.__indirect(__p.__vector(o) + j * 4), __p.bb) : null; }
  public int StatesLength { get { int o = __p.__offset(4); return o != 0 ? __p.__vector_len(o) : 0; } }
  public FState? StatesByKey(string key) { int o = __p.__offset(4); return o != 0 ? FState.__lookup_by_key(__p.__vector(o), key, __p.bb) : null; }
  public string ApiVersion { get { int o = __p.__offset(6); return o != 0 ? __p.__string(o + __p.bb_pos) : null; } }
#if ENABLE_SPAN_T
  public Span<byte> GetApiVersionBytes() { return __p.__vector_as_span(6); }
#else
  public ArraySegment<byte>? GetApiVersionBytes() { return __p.__vector_as_arraysegment(6); }
#endif
  public byte[] GetApiVersionArray() { return __p.__vector_as_array<byte>(6); }
  public Neodroid.FBS.FSimulatorConfiguration? SimulatorConfiguration { get { int o = __p.__offset(8); return o != 0 ? (Neodroid.FBS.FSimulatorConfiguration?)(new Neodroid.FBS.FSimulatorConfiguration()).__assign(o + __p.bb_pos, __p.bb) : null; } }

  public static void StartFStates(FlatBufferBuilder builder) { builder.StartObject(3); }
  public static void AddStates(FlatBufferBuilder builder, VectorOffset statesOffset) { builder.AddOffset(0, statesOffset.Value, 0); }
  public static VectorOffset CreateStatesVector(FlatBufferBuilder builder, Offset<FState>[] data) { builder.StartVector(4, data.Length, 4); for (int i = data.Length - 1; i >= 0; i--) builder.AddOffset(data[i].Value); return builder.EndVector(); }
  public static VectorOffset CreateStatesVectorBlock(FlatBufferBuilder builder, Offset<FState>[] data) { builder.StartVector(4, data.Length, 4); builder.Add(data); return builder.EndVector(); }
  public static void StartStatesVector(FlatBufferBuilder builder, int numElems) { builder.StartVector(4, numElems, 4); }
  public static void AddApiVersion(FlatBufferBuilder builder, StringOffset apiVersionOffset) { builder.AddOffset(1, apiVersionOffset.Value, 0); }
  public static void AddSimulatorConfiguration(FlatBufferBuilder builder, Offset<Neodroid.FBS.FSimulatorConfiguration> simulatorConfigurationOffset) { builder.AddStruct(2, simulatorConfigurationOffset.Value, 0); }
  public static Offset<FStates> EndFStates(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<FStates>(o);
  }
  public static void FinishFStatesBuffer(FlatBufferBuilder builder, Offset<FStates> offset) { builder.Finish(offset.Value, "XSTA"); }
  public static void FinishSizePrefixedFStatesBuffer(FlatBufferBuilder builder, Offset<FStates> offset) { builder.FinishSizePrefixed(offset.Value, "XSTA"); }
};


}
