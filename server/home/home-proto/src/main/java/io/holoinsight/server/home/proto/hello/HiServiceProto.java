/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: HiService.proto

package io.holoinsight.server.home.proto.hello;

public final class HiServiceProto {
  private HiServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor internal_static_scheduler_HelloRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_scheduler_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor internal_static_scheduler_HelloRequest_TagsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_scheduler_HelloRequest_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor internal_static_scheduler_HelloResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_scheduler_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    String[] descriptorData = {"\n\017HiService.proto\022\tscheduler\"\230\001\n\014HelloRe"
        + "quest\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\017\n\007hobb"
        + "ies\030\003 \003(\t\022/\n\004tags\030\004 \003(\0132!.scheduler.Hell"
        + "oRequest.TagsEntry\032+\n\tTagsEntry\022\013\n\003key\030\001"
        + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"!\n\rHelloResponse"
        + "\022\020\n\010greeting\030\001 \001(\t2J\n\014HelloService\022:\n\005he"
        + "llo\022\027.scheduler.HelloRequest\032\030.scheduler"
        + ".HelloResponseB<\n(com.alipay.cloudmonito"
        + "r.prod.proto.helloB\016HiServiceProtoP\001b\006pr" + "oto3"};
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_scheduler_HelloRequest_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_scheduler_HelloRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_scheduler_HelloRequest_descriptor,
            new String[] {"Name", "Age", "Hobbies", "Tags",});
    internal_static_scheduler_HelloRequest_TagsEntry_descriptor =
        internal_static_scheduler_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_scheduler_HelloRequest_TagsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_scheduler_HelloRequest_TagsEntry_descriptor,
            new String[] {"Key", "Value",});
    internal_static_scheduler_HelloResponse_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_scheduler_HelloResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_scheduler_HelloResponse_descriptor, new String[] {"Greeting",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}