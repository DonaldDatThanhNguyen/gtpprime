/**
 * 
 */
package org.protocol.gtp.prime.messages;

import org.protocol.gtp.prime.GtpPrimeHeader;
import org.protocol.gtp.prime.GtpPrimeInformationElement;
import org.protocol.gtp.prime.GtpPrimeMessage;
import org.protocol.gtp.prime.constants.GtpPrimeConstants;
import org.protocol.gtp.prime.iet.GtpPrimeInformationElementTV;

/**
 * @author krychu
 *
 */
public class GtpPrimeDataRecordTransferResponse extends GtpPrimeMessage {

	/**
	 * 
	 */
	public GtpPrimeDataRecordTransferResponse(short cause) {
		super();
		this.getHeader().setMessageType(
				GtpPrimeConstants.GTP_PRIME_DATA_RECORD_TRANSFER_RESPONSE);
		this.addInformationElement(new GtpPrimeInformationElementTV(
				GtpPrimeConstants.GTP_PRIME_IET_CAUSE,
				cause));
	}

	/**
	 * @param header
	 * @param message
	 */
	public GtpPrimeDataRecordTransferResponse(GtpPrimeHeader header,
			byte[] message) {
		super(header, message);
	}

}
