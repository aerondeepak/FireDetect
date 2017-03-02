package com.srk.pkg;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'OscilloscopeMsg'
 * message type.
 */

public class OscilloscopeMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 12;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 6;

    /** Create a new OscilloscopeMsg of size 12. */
    public OscilloscopeMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new OscilloscopeMsg of the given data_length. */
    public OscilloscopeMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg with the given data_length
     * and base offset.
     */
    public OscilloscopeMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg using the given byte array
     * as backing store.
     */
    public OscilloscopeMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public OscilloscopeMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public OscilloscopeMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg embedded in the given message
     * at the given base offset.
     */
    public OscilloscopeMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new OscilloscopeMsg embedded in the given message
     * at the given base offset and length.
     */
    public OscilloscopeMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <OscilloscopeMsg> \n";
      try {
        s += "  [node_id=0x"+Long.toHexString(get_node_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [tempval=0x"+Long.toHexString(get_tempval())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [Des_id=";
        for (int i = 0; i < 2; i++) {
          s += "0x"+Long.toHexString(getElement_Des_id(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [R1.node_id=0x"+Long.toHexString(get_R1_node_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [R1.tempval=0x"+Long.toHexString(get_R1_tempval())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: node_id
    //   Field type: int
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'node_id' is signed (false).
     */
    public static boolean isSigned_node_id() {
        return false;
    }

    /**
     * Return whether the field 'node_id' is an array (false).
     */
    public static boolean isArray_node_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'node_id'
     */
    public static int offset_node_id() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'node_id'
     */
    public static int offsetBits_node_id() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'node_id'
     */
    public int get_node_id() {
        return (int)getUIntBEElement(offsetBits_node_id(), 16);
    }

    /**
     * Set the value of the field 'node_id'
     */
    public void set_node_id(int value) {
        setUIntBEElement(offsetBits_node_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'node_id'
     */
    public static int size_node_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'node_id'
     */
    public static int sizeBits_node_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: tempval
    //   Field type: int
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'tempval' is signed (false).
     */
    public static boolean isSigned_tempval() {
        return false;
    }

    /**
     * Return whether the field 'tempval' is an array (false).
     */
    public static boolean isArray_tempval() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'tempval'
     */
    public static int offset_tempval() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'tempval'
     */
    public static int offsetBits_tempval() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'tempval'
     */
    public int get_tempval() {
        return (int)getUIntBEElement(offsetBits_tempval(), 16);
    }

    /**
     * Set the value of the field 'tempval'
     */
    public void set_tempval(int value) {
        setUIntBEElement(offsetBits_tempval(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'tempval'
     */
    public static int size_tempval() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'tempval'
     */
    public static int sizeBits_tempval() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: Des_id
    //   Field type: int[]
    //   Offset (bits): 32
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'Des_id' is signed (false).
     */
    public static boolean isSigned_Des_id() {
        return false;
    }

    /**
     * Return whether the field 'Des_id' is an array (true).
     */
    public static boolean isArray_Des_id() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'Des_id'
     */
    public static int offset_Des_id(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 2) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'Des_id'
     */
    public static int offsetBits_Des_id(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 2) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return offset;
    }

    /**
     * Return the entire array 'Des_id' as a int[]
     */
    public int[] get_Des_id() {
        int[] tmp = new int[2];
        for (int index0 = 0; index0 < numElements_Des_id(0); index0++) {
            tmp[index0] = getElement_Des_id(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'Des_id' from the given int[]
     */
    public void set_Des_id(int[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_Des_id(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a int) of the array 'Des_id'
     */
    public int getElement_Des_id(int index1) {
        return (int)getUIntBEElement(offsetBits_Des_id(index1), 16);
    }

    /**
     * Set an element of the array 'Des_id'
     */
    public void setElement_Des_id(int index1, int value) {
        setUIntBEElement(offsetBits_Des_id(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'Des_id'
     */
    public static int totalSize_Des_id() {
        return (32 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'Des_id'
     */
    public static int totalSizeBits_Des_id() {
        return 32;
    }

    /**
     * Return the size, in bytes, of each element of the array 'Des_id'
     */
    public static int elementSize_Des_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'Des_id'
     */
    public static int elementSizeBits_Des_id() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'Des_id'
     */
    public static int numDimensions_Des_id() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'Des_id'
     */
    public static int numElements_Des_id() {
        return 2;
    }

    /**
     * Return the number of elements in the array 'Des_id'
     * for the given dimension.
     */
    public static int numElements_Des_id(int dimension) {
      int array_dims[] = { 2,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: R1.node_id
    //   Field type: int
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'R1.node_id' is signed (false).
     */
    public static boolean isSigned_R1_node_id() {
        return false;
    }

    /**
     * Return whether the field 'R1.node_id' is an array (false).
     */
    public static boolean isArray_R1_node_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'R1.node_id'
     */
    public static int offset_R1_node_id() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'R1.node_id'
     */
    public static int offsetBits_R1_node_id() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'R1.node_id'
     */
    public int get_R1_node_id() {
        return (int)getUIntBEElement(offsetBits_R1_node_id(), 16);
    }

    /**
     * Set the value of the field 'R1.node_id'
     */
    public void set_R1_node_id(int value) {
        setUIntBEElement(offsetBits_R1_node_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'R1.node_id'
     */
    public static int size_R1_node_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'R1.node_id'
     */
    public static int sizeBits_R1_node_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: R1.tempval
    //   Field type: int
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'R1.tempval' is signed (false).
     */
    public static boolean isSigned_R1_tempval() {
        return false;
    }

    /**
     * Return whether the field 'R1.tempval' is an array (false).
     */
    public static boolean isArray_R1_tempval() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'R1.tempval'
     */
    public static int offset_R1_tempval() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'R1.tempval'
     */
    public static int offsetBits_R1_tempval() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'R1.tempval'
     */
    public int get_R1_tempval() {
        return (int)getUIntBEElement(offsetBits_R1_tempval(), 16);
    }

    /**
     * Set the value of the field 'R1.tempval'
     */
    public void set_R1_tempval(int value) {
        setUIntBEElement(offsetBits_R1_tempval(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'R1.tempval'
     */
    public static int size_R1_tempval() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'R1.tempval'
     */
    public static int sizeBits_R1_tempval() {
        return 16;
    }

}
