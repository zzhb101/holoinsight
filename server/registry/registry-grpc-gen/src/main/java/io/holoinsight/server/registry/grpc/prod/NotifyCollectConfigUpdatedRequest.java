/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

/**
 * <pre>
 * 通知配置变更
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest}
 */
public  final class NotifyCollectConfigUpdatedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)
    NotifyCollectConfigUpdatedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotifyCollectConfigUpdatedRequest.newBuilder() to construct.
  private NotifyCollectConfigUpdatedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotifyCollectConfigUpdatedRequest() {
    ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    tableNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NotifyCollectConfigUpdatedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NotifyCollectConfigUpdatedRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ids_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              tableNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            tableNames_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ids_ = ids_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        tableNames_ = tableNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_NotifyCollectConfigUpdatedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_NotifyCollectConfigUpdatedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.class, io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.Builder.class);
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

  public static final int IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList ids_;
  /**
   * <pre>
   * 以下参数二选一
   * 涉及的id
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * 以下参数二选一
   * 涉及的id
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * 以下参数二选一
   * 涉及的id
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * 以下参数二选一
   * 涉及的id
   * </pre>
   *
   * <code>repeated string ids = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
  }

  public static final int TABLE_NAMES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList tableNames_;
  /**
   * <pre>
   * 变更的表名
   * </pre>
   *
   * <code>repeated string table_names = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTableNamesList() {
    return tableNames_;
  }
  /**
   * <pre>
   * 变更的表名
   * </pre>
   *
   * <code>repeated string table_names = 3;</code>
   */
  public int getTableNamesCount() {
    return tableNames_.size();
  }
  /**
   * <pre>
   * 变更的表名
   * </pre>
   *
   * <code>repeated string table_names = 3;</code>
   */
  public java.lang.String getTableNames(int index) {
    return tableNames_.get(index);
  }
  /**
   * <pre>
   * 变更的表名
   * </pre>
   *
   * <code>repeated string table_names = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTableNamesBytes(int index) {
    return tableNames_.getByteString(index);
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
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ids_.getRaw(i));
    }
    for (int i = 0; i < tableNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tableNames_.getRaw(i));
    }
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
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tableNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(tableNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTableNamesList().size();
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
    if (!(obj instanceof io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest other = (io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getIdsList()
        .equals(other.getIdsList())) return false;
    if (!getTableNamesList()
        .equals(other.getTableNamesList())) return false;
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    if (getTableNamesCount() > 0) {
      hash = (37 * hash) + TABLE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getTableNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parseFrom(
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
  public static Builder newBuilder(io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest prototype) {
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
   * 通知配置变更
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)
      io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_NotifyCollectConfigUpdatedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_NotifyCollectConfigUpdatedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.class, io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.Builder.class);
    }

    // Construct using io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.newBuilder()
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
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      tableNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_NotifyCollectConfigUpdatedRequest_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest build() {
      io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest buildPartial() {
      io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest result = new io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        ids_ = ids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
      if (((bitField0_ & 0x00000002) != 0)) {
        tableNames_ = tableNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.tableNames_ = tableNames_;
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
      if (other instanceof io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest) {
        return mergeFrom((io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest other) {
      if (other == io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
      }
      if (!other.tableNames_.isEmpty()) {
        if (tableNames_.isEmpty()) {
          tableNames_ = other.tableNames_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTableNamesIsMutable();
          tableNames_.addAll(other.tableNames_);
        }
        onChanged();
      }
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
      io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest) e.getUnfinishedMessage();
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

    private com.google.protobuf.LazyStringList ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      return ids_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public Builder clearIds() {
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 以下参数二选一
     * 涉及的id
     * </pre>
     *
     * <code>repeated string ids = 2;</code>
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tableNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTableNamesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        tableNames_ = new com.google.protobuf.LazyStringArrayList(tableNames_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTableNamesList() {
      return tableNames_.getUnmodifiableView();
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public int getTableNamesCount() {
      return tableNames_.size();
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public java.lang.String getTableNames(int index) {
      return tableNames_.get(index);
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTableNamesBytes(int index) {
      return tableNames_.getByteString(index);
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public Builder setTableNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTableNamesIsMutable();
      tableNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public Builder addTableNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTableNamesIsMutable();
      tableNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public Builder addAllTableNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureTableNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tableNames_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public Builder clearTableNames() {
      tableNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 变更的表名
     * </pre>
     *
     * <code>repeated string table_names = 3;</code>
     */
    public Builder addTableNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTableNamesIsMutable();
      tableNames_.add(value);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest)
  private static final io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest();
  }

  public static io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotifyCollectConfigUpdatedRequest>
      PARSER = new com.google.protobuf.AbstractParser<NotifyCollectConfigUpdatedRequest>() {
    @java.lang.Override
    public NotifyCollectConfigUpdatedRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NotifyCollectConfigUpdatedRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotifyCollectConfigUpdatedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotifyCollectConfigUpdatedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.prod.NotifyCollectConfigUpdatedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

