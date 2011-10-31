/**
 * 
 */
package org.protocol.gtp.prime.messages;

import org.protocol.gtp.prime.GtpPrimeHeader;
import org.protocol.gtp.prime.constants.GtpPrimeConstants;
import org.protocol.gtp.prime.iet.GtpPrimeInformationElementTV;

/**
 * @author krychu
 *
 */
public class GtpPrimeDataRecordTransferCDRDuplRequest extends
		GtpPrimeDataRecordTransferCDRRequestBase {

	/**
	 * 
	 */
	public GtpPrimeDataRecordTransferCDRDuplRequest() {
		super();
		this.addInformationElement(new GtpPrimeInformationElementTV(
				GtpPrimeConstants.GTP_PRIME_IET_PACKET_TRANSFER_COMMAND,
				GtpPrimeConstants.GTP_PRIME_IET_PTC_SEND_DUPLDATA));
	}

	/**
	 * @param header
	 * @param message
	 */
	public GtpPrimeDataRecordTransferCDRDuplRequest(GtpPrimeHeader header,
			byte[] message) {
		super(header, message);
		// TODO Auto-generated constructor stub
	}

}
