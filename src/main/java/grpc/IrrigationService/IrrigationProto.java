// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Irrigation.proto

package grpc.IrrigationService;

public final class IrrigationProto {
  private IrrigationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smartagri_irrigation_IrrigationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smartagri_irrigation_IrrigationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smartagri_irrigation_IrrigationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smartagri_irrigation_IrrigationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Irrigation.proto\022\030com.smartagri.irriga" +
      "tion\032\037google/protobuf/timestamp.proto\"G\n" +
      "\021IrrigationRequest\022\017\n\007farm_id\030\001 \001(\t\022\017\n\007z" +
      "one_id\030\002 \001(\t\022\020\n\010duration\030\003 \001(\t\"6\n\022Irriga" +
      "tionResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007message" +
      "\030\002 \001(\t2\356\001\n\021IrrigationService\022l\n\017StartIrr" +
      "igation\022+.com.smartagri.irrigation.Irrig" +
      "ationRequest\032,.com.smartagri.irrigation." +
      "IrrigationResponse\022k\n\016StopIrrigation\022+.c" +
      "om.smartagri.irrigation.IrrigationReques" +
      "t\032,.com.smartagri.irrigation.IrrigationR" +
      "esponseB+\n\026grpc.IrrigationServiceB\017Irrig" +
      "ationProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_smartagri_irrigation_IrrigationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_smartagri_irrigation_IrrigationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smartagri_irrigation_IrrigationRequest_descriptor,
        new java.lang.String[] { "FarmId", "ZoneId", "Duration", });
    internal_static_com_smartagri_irrigation_IrrigationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_smartagri_irrigation_IrrigationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smartagri_irrigation_IrrigationResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
