/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.actordb.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-16")
public class ReadResult implements org.apache.thrift.TBase<ReadResult, ReadResult._Fields>, java.io.Serializable, Cloneable, Comparable<ReadResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReadResult");

  private static final org.apache.thrift.protocol.TField HAS_MORE_FIELD_DESC = new org.apache.thrift.protocol.TField("hasMore", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("rows", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReadResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReadResultTupleSchemeFactory());
  }

  public boolean hasMore; // required
  public List<String> columns; // required
  public List<Map<String,Val>> rows; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HAS_MORE((short)1, "hasMore"),
    COLUMNS((short)2, "columns"),
    ROWS((short)3, "rows");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HAS_MORE
          return HAS_MORE;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // ROWS
          return ROWS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASMORE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HAS_MORE, new org.apache.thrift.meta_data.FieldMetaData("hasMore", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ROWS, new org.apache.thrift.meta_data.FieldMetaData("rows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Val.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReadResult.class, metaDataMap);
  }

  public ReadResult() {
  }

  public ReadResult(
    boolean hasMore,
    List<String> columns,
    List<Map<String,Val>> rows)
  {
    this();
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
    this.columns = columns;
    this.rows = rows;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReadResult(ReadResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hasMore = other.hasMore;
    if (other.isSetColumns()) {
      List<String> __this__columns = new ArrayList<String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetRows()) {
      List<Map<String,Val>> __this__rows = new ArrayList<Map<String,Val>>(other.rows.size());
      for (Map<String,Val> other_element : other.rows) {
        Map<String,Val> __this__rows_copy = new HashMap<String,Val>(other_element.size());
        for (Map.Entry<String, Val> other_element_element : other_element.entrySet()) {

          String other_element_element_key = other_element_element.getKey();
          Val other_element_element_value = other_element_element.getValue();

          String __this__rows_copy_copy_key = other_element_element_key;

          Val __this__rows_copy_copy_value = new Val(other_element_element_value);

          __this__rows_copy.put(__this__rows_copy_copy_key, __this__rows_copy_copy_value);
        }
        __this__rows.add(__this__rows_copy);
      }
      this.rows = __this__rows;
    }
  }

  public ReadResult deepCopy() {
    return new ReadResult(this);
  }

  @Override
  public void clear() {
    setHasMoreIsSet(false);
    this.hasMore = false;
    this.columns = null;
    this.rows = null;
  }

  public boolean isHasMore() {
    return this.hasMore;
  }

  public ReadResult setHasMore(boolean hasMore) {
    this.hasMore = hasMore;
    setHasMoreIsSet(true);
    return this;
  }

  public void unsetHasMore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  /** Returns true if field hasMore is set (has been assigned a value) and false otherwise */
  public boolean isSetHasMore() {
    return EncodingUtils.testBit(__isset_bitfield, __HASMORE_ISSET_ID);
  }

  public void setHasMoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASMORE_ISSET_ID, value);
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(String elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(elem);
  }

  public List<String> getColumns() {
    return this.columns;
  }

  public ReadResult setColumns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getRowsSize() {
    return (this.rows == null) ? 0 : this.rows.size();
  }

  public java.util.Iterator<Map<String,Val>> getRowsIterator() {
    return (this.rows == null) ? null : this.rows.iterator();
  }

  public void addToRows(Map<String,Val> elem) {
    if (this.rows == null) {
      this.rows = new ArrayList<Map<String,Val>>();
    }
    this.rows.add(elem);
  }

  public List<Map<String,Val>> getRows() {
    return this.rows;
  }

  public ReadResult setRows(List<Map<String,Val>> rows) {
    this.rows = rows;
    return this;
  }

  public void unsetRows() {
    this.rows = null;
  }

  /** Returns true if field rows is set (has been assigned a value) and false otherwise */
  public boolean isSetRows() {
    return this.rows != null;
  }

  public void setRowsIsSet(boolean value) {
    if (!value) {
      this.rows = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HAS_MORE:
      if (value == null) {
        unsetHasMore();
      } else {
        setHasMore((Boolean)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<String>)value);
      }
      break;

    case ROWS:
      if (value == null) {
        unsetRows();
      } else {
        setRows((List<Map<String,Val>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HAS_MORE:
      return isHasMore();

    case COLUMNS:
      return getColumns();

    case ROWS:
      return getRows();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HAS_MORE:
      return isSetHasMore();
    case COLUMNS:
      return isSetColumns();
    case ROWS:
      return isSetRows();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReadResult)
      return this.equals((ReadResult)that);
    return false;
  }

  public boolean equals(ReadResult that) {
    if (that == null)
      return false;

    boolean this_present_hasMore = true;
    boolean that_present_hasMore = true;
    if (this_present_hasMore || that_present_hasMore) {
      if (!(this_present_hasMore && that_present_hasMore))
        return false;
      if (this.hasMore != that.hasMore)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_rows = true && this.isSetRows();
    boolean that_present_rows = true && that.isSetRows();
    if (this_present_rows || that_present_rows) {
      if (!(this_present_rows && that_present_rows))
        return false;
      if (!this.rows.equals(that.rows))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hasMore = true;
    list.add(present_hasMore);
    if (present_hasMore)
      list.add(hasMore);

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_rows = true && (isSetRows());
    list.add(present_rows);
    if (present_rows)
      list.add(rows);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReadResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHasMore()).compareTo(other.isSetHasMore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasMore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasMore, other.hasMore);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRows()).compareTo(other.isSetRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows, other.rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReadResult(");
    boolean first = true;

    sb.append("hasMore:");
    sb.append(this.hasMore);
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rows:");
    if (this.rows == null) {
      sb.append("null");
    } else {
      sb.append(this.rows);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'hasMore' because it's a primitive and you chose the non-beans generator.
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    if (rows == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rows' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReadResultStandardSchemeFactory implements SchemeFactory {
    public ReadResultStandardScheme getScheme() {
      return new ReadResultStandardScheme();
    }
  }

  private static class ReadResultStandardScheme extends StandardScheme<ReadResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReadResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HAS_MORE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasMore = iprot.readBool();
              struct.setHasMoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.columns = new ArrayList<String>(_list16.size);
                String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.columns.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.rows = new ArrayList<Map<String,Val>>(_list19.size);
                Map<String,Val> _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  {
                    org.apache.thrift.protocol.TMap _map22 = iprot.readMapBegin();
                    _elem20 = new HashMap<String,Val>(2*_map22.size);
                    String _key23;
                    Val _val24;
                    for (int _i25 = 0; _i25 < _map22.size; ++_i25)
                    {
                      _key23 = iprot.readString();
                      _val24 = new Val();
                      _val24.read(iprot);
                      _elem20.put(_key23, _val24);
                    }
                    iprot.readMapEnd();
                  }
                  struct.rows.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHasMore()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'hasMore' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReadResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
      oprot.writeBool(struct.hasMore);
      oprot.writeFieldEnd();
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (String _iter26 : struct.columns)
          {
            oprot.writeString(_iter26);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rows != null) {
        oprot.writeFieldBegin(ROWS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, struct.rows.size()));
          for (Map<String,Val> _iter27 : struct.rows)
          {
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _iter27.size()));
              for (Map.Entry<String, Val> _iter28 : _iter27.entrySet())
              {
                oprot.writeString(_iter28.getKey());
                _iter28.getValue().write(oprot);
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReadResultTupleSchemeFactory implements SchemeFactory {
    public ReadResultTupleScheme getScheme() {
      return new ReadResultTupleScheme();
    }
  }

  private static class ReadResultTupleScheme extends TupleScheme<ReadResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.hasMore);
      {
        oprot.writeI32(struct.columns.size());
        for (String _iter29 : struct.columns)
        {
          oprot.writeString(_iter29);
        }
      }
      {
        oprot.writeI32(struct.rows.size());
        for (Map<String,Val> _iter30 : struct.rows)
        {
          {
            oprot.writeI32(_iter30.size());
            for (Map.Entry<String, Val> _iter31 : _iter30.entrySet())
            {
              oprot.writeString(_iter31.getKey());
              _iter31.getValue().write(oprot);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReadResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.hasMore = iprot.readBool();
      struct.setHasMoreIsSet(true);
      {
        org.apache.thrift.protocol.TList _list32 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.columns = new ArrayList<String>(_list32.size);
        String _elem33;
        for (int _i34 = 0; _i34 < _list32.size; ++_i34)
        {
          _elem33 = iprot.readString();
          struct.columns.add(_elem33);
        }
      }
      struct.setColumnsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list35 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, iprot.readI32());
        struct.rows = new ArrayList<Map<String,Val>>(_list35.size);
        Map<String,Val> _elem36;
        for (int _i37 = 0; _i37 < _list35.size; ++_i37)
        {
          {
            org.apache.thrift.protocol.TMap _map38 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            _elem36 = new HashMap<String,Val>(2*_map38.size);
            String _key39;
            Val _val40;
            for (int _i41 = 0; _i41 < _map38.size; ++_i41)
            {
              _key39 = iprot.readString();
              _val40 = new Val();
              _val40.read(iprot);
              _elem36.put(_key39, _val40);
            }
          }
          struct.rows.add(_elem36);
        }
      }
      struct.setRowsIsSet(true);
    }
  }

}

