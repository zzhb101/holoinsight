/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

/**
 * <pre>
 * 试切分/正则切分结果预览
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.SplitLogRequest}
 */
public  final class SplitLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.prod.SplitLogRequest)
    SplitLogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SplitLogRequest.newBuilder() to construct.
  private SplitLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SplitLogRequest() {
    agentId_ = "";
    content_ = "";
    regexp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SplitLogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SplitLogRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            regexp_ = s;
            break;
          }
          case 42: {
            io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder subBuilder = null;
            if (target_ != null) {
              subBuilder = target_.toBuilder();
            }
            target_ = input.readMessage(io.holoinsight.server.registry.grpc.prod.TargetIdentifier.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(target_);
              target_ = subBuilder.buildPartial();
            }

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
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.registry.grpc.prod.SplitLogRequest.class, io.holoinsight.server.registry.grpc.prod.SplitLogRequest.Builder.class);
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

  public static final int CONTENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 3;</code>
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 3;</code>
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGEXP_FIELD_NUMBER = 4;
  private volatile java.lang.Object regexp_;
  /**
   * <code>string regexp = 4;</code>
   */
  public java.lang.String getRegexp() {
    java.lang.Object ref = regexp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regexp_ = s;
      return s;
    }
  }
  /**
   * <code>string regexp = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRegexpBytes() {
    java.lang.Object ref = regexp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regexp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_FIELD_NUMBER = 5;
  private io.holoinsight.server.registry.grpc.prod.TargetIdentifier target_;
  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  public boolean hasTarget() {
    return target_ != null;
  }
  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  public io.holoinsight.server.registry.grpc.prod.TargetIdentifier getTarget() {
    return target_ == null ? io.holoinsight.server.registry.grpc.prod.TargetIdentifier.getDefaultInstance() : target_;
  }
  /**
   * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
   */
  public io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder getTargetOrBuilder() {
    return getTarget();
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
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    if (!getRegexpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, regexp_);
    }
    if (target_ != null) {
      output.writeMessage(5, getTarget());
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
    if (!getAgentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentId_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
    }
    if (!getRegexpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, regexp_);
    }
    if (target_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTarget());
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
    if (!(obj instanceof io.holoinsight.server.registry.grpc.prod.SplitLogRequest)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.prod.SplitLogRequest other = (io.holoinsight.server.registry.grpc.prod.SplitLogRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getAgentId()
        .equals(other.getAgentId())) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (!getRegexp()
        .equals(other.getRegexp())) return false;
    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
    }
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + REGEXP_FIELD_NUMBER;
    hash = (53 * hash) + getRegexp().hashCode();
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest parseFrom(
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
  public static Builder newBuilder(io.holoinsight.server.registry.grpc.prod.SplitLogRequest prototype) {
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
   * 试切分/正则切分结果预览
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.SplitLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.prod.SplitLogRequest)
      io.holoinsight.server.registry.grpc.prod.SplitLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.registry.grpc.prod.SplitLogRequest.class, io.holoinsight.server.registry.grpc.prod.SplitLogRequest.Builder.class);
    }

    // Construct using io.holoinsight.server.registry.grpc.prod.SplitLogRequest.newBuilder()
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

      content_ = "";

      regexp_ = "";

      if (targetBuilder_ == null) {
        target_ = null;
      } else {
        target_ = null;
        targetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogRequest_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogRequest getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.prod.SplitLogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogRequest build() {
      io.holoinsight.server.registry.grpc.prod.SplitLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogRequest buildPartial() {
      io.holoinsight.server.registry.grpc.prod.SplitLogRequest result = new io.holoinsight.server.registry.grpc.prod.SplitLogRequest(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.agentId_ = agentId_;
      result.content_ = content_;
      result.regexp_ = regexp_;
      if (targetBuilder_ == null) {
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
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
      if (other instanceof io.holoinsight.server.registry.grpc.prod.SplitLogRequest) {
        return mergeFrom((io.holoinsight.server.registry.grpc.prod.SplitLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.registry.grpc.prod.SplitLogRequest other) {
      if (other == io.holoinsight.server.registry.grpc.prod.SplitLogRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getAgentId().isEmpty()) {
        agentId_ = other.agentId_;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (!other.getRegexp().isEmpty()) {
        regexp_ = other.regexp_;
        onChanged();
      }
      if (other.hasTarget()) {
        mergeTarget(other.getTarget());
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
      io.holoinsight.server.registry.grpc.prod.SplitLogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.registry.grpc.prod.SplitLogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 3;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object regexp_ = "";
    /**
     * <code>string regexp = 4;</code>
     */
    public java.lang.String getRegexp() {
      java.lang.Object ref = regexp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regexp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string regexp = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRegexpBytes() {
      java.lang.Object ref = regexp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regexp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string regexp = 4;</code>
     */
    public Builder setRegexp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      regexp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string regexp = 4;</code>
     */
    public Builder clearRegexp() {
      
      regexp_ = getDefaultInstance().getRegexp();
      onChanged();
      return this;
    }
    /**
     * <code>string regexp = 4;</code>
     */
    public Builder setRegexpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      regexp_ = value;
      onChanged();
      return this;
    }

    private io.holoinsight.server.registry.grpc.prod.TargetIdentifier target_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.holoinsight.server.registry.grpc.prod.TargetIdentifier, io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder, io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder> targetBuilder_;
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public boolean hasTarget() {
      return targetBuilder_ != null || target_ != null;
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public io.holoinsight.server.registry.grpc.prod.TargetIdentifier getTarget() {
      if (targetBuilder_ == null) {
        return target_ == null ? io.holoinsight.server.registry.grpc.prod.TargetIdentifier.getDefaultInstance() : target_;
      } else {
        return targetBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public Builder setTarget(io.holoinsight.server.registry.grpc.prod.TargetIdentifier value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        targetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public Builder setTarget(
        io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder builderForValue) {
      if (targetBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        targetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public Builder mergeTarget(io.holoinsight.server.registry.grpc.prod.TargetIdentifier value) {
      if (targetBuilder_ == null) {
        if (target_ != null) {
          target_ =
            io.holoinsight.server.registry.grpc.prod.TargetIdentifier.newBuilder(target_).mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        targetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = null;
        onChanged();
      } else {
        target_ = null;
        targetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder getTargetBuilder() {
      
      onChanged();
      return getTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    public io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder getTargetOrBuilder() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilder();
      } else {
        return target_ == null ?
            io.holoinsight.server.registry.grpc.prod.TargetIdentifier.getDefaultInstance() : target_;
      }
    }
    /**
     * <code>.io.holoinsight.server.registry.grpc.prod.TargetIdentifier target = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.holoinsight.server.registry.grpc.prod.TargetIdentifier, io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder, io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.holoinsight.server.registry.grpc.prod.TargetIdentifier, io.holoinsight.server.registry.grpc.prod.TargetIdentifier.Builder, io.holoinsight.server.registry.grpc.prod.TargetIdentifierOrBuilder>(
                getTarget(),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.prod.SplitLogRequest)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.prod.SplitLogRequest)
  private static final io.holoinsight.server.registry.grpc.prod.SplitLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.registry.grpc.prod.SplitLogRequest();
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<SplitLogRequest>() {
    @java.lang.Override
    public SplitLogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SplitLogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SplitLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitLogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.prod.SplitLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

