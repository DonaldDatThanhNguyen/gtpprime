/**
 * 
 */
package org.protocol.gtp.prime.iet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.protocol.gtp.prime.GtpPrimeInformationElement;

/**
 * @author krychu
 * 
 */
public class GtpPrimeInformationElementTLV extends GtpPrimeInformationElement {

	byte[] arr;
	
	/*
	 *
	 */
	public GtpPrimeInformationElementTLV(byte[] arr, int startIndex) {
		super(arr[startIndex]);
		int length = (arr[startIndex+1] << 8) + arr[startIndex+2];		
		this.arr = Arrays.copyOfRange(arr, startIndex+3, startIndex+3+length);
	}

	public GtpPrimeInformationElementTLV(short type, byte[] arr) {
		super(type);
		this.arr = arr;
	}	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.protocol.gtp.prime.GtpPrimeInformationElement#toByteArray()
	 */
	@Override
	public byte[] toByteArray() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		try {
			out.write((byte)type);
			out.write((arr.length >> 8 ) & 0xff);
			out.write(arr.length & 0xff);
			out.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return out.toByteArray();
	}

	public int getTotalSize() {
		return arr.length + 3;
	}
	
}
