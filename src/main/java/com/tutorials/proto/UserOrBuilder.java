// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/user.proto

package com.tutorials.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.tutorials.models.proto.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
   * @return The gender.
   */
  com.tutorials.proto.User.Gender getGender();

  /**
   * <code>int32 visits = 4;</code>
   * @return The visits.
   */
  int getVisits();
}
