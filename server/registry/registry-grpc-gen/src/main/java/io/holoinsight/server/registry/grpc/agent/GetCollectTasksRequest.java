/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-agent.proto

package io.holoinsight.server.registry.grpc.agent;

/**
 * <pre>
 * 同步配置的请求
 * 之类展开说一下同步配置的细节:
 * 1. 该接口做的是全量同步
 * 2. 最简单的做法是返回的配置是一个数组 [{...}]
 * 3. 但显然这样返回的内容会有点多, 每次哪怕只有1个元素变了, 也要返回所有元素 (这在域外可能是可以接受的, 配置少), 但在主站是不太好的
 * 4. 这在公有云上也不太好, 因为SLB可能是按流量收费的
 * 5. 所以要像办法减少传输的数据量, 只传输必要的数据(但方案又不能太复杂
 * 于是有了如下的buckets分桶方案
 * 1. 将配置分在若干个桶里即 map&lt;string, [{}]&gt;, agent不用管桶的key是如何决定的, 对agent来说就是一个字符串而已
 * 2. registry侧决定桶的key的具体取值, 比如在主站(对于vessel)可以取agentIp, 按agentIp分桶, 对于域外, 如果认为配置数不多, 那么可以总是取为 "", 这样相当于不分桶
 * 3. registry会保证, 对于同一个配置始终是在一个桶里, 也就是说这个分配的算法是不能改变的
 * 4. 该方案实际上只是通过分桶减少了发生改变时需要传递的数据量, 但并没有完全减少不必要的传输
 * 5. 想做到理想的完全避免不必要的传输, 则双方需要交换 task keys, 通过对比新旧 task keys 决定出哪些 tasks 需要变更; 这个流程比较繁琐, 在云上不一定要实现
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest}
 */
public  final class GetCollectTasksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)
    GetCollectTasksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCollectTasksRequest.newBuilder() to construct.
  private GetCollectTasksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCollectTasksRequest() {
    agentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCollectTasksRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCollectTasksRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.holoinsight.server.common.grpc.CommonRequestHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(io.holoinsight.server.common.grpc.CommonRequestHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            agentId_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              buckets_ = com.google.protobuf.MapField.newMapField(
                  BucketsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            buckets__ = input.readMessage(
                BucketsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            buckets_.getMutableMap().put(
                buckets__.getKey(), buckets__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetBuckets();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.class, io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.holoinsight.server.common.grpc.CommonRequestHeader header_;
  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonRequestHeader getHeader() {
    return header_ == null ? io.holoinsight.server.common.grpc.CommonRequestHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int AGENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object agentId_;
  /**
   * <code>string agent_id = 2;</code>
   */
  public java.lang.String getAgentId() {
    java.lang.Object ref = agentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentId_ = s;
      return s;
    }
  }
  /**
   * <code>string agent_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAgentIdBytes() {
    java.lang.Object ref = agentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUCKETS_FIELD_NUMBER = 3;
  private static final class BucketsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_BucketsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> buckets_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetBuckets() {
    if (buckets_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BucketsDefaultEntryHolder.defaultEntry);
    }
    return buckets_;
  }

  public int getBucketsCount() {
    return internalGetBuckets().getMap().size();
  }
  /**
   * <pre>
   * agent持有的所有buckets的状态
   * </pre>
   *
   * <code>map&lt;string, string&gt; buckets = 3;</code>
   */

  public boolean containsBuckets(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetBuckets().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBucketsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getBuckets() {
    return getBucketsMap();
  }
  /**
   * <pre>
   * agent持有的所有buckets的状态
   * </pre>
   *
   * <code>map&lt;string, string&gt; buckets = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getBucketsMap() {
    return internalGetBuckets().getMap();
  }
  /**
   * <pre>
   * agent持有的所有buckets的状态
   * </pre>
   *
   * <code>map&lt;string, string&gt; buckets = 3;</code>
   */

  public java.lang.String getBucketsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBuckets().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * agent持有的所有buckets的状态
   * </pre>
   *
   * <code>map&lt;string, string&gt; buckets = 3;</code>
   */

  public java.lang.String getBucketsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBuckets().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (!getAgentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agentId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBuckets(),
        BucketsDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (!getAgentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetBuckets().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      buckets__ = BucketsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, buckets__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest other = (io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getAgentId()
        .equals(other.getAgentId())) return false;
    if (!internalGetBuckets().equals(
        other.internalGetBuckets())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + AGENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAgentId().hashCode();
    if (!internalGetBuckets().getMap().isEmpty()) {
      hash = (37 * hash) + BUCKETS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBuckets().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 同步配置的请求
   * 之类展开说一下同步配置的细节:
   * 1. 该接口做的是全量同步
   * 2. 最简单的做法是返回的配置是一个数组 [{...}]
   * 3. 但显然这样返回的内容会有点多, 每次哪怕只有1个元素变了, 也要返回所有元素 (这在域外可能是可以接受的, 配置少), 但在主站是不太好的
   * 4. 这在公有云上也不太好, 因为SLB可能是按流量收费的
   * 5. 所以要像办法减少传输的数据量, 只传输必要的数据(但方案又不能太复杂
   * 于是有了如下的buckets分桶方案
   * 1. 将配置分在若干个桶里即 map&lt;string, [{}]&gt;, agent不用管桶的key是如何决定的, 对agent来说就是一个字符串而已
   * 2. registry侧决定桶的key的具体取值, 比如在主站(对于vessel)可以取agentIp, 按agentIp分桶, 对于域外, 如果认为配置数不多, 那么可以总是取为 "", 这样相当于不分桶
   * 3. registry会保证, 对于同一个配置始终是在一个桶里, 也就是说这个分配的算法是不能改变的
   * 4. 该方案实际上只是通过分桶减少了发生改变时需要传递的数据量, 但并没有完全减少不必要的传输
   * 5. 想做到理想的完全避免不必要的传输, 则双方需要交换 task keys, 通过对比新旧 task keys 决定出哪些 tasks 需要变更; 这个流程比较繁琐, 在云上不一定要实现
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)
      io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetBuckets();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableBuckets();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.class, io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.Builder.class);
    }

    // Construct using io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      agentId_ = "";

      internalGetMutableBuckets().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_GetCollectTasksRequest_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest build() {
      io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest buildPartial() {
      io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest result = new io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.agentId_ = agentId_;
      result.buckets_ = internalGetBuckets();
      result.buckets_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest) {
        return mergeFrom((io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest other) {
      if (other == io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getAgentId().isEmpty()) {
        agentId_ = other.agentId_;
        onChanged();
      }
      internalGetMutableBuckets().mergeFrom(
          other.internalGetBuckets());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.holoinsight.server.common.grpc.CommonRequestHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.holoinsight.server.common.grpc.CommonRequestHeader, io.holoinsight.server.common.grpc.CommonRequestHeader.Builder, io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonRequestHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? io.holoinsight.server.common.grpc.CommonRequestHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public Builder setHeader(io.holoinsight.server.common.grpc.CommonRequestHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public Builder setHeader(
        io.holoinsight.server.common.grpc.CommonRequestHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public Builder mergeHeader(io.holoinsight.server.common.grpc.CommonRequestHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            io.holoinsight.server.common.grpc.CommonRequestHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonRequestHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            io.holoinsight.server.common.grpc.CommonRequestHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.io.holoinsight.server.common.grpc.CommonRequestHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.holoinsight.server.common.grpc.CommonRequestHeader, io.holoinsight.server.common.grpc.CommonRequestHeader.Builder, io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.holoinsight.server.common.grpc.CommonRequestHeader, io.holoinsight.server.common.grpc.CommonRequestHeader.Builder, io.holoinsight.server.common.grpc.CommonRequestHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.lang.Object agentId_ = "";
    /**
     * <code>string agent_id = 2;</code>
     */
    public java.lang.String getAgentId() {
      java.lang.Object ref = agentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string agent_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAgentIdBytes() {
      java.lang.Object ref = agentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string agent_id = 2;</code>
     */
    public Builder setAgentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      agentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string agent_id = 2;</code>
     */
    public Builder clearAgentId() {
      
      agentId_ = getDefaultInstance().getAgentId();
      onChanged();
      return this;
    }
    /**
     * <code>string agent_id = 2;</code>
     */
    public Builder setAgentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      agentId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> buckets_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetBuckets() {
      if (buckets_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BucketsDefaultEntryHolder.defaultEntry);
      }
      return buckets_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableBuckets() {
      onChanged();;
      if (buckets_ == null) {
        buckets_ = com.google.protobuf.MapField.newMapField(
            BucketsDefaultEntryHolder.defaultEntry);
      }
      if (!buckets_.isMutable()) {
        buckets_ = buckets_.copy();
      }
      return buckets_;
    }

    public int getBucketsCount() {
      return internalGetBuckets().getMap().size();
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public boolean containsBuckets(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBuckets().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBucketsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getBuckets() {
      return getBucketsMap();
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getBucketsMap() {
      return internalGetBuckets().getMap();
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public java.lang.String getBucketsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBuckets().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public java.lang.String getBucketsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBuckets().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBuckets() {
      internalGetMutableBuckets().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public Builder removeBuckets(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBuckets().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableBuckets() {
      return internalGetMutableBuckets().getMutableMap();
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */
    public Builder putBuckets(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBuckets().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * agent持有的所有buckets的状态
     * </pre>
     *
     * <code>map&lt;string, string&gt; buckets = 3;</code>
     */

    public Builder putAllBuckets(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableBuckets().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest)
  private static final io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest();
  }

  public static io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCollectTasksRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCollectTasksRequest>() {
    @java.lang.Override
    public GetCollectTasksRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCollectTasksRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCollectTasksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCollectTasksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.agent.GetCollectTasksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

