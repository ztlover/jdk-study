package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8/2238/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, March 4, 2014 3:47:39 AM PST
*/

public final class InvalidTypeForEncoding extends org.omg.CORBA.UserException
{

  public InvalidTypeForEncoding ()
  {
    super(InvalidTypeForEncodingHelper.id());
  } // ctor


  public InvalidTypeForEncoding (String $reason)
  {
    super(InvalidTypeForEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidTypeForEncoding
