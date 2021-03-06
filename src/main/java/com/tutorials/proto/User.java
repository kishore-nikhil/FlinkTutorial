// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/user.proto

package com.tutorials.proto;

/**
 * Protobuf type {@code com.tutorials.models.proto.User}
 */
public final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tutorials.models.proto.User)
    UserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    name_ = "";
    gender_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new User();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private User(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            age_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            gender_ = rawValue;
            break;
          }
          case 32: {

            visits_ = input.readInt32();
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
    return com.tutorials.proto.UsersProto.internal_static_com_tutorials_models_proto_User_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tutorials.proto.UsersProto.internal_static_com_tutorials_models_proto_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tutorials.proto.User.class, com.tutorials.proto.User.Builder.class);
  }

  /**
   * Protobuf enum {@code com.tutorials.models.proto.User.Gender}
   */
  public enum Gender
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MALE = 0;</code>
     */
    MALE(0),
    /**
     * <code>FEMALE = 1;</code>
     */
    FEMALE(1),
    /**
     * <code>OTHER = 2;</code>
     */
    OTHER(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MALE = 0;</code>
     */
    public static final int MALE_VALUE = 0;
    /**
     * <code>FEMALE = 1;</code>
     */
    public static final int FEMALE_VALUE = 1;
    /**
     * <code>OTHER = 2;</code>
     */
    public static final int OTHER_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Gender valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Gender forNumber(int value) {
      switch (value) {
        case 0: return MALE;
        case 1: return FEMALE;
        case 2: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Gender>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Gender> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Gender>() {
            public Gender findValueByNumber(int number) {
              return Gender.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.tutorials.proto.User.getDescriptor().getEnumTypes().get(0);
    }

    private static final Gender[] VALUES = values();

    public static Gender valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Gender(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.tutorials.models.proto.User.Gender)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private int age_;
  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  @java.lang.Override
  public int getAge() {
    return age_;
  }

  public static final int GENDER_FIELD_NUMBER = 3;
  private int gender_;
  /**
   * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
   * @return The enum numeric value on the wire for gender.
   */
  @java.lang.Override public int getGenderValue() {
    return gender_;
  }
  /**
   * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
   * @return The gender.
   */
  @java.lang.Override public com.tutorials.proto.User.Gender getGender() {
    @SuppressWarnings("deprecation")
    com.tutorials.proto.User.Gender result = com.tutorials.proto.User.Gender.valueOf(gender_);
    return result == null ? com.tutorials.proto.User.Gender.UNRECOGNIZED : result;
  }

  public static final int VISITS_FIELD_NUMBER = 4;
  private int visits_;
  /**
   * <code>int32 visits = 4;</code>
   * @return The visits.
   */
  @java.lang.Override
  public int getVisits() {
    return visits_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (age_ != 0) {
      output.writeInt32(2, age_);
    }
    if (gender_ != com.tutorials.proto.User.Gender.MALE.getNumber()) {
      output.writeEnum(3, gender_);
    }
    if (visits_ != 0) {
      output.writeInt32(4, visits_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, age_);
    }
    if (gender_ != com.tutorials.proto.User.Gender.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, gender_);
    }
    if (visits_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, visits_);
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
    if (!(obj instanceof com.tutorials.proto.User)) {
      return super.equals(obj);
    }
    com.tutorials.proto.User other = (com.tutorials.proto.User) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (gender_ != other.gender_) return false;
    if (getVisits()
        != other.getVisits()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + gender_;
    hash = (37 * hash) + VISITS_FIELD_NUMBER;
    hash = (53 * hash) + getVisits();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tutorials.proto.User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tutorials.proto.User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tutorials.proto.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tutorials.proto.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tutorials.proto.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tutorials.proto.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tutorials.proto.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tutorials.proto.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tutorials.proto.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tutorials.proto.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tutorials.proto.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tutorials.proto.User parseFrom(
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
  public static Builder newBuilder(com.tutorials.proto.User prototype) {
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
   * Protobuf type {@code com.tutorials.models.proto.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tutorials.models.proto.User)
      com.tutorials.proto.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tutorials.proto.UsersProto.internal_static_com_tutorials_models_proto_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tutorials.proto.UsersProto.internal_static_com_tutorials_models_proto_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tutorials.proto.User.class, com.tutorials.proto.User.Builder.class);
    }

    // Construct using com.tutorials.proto.User.newBuilder()
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
      name_ = "";

      age_ = 0;

      gender_ = 0;

      visits_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tutorials.proto.UsersProto.internal_static_com_tutorials_models_proto_User_descriptor;
    }

    @java.lang.Override
    public com.tutorials.proto.User getDefaultInstanceForType() {
      return com.tutorials.proto.User.getDefaultInstance();
    }

    @java.lang.Override
    public com.tutorials.proto.User build() {
      com.tutorials.proto.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tutorials.proto.User buildPartial() {
      com.tutorials.proto.User result = new com.tutorials.proto.User(this);
      result.name_ = name_;
      result.age_ = age_;
      result.gender_ = gender_;
      result.visits_ = visits_;
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
      if (other instanceof com.tutorials.proto.User) {
        return mergeFrom((com.tutorials.proto.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tutorials.proto.User other) {
      if (other == com.tutorials.proto.User.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (other.gender_ != 0) {
        setGenderValue(other.getGenderValue());
      }
      if (other.getVisits() != 0) {
        setVisits(other.getVisits());
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
      com.tutorials.proto.User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tutorials.proto.User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 2;</code>
     * @param value The age to set.
     * @return This builder for chaining.
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private int gender_ = 0;
    /**
     * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
     * @return The enum numeric value on the wire for gender.
     */
    @java.lang.Override public int getGenderValue() {
      return gender_;
    }
    /**
     * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
     * @param value The enum numeric value on the wire for gender to set.
     * @return This builder for chaining.
     */
    public Builder setGenderValue(int value) {
      
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
     * @return The gender.
     */
    @java.lang.Override
    public com.tutorials.proto.User.Gender getGender() {
      @SuppressWarnings("deprecation")
      com.tutorials.proto.User.Gender result = com.tutorials.proto.User.Gender.valueOf(gender_);
      return result == null ? com.tutorials.proto.User.Gender.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(com.tutorials.proto.User.Gender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.tutorials.models.proto.User.Gender gender = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }

    private int visits_ ;
    /**
     * <code>int32 visits = 4;</code>
     * @return The visits.
     */
    @java.lang.Override
    public int getVisits() {
      return visits_;
    }
    /**
     * <code>int32 visits = 4;</code>
     * @param value The visits to set.
     * @return This builder for chaining.
     */
    public Builder setVisits(int value) {
      
      visits_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 visits = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVisits() {
      
      visits_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.tutorials.models.proto.User)
  }

  // @@protoc_insertion_point(class_scope:com.tutorials.models.proto.User)
  private static final com.tutorials.proto.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tutorials.proto.User();
  }

  public static com.tutorials.proto.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    @java.lang.Override
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new User(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tutorials.proto.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

