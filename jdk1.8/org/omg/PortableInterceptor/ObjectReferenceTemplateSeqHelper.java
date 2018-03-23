package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceTemplateSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8/2238/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, March 4, 2014 3:47:39 AM PST
*/


/** Sequence of object reference templates is used for reporting state
   * changes that do not occur on the adapter manager.
   */
abstract public class ObjectReferenceTemplateSeqHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/ObjectReferenceTemplateSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.ObjectReferenceTemplate[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.ObjectReferenceTemplate[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.PortableInterceptor.ObjectReferenceTemplateHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper.id (), "ObjectReferenceTemplateSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.ObjectReferenceTemplate[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.PortableInterceptor.ObjectReferenceTemplate value[] = null;
    int _len0 = istream.read_long ();
    value = new org.omg.PortableInterceptor.ObjectReferenceTemplate[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.omg.PortableInterceptor.ObjectReferenceTemplateHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.ObjectReferenceTemplate[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.omg.PortableInterceptor.ObjectReferenceTemplateHelper.write (ostream, value[_i0]);
  }

}
